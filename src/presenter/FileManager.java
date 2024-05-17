package presenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;


import com.thoughtworks.xstream.io.json.JsonWriter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonValue;


import model.Customer;
import model.Product;
import model.Worker;

public class FileManager {

    private File productsFile;
    private File workersFile;
    private File customersFile;
    private File usersFile;
    private Properties prop;

    public FileManager(){
        productsFile = new File("files/productsFile.xml");
        workersFile = new File("files/workersFile.xml");
        customersFile = new File("files/customersFile.json");
        usersFile = new File("files/usersFile.properties");
        prop= new Properties();
    }


    /**
     * Añade un trabajador con su contraseña
     * @param name usuario del trabajador
     */
    public void addUser(String user,String pass){
        prop.setProperty(user, pass);
        try{
            prop.store(new FileWriter(usersFile), null);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Obtiene la contraseña de un usuario
     * @param user el usuario
     * @return la contraseña
     * @throws IOException si el archivo no se puede leer
     */
    public String readUser(String user){
        try {
            prop.load(new FileInputStream(usersFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(user);
    }

    /**
     * Añade un cliente a el archivo de clientes
     * @param customer el cliente a agregar
     * @throws IOException si el archivo no existe o no se puede leer  
     */
    public void addCustomer(Customer customer){
        try {
            JsonArray array = Json.createArrayBuilder().build();
            if(customersFile.length()>0){
                FileInputStream fis = new FileInputStream(customersFile);
                JsonReader jReader= Json.createReader(fis);
                JsonObject root=jReader.readObject();
                fis.close();
                array = root.getJsonArray("customers");    
            }
            JsonObjectBuilder object = Json.createObjectBuilder();
            object.add("id", customer.getId());
            object.add("name", customer.getName());

            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            for(JsonValue value : array)
                arrayBuilder.add(value.asJsonObject());

            arrayBuilder.add(object);

            JsonObjectBuilder rootBuilder = Json.createObjectBuilder();
            rootBuilder.add("customers", arrayBuilder.build());

	        OutputStream os = new FileOutputStream(customersFile);
	        javax.json.JsonWriter jsonWriter = Json.createWriter(os);
			jsonWriter.writeObject(rootBuilder.build());
	        jsonWriter.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
    
    
    /**
     * Lee el archivo de clientes
     * @return la lista de clientes
     * @throws IOException si el archivo no se puede leer
     */
    public ArrayList<Customer> readCustomers(){
        ArrayList<Customer> customers = new ArrayList<Customer>();
        if (customersFile.length() == 0)
            return customers;
        
        try{
    		FileInputStream fis = new FileInputStream(customersFile);
    		JsonReader jreader= Json.createReader(fis);
    		JsonObject root=jreader.readObject();
            fis.close();
            JsonArray array = root.getJsonArray("customers");
            for(JsonValue value : array) {
                JsonObject object = value.asJsonObject();
                int id = object.getInt("id");
                String name = object.getString("name");
                Customer customer= new Customer(id, name);
                customers.add(customer);
            }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return customers;
    }

    /**
     * Añade un producto a el archivo de productos
    * @param product el producto a agregar
    * @param category la categoria a la que pertenece el producto
     */
    public void addProductFile(Product product,String category){
        try {
            String xml=addProductToXml(category, product);
            FileWriter fw = new FileWriter(productsFile);
            fw.write(xml); 
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String addProductToXml(String category , Product product) { 
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        if(productsFile.length()==0){
           HashMap<String, ArrayList<Product>> catalog = new HashMap<>();
            ArrayList<Product> products = new ArrayList<Product>();
            products.add(product);
            catalog.put(category, products);
            return xstream.toXML(catalog);
        }
        HashMap<String, ArrayList<Product>> catalog = readProducts();
        ArrayList<Product> products = catalog.get(category);
        products.add(product);
        catalog.put(category, products);
        return xstream.toXML(catalog);
    } 

    /**
     * Lee el archivo de productos
     * @return el catalogo de productos
     */
    public HashMap<String, ArrayList<Product>> readProducts(){
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        HashMap<String, ArrayList<Product>> catalog = (HashMap<String, ArrayList<Product>>) xstream.fromXML(productsFile);
        return catalog;
    }

    /**
     * Añade un trabajador a el archivo de trabajadores
     * @param worker el trabajador a agregar
     */
    public void addWorkerFile(Worker worker){
        try {
            String xml=addWorkerToXml(worker);
            FileWriter fw = new FileWriter(workersFile);
            fw.write(xml); 
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private String addWorkerToXml(Worker worker) throws IOException {
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        if(workersFile.length()<=3){
           List<Worker> workers = new ArrayList<>();
            workers.add(worker);
            return xstream.toXML(workers);
        }
        List<Worker> workers = readWorkers();
        workers.add(worker);
        return xstream.toXML(workers);
    }


    /**
     * Lee el archivo de trabajadores
     * @return la lista de trabajadores
     */
    public List<Worker> readWorkers(){
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        List<Worker> workers= (List<Worker>) xstream.fromXML(workersFile);
        return workers;
    } 
}

package presenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import model.Product;
import model.Worker;

public class FileManager {

    private File productsFile;
    private File workersFile;
    private File customersFile;

    public FileManager(){
        productsFile = new File("files/productsFile.xml");
        workersFile = new File("files/workersFile.xml");
    }

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

    public HashMap<String, ArrayList<Product>> readProducts(){
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        HashMap<String, ArrayList<Product>> catalog = (HashMap<String, ArrayList<Product>>) xstream.fromXML(productsFile);
        return catalog;
    }


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
        if(workersFile.length()==3){
           List<Worker> workers = new ArrayList<>();
            workers.add(worker);
            return xstream.toXML(workers);
        }
        List<Worker> workers = readWorkers();
        workers.add(worker);
        return xstream.toXML(workers);
    }

    public List<Worker> readWorkers(){
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("product", Product.class);
        xstream.alias("category", String.class);
        List<Worker> workers= (List<Worker>) xstream.fromXML(workersFile);
        return workers;
    } 
}

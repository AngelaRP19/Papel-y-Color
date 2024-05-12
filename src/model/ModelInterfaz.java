package model;

import java.util.ArrayList;
import java.util.HashMap;

public interface ModelInterfaz {

	public void addProduct(Product product, String category);
	public void addCustomer(Customer customer);
	public HashMap<String,ArrayList<Product>> showCatalog();
	public Bill newBill(int idWorker, int idCustomer,ArrayList<Product> products);
	public int calculateSalary(int id);
	public void addUnitsProduct(int units, int id);
}

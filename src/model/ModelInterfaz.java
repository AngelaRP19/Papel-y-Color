package model;

import java.util.ArrayList;

public interface ModelInterfaz {

	public void addProduct(Product product, String category);
	public void addCustomer(Customer customer);
	public void showCatalog();
	public Bill newBill(int idWorker, ArrayList<Product> products);
	public void calculateSalary(int id);
	public void addUnitsProduct(int units, int id);
}

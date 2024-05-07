package model;

import java.util.ArrayList;
import java.util.HashMap;

public class System implements ModelInterfaz {

	private ArrayList<Worker> workers;
	private ArrayList<Customer> customers;
	private HashMap<String, ArrayList<Product>> catalog;
	
	@Override
	public void addProduct(Product product, String category) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showCatalog() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Bill newBill(int idWorker, ArrayList<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void calculateSalary(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addUnitsProduct(int units, int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}

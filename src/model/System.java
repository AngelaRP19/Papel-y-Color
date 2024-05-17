/*
 * Sistema
 * Clase que representa el sistema
 * se encarga de manejar a lso clientes por medio de un trabajador
 * 
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

public class System implements ModelInterfaz {

	private ArrayList<Worker> workers;
	private ArrayList<Customer> customers;
	private HashMap<String, ArrayList<Product>> catalog;


	public System() {
		workers = new ArrayList<Worker>();
		customers = new ArrayList<Customer>();
		catalog = new HashMap<String, ArrayList<Product>>();
	}
	
	@Override
	public void addProduct(Product product, String categoryName) {
		ArrayList<Product> category=catalog.get(categoryName);
		if(category==null)
			category=new ArrayList<Product>();
		category.add(product);
		catalog.put(categoryName, category);
	}
	
	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	@Override
	public HashMap<String,ArrayList<Product>> showCatalog(){
		return catalog;
	}
	@Override
	public Bill newBill(int idWorker,int idCustomer, ArrayList<Product> products,int cash) {
		Customer customer=searchCustomer(idCustomer);
		Worker worker=searchWorker(idWorker);
		Bill bill = new Bill( products, customer, worker, 0.0);
		return bill;
	}

	public Customer searchCustomer(int id){
		for (Customer customer : customers)
			if(customer.getId()==id)
				return customer;
		return null;
	}
	public Worker searchWorker(int id){
		for (Worker worker : workers)
			if(worker.getId()==id)
				return worker;
		return null;
	}

	@Override
	public int calculateSalary(int id){
		Worker worker=searchWorker(id);
		int salary=0;
		for (Bill bill : worker.getSells())
			salary+=bill.getTotalValue();
		return salary;
	}

	@Override
	public void addUnitsProduct(int units, int id) {
		for (String i : catalog.keySet()) {
			for(Product product : catalog.get(i)){
				if(product.getCode()==id){
					product.setUnits(product.getUnits()+units);
					return;
				}
			}
		}
	}
}

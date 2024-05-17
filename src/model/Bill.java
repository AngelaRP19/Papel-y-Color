/**
 * Factura
 * Crea una factura a partir de los productos seleccionados por el cliente
 * Genera  el precio y el cambio 
 */
package model;

import java.time.LocalDate;
import java.util.List;

public class Bill {

	private int id;
	private LocalDate date;
	private List<Product> purchasedProducts;
	private Customer customer;
	private Worker worker;
	private Double totalValue;
	private Double cash;
	private Double change;
	private static int numberBill = 0;
	
	
	public Bill(List<Product> purchasedProducts, Customer customer, Worker worker, Double cash) {
		this.id = numberBill;
		this.date = LocalDate.now();
		this.purchasedProducts = purchasedProducts;
		this.customer = customer;
		this.worker = worker;
		this.cash = cash;
		this.totalValue = calculateTotalValue();
		numberBill++;
	}

	public double calculateTotalValue(){
		double total = 0.0;
		for (Product product : purchasedProducts)
			total += product.getPrice();
		return total;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public List<Product> getPurchasedProducts() {
		return purchasedProducts;
	}


	public void setPurchasedProducts(List<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Worker getWorker() {
		return worker;
	}


	public void setWorker(Worker worker) {
		this.worker = worker;
	}


	public Double getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}


	public Double getCash() {
		return cash;
	}


	public void setCash(Double cash) {
		this.cash = cash;
	}


	public Double getChange() {
		return change;
	}


	public void setChange(Double change) {
		this.change = change;
	}
	
	
	
}

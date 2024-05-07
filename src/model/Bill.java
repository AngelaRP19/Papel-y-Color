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
	
	
	public Bill(int id,  List<Product> purchasedProducts, Customer customer, Worker worker,
			Double totalValue, Double cash, Double change) {
		super();
		this.id = id;
		this.date = LocalDate.now();
		this.purchasedProducts = purchasedProducts;
		this.customer = customer;
		this.worker = worker;
		this.totalValue = totalValue;
		this.cash = cash;
		this.change = change;
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

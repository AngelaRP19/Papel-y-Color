package model;

import java.util.ArrayList;

public class Worker {
 //SE PUEDE INCLUIR HERENCIA CREANDO UNA CLASE PERSONA
	private int id;
	private String name;
	private String user;
	private String password;
	private Double salary;
	private ArrayList<Bill> sells;
	
	public Worker(int id, String name, String user, String password, Double salary) {

		this.id = id;
		this.name = name;
		this.user = user;
		this.password = password;
		this.salary = salary;
		this.sells = new ArrayList<Bill>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public ArrayList<Bill> getSells() {
		return sells;
	}

	public void setSells(ArrayList<Bill> sells) {
		this.sells = sells;
	}
	
	
}

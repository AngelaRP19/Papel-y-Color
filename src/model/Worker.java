/**
 * Trabajador
 * Clase que representa un trabajador
 * Tiene una lista de ventas
 * Tiene un id, nombre, usuario, contraseña y su salario
 */
package model;

import java.util.ArrayList;

public class Worker extends Person{
	private String user;
	private String password;
	private Double salary;
	private ArrayList<Bill> sells;
	
	public Worker(int id, String name, String user, String password, Double salary){
		super(id,name);
		this.user = user;
		this.password = password;
		this.salary = salary;
		this.sells = new ArrayList<Bill>();
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

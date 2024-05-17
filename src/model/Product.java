/**
 * Producto
 * Clase que representa un producto
 * Tiene un id, nombre, precio, unidades disponibles y unidades vendidas
 */

package model;

public class Product {

	private int code;
	private String name;
	private Double price;
	private int units;
	private int soldUnits;
	
	public Product(int code, String name, Double price, int units, int soldUnits) {
		
		this.code = code;
		this.name = name;
		this.price = price;
		this.units = units;
		this.soldUnits = soldUnits;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getSoldUnits() {
		return soldUnits;
	}

	public void setSoldUnits(int soldUnits) {
		this.soldUnits = soldUnits;
	}
	
	
}

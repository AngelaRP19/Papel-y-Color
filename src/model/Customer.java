/**
 * Cliente
 * Clase que representa un cliente
 * Tiene una lista de facturas
 */
package model;

import java.util.ArrayList;

public class Customer extends Person {

	private ArrayList<Bill> buys;
	
	public Customer(int id, String name) {
		super(id, name);
	}

	/**
	 * Agrega una factura a las compras del cliente
	 * @param buy La factura a agregar
 	 */
	public void addBuy(Bill buy) {
		buys.add(buy);
	}


}

/**
 * Interface para el modelo
 * Clase que representa el modelo
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

public interface ModelInterfaz {
	
	/**
	 * Agrega un producto a una categoría
	 *
	 * @param  product el producto a agregar
	 * @param  categoryName la categoría a la que pertenece el producto
	 */
	public void addProduct(Product product, String category);
	/**
	 * Agrega un cliente
	 * @param customer el cliente a agregar
	 */
	public void addCustomer(Customer customer);
	/**
	 * Obtener productos
	 * @return el catalogo de productos
 	 */
	public HashMap<String,ArrayList<Product>> showCatalog();
	/**
	 * Genera una nueva Factura
	 * @param idWorker el id del trabajador
	 * @param idCustomer el id del cliente
	 * @param products la lista de productos
	 * @param cash el efectivo
	 * @return la nueva Factura
	 */
	public Bill newBill(int idWorker, int idCustomer,ArrayList<Product> products,int cash);
	/**
	 * Calcula el sueldo de un trabajador
	 * @param id id del trabajador
	 * @return el salario
	 */
	public int calculateSalary(int id);
	/**
	 * Añade unidades a un producto existente 
	 * @param units unidades a agregar 
	 * @param id	id del producto
	 */
	public void addUnitsProduct(int units, int id);
}

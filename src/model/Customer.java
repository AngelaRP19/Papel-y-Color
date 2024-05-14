package model;

import java.util.ArrayList;

public class Customer extends Person {

	private ArrayList<Bill> buys;
	
	public Customer(int id, String name) {
		super(id, name);
	}


}

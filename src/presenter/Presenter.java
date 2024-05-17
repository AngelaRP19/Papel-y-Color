package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ModelInterfaz;
import model.Product;
import model.Stationery;
import view.View;
import view.ViewInterfaz;

public class Presenter implements ActionListener , PresenterInterfaz{

	private ModelInterfaz system;
	private ViewInterfaz view;

	public Presenter() {
		system = new Stationery();
		view = new View();
	}
	public void login() {
		view.register();
	}
	@Override
	public void addWorker() {
		view.newWorker();
	}

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCatalog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payWorker() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

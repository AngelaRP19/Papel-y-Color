package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ModelInterfaz;
import view.View;
import view.ViewInterfaz;

public class Presenter implements ActionListener , PresenterInterfaz{

	private ViewInterfaz view;
	private ModelInterfaz system;

	public Presenter(){
		view = new View();
		system= new model.System();
	}

	/*
	 * 
	 * PONER ATRIBUTOS
	 * 
	 * */
	
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
		if(e.getActionCommand().equals("ingresar"));
	}

}

package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame implements ViewInterfaz{


	private JFrame main;
	private JPanel welcome;
	private JPanel login;
	private JPanel addAccount;

	public View() {
		this.main = new JFrame();
		this.main.setTitle("Bienvenida");
		this.main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
	
	@Override
	public void init() {
		this.welcome = new Welcome();
		main.add(welcome);
		this.main.setVisible(true);
	}
	
	@Override
	public void register() {
		this.login = new Background(new LogIn());
		main.add(login);
		this.main.setVisible(true);
		this.pack();
	}

	@Override
	public void newWorker() {
		this.addAccount = new Background(new NewAccount());
		main.add(addAccount);
		this.main.setVisible(true);
	}

	@Override
	public void newCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCatalog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showSalary() {
		// TODO Auto-generated method stub
		
	}

}

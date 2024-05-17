package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class NewAccount extends JPanel{

	/**
	 * 
	 */
	private SubTitle subtitle;
	private SubTitle nameLabel;
	private TextField name;
	private SubTitle idLabel;
	private TextField id;
	private SubTitle userLabel;
	private TextField user;
	private SubTitle passwordLabel;
	private JPasswordField password;
	private Button create;
	
	public NewAccount() {
		super();		
		this.subtitle = new SubTitle("NUEVA CUENTA",25,Font.BOLD);
		nameLabel = new SubTitle("NOMBRE",20,0);
		name = new TextField(10);
		idLabel = new SubTitle("ID",20,0);
		id = new TextField(10);
		userLabel = new SubTitle("USUARIO",20,0);
		user = new TextField(10);
		passwordLabel = new SubTitle("CONTRASEÑA",20,0);
		password = new JPasswordField(10);
		create = new Button("CREAR", 200, 80,"nuevaCuenta");		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		style();
		init();
		
	}
	
	private void style() {
		password.setBackground(new Color(119,148,214));
	}
	
	public void init() {
		add(subtitle);
		add(Box.createRigidArea(new Dimension(0, 20)));
		
		JPanel nameP = new JPanel();
		nameP.setLayout(new GridLayout(1,2));
		nameP.add(nameLabel);
		nameP.add(Box.createRigidArea(new Dimension(0, 10)));
		nameP.add(name);
		add(nameP);
		add(Box.createRigidArea(new Dimension(0, 10)));
		
		JPanel idP = new JPanel();
		idP.setLayout(new GridLayout(1,2));
		idP.add(idLabel);
		idP.add(Box.createRigidArea(new Dimension(0, 10)));
		idP.add(id);
		add(idP);
		add(Box.createRigidArea(new Dimension(0, 10)));
		
		JPanel userP = new JPanel();
		userP.setLayout(new GridLayout(1,2));
		userP.add(userLabel);
		userP.add(Box.createRigidArea(new Dimension(0, 10)));
		userP.add(user);
		add(userP);
		add(Box.createRigidArea(new Dimension(10, 10)));
		
		JPanel passwordP = new JPanel();
		passwordP.setLayout(new GridLayout(1,2));
		passwordP.add(passwordLabel);
		passwordP.add(Box.createRigidArea(new Dimension(0, 10)));
		passwordP.add(password);
		add(passwordP);
		add(Box.createRigidArea(new Dimension(0, 30)));
		add(create);
	}
}
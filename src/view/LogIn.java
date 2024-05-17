package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LogIn extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Title title;
	private SubTitle subtitleInit;
	private TextField user;
	private TextField password;
	private ImageIcon iconUser;
	private ImageIcon iconPass;
	private Button create;
	private Button enter;
	
	public LogIn() {
		super();
		title = new Title(50);
		subtitleInit = new SubTitle("INICIO DE SESION",20, 1);
		user = new TextField(20);
		password = new TextField(20);
		iconUser = new ImageIcon("src//resources//icon_user.png");
		iconPass = new ImageIcon("src//resources//icon_password.png");
		create = new Button("CREAR NUEVA CUENTA", 300,100, "crearCuenta");
		enter = new Button("INGRESAR", 300,100,"ingresar");
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		init();
	}
	
	public void init() {
		add(Box.createRigidArea(new Dimension(0, 50)));
		add(title);
		add(Box.createRigidArea(new Dimension(0, 50)));
		add(subtitleInit);
		add(Box.createRigidArea(new Dimension(0, 50)));
		
		JPanel inputUser = new JPanel();
		inputUser.setBackground(new Color(0,0,0,1));
		inputUser.add(new JLabel(iconUser));
		inputUser.add(user);
		
		JPanel inputPass = new JPanel();
		inputPass.setBackground(new Color(0,0,0,1));
		inputPass.add(new JLabel(iconPass));
		inputPass.add(password);
		
		add(inputUser);
		//add(Box.createRigidArea(new Dimension(0, 0)));
		add(inputPass);
		add(Box.createRigidArea(new Dimension(0, 15)));
		
		JPanel buttons = new JPanel();
		buttons.setBackground(new Color(0,0,0,1));
		buttons.add(create);
		buttons.add(Box.createRigidArea(new Dimension(30, 0)));
		buttons.add(enter);
		add(buttons);
		add(Box.createRigidArea(new Dimension(0, 50)));
	}

}

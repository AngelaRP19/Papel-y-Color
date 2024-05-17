package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MenuOptions extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Title title;
	private JPanel panel;
	private JPanel buttons;
	private SubTitle subtitle;
	private Button addProduct;
	private Button addCustomer;
	private Button generateBill;
	private Button calculateSalary;
	private Button signOut;
	
	public MenuOptions() {
		title = new Title(50);
		panel = new JPanel();
		buttons = new JPanel();
		subtitle = new SubTitle("MENU DE OPCIONES",30,1);
		addProduct = new Button("Agregar producto", 400,50,"agregaProducto");
		addCustomer = new Button("Agregar cliente", 400,50,"agregaCliente");
		generateBill = new Button("Generar factura",400,50, "generaFactura");
		calculateSalary = new Button("Calcular sueldo", 400,50, "calculaSueldo");
		signOut = new Button("Cerrar sesion", 200,30, "cerrarSesion");
		setLayout((LayoutManager) new BoxLayout(this, BoxLayout.Y_AXIS));
		style();
		init();
	}
	
	private void style() {
			signOut.setBackground(new Color(119,148,214));
			signOut.setForeground(new Color(0,0,0));
			panel.setLayout(new BorderLayout());
			panel.setBorder( new LineBorder(new Color(119,148,214))); //ESTE
			buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
			buttons.setBackground(new Color(175, 190, 223));
			
		}
	
	public void init() {
		add(title);
		add(Box.createRigidArea(new Dimension(0, 30)));
		buttons.add(Box.createRigidArea(new Dimension(0, 10)));
		buttons.add(subtitle);
		buttons.add(Box.createRigidArea(new Dimension(0, 20)));
		buttons.add(addProduct);
		buttons.add(Box.createRigidArea(new Dimension(0, 10)));
		buttons.add(addCustomer);
		buttons.add(Box.createRigidArea(new Dimension(0, 10)));
		buttons.add(generateBill);
		buttons.add(Box.createRigidArea(new Dimension(0, 10)));
		buttons.add(calculateSalary);
		buttons.add(Box.createRigidArea(new Dimension(0, 20)));
		buttons.add(signOut);
		buttons.add(Box.createRigidArea(new Dimension(0, 30)));
		panel.add(buttons, BorderLayout.CENTER);
		add(panel);
		
	}
}
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Welcome extends JPanel{
	
	private Title title;
	private Button logIn;
	private Button register;
	private JPanel content;
	
	public Welcome() {
		this.setBackground(new Color(0,0,0,1));
		title = new Title(100);
		logIn = new Button("INGRESAR", 300,100, "IngresoInicial");
		register = new Button("REGISTRARSE", 300,100, "Registrarse");
		style();
		init();
	}
	@Override
	public void paint(Graphics g){
		ImageIcon imageBack = new ImageIcon("src//resources//background.png");
		g.drawImage(imageBack.getImage(),0,0,getWidth(),getHeight(),this);
		super.paint(g);
	}
	public void style() {
    this.content = new JPanel();
    this.content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
}

public void init() {
	this.content.setBackground(new Color(0,0,0,1));
    content.add(title);
    content.add(Box.createRigidArea(new Dimension(0, 30)));
    content.add(logIn);
    content.add(Box.createRigidArea(new Dimension(0, 10)));
    content.add(register);
    
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(Box.createVerticalGlue());
   	this.add(content);
    this.add(Box.createVerticalGlue());
}

}

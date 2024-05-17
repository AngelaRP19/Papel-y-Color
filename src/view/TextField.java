package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;

public class TextField extends JTextField{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int columns;
	private Color background;
	
	public TextField(int columns) {
		this.columns = columns;
		background = new Color(119,148,214);
		init();
	}
	
	public void init() {
		setPreferredSize(new Dimension(50,20));
		setColumns(columns);
		setBackground(background);
	}

}

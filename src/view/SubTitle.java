package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class SubTitle extends JLabel{
	
	/**
	 * 
	 */
	private String text;
	private int size;
	private Font font;
	private int bold;
	private Color color;
	
	public SubTitle(String text, int size, int bold){
		this.text = text;
		this.size = size;
		this.bold = bold;
		init();
	}
	
	public void init() {
		setText(text);
		font = new Font("Arial", bold, size);
		color = new Color(0,0,0);
		setFont(font);
		setForeground(color);
		setAlignmentX(Component.CENTER_ALIGNMENT);
	}

}

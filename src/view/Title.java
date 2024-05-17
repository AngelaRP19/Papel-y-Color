package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;

public class Title extends JLabel{
	
	private Color black;
	private Font font;
	private int size;
	
	public Title(int size) {
		this.size = size;
		init();
	}
	
	public void init() {
		black = new Color(0,0,0);
		font = new Font("Lucida Calligraphy", Font.BOLD, size);
		this.setText("PAPEL Y COLOR");
		this.setForeground(black);
		this.setFont(font);
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
	}
	
}

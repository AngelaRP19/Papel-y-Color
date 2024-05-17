package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;

public class Button extends JButton{
	
	private Color blue;
	private Color white;
	private String text;
	private Font font;
	private int width;
	private int height;
	
	public Button(String text, int width, int height, String command) {
		this.setActionCommand(command);
		this.text = text;
		this.width = width;
		this.height = height;
		blue = new Color(2,27,134);
		white = new Color(255,255,255);
		this.font = new Font("Verdana", Font.BOLD, 20);
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, new File("src//resources//fonts//Gliker.ttf")).deriveFont(Font.BOLD, 20);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		init();
	}
	
	private void init() {
		this.setText(text);
		this.setFont(font);
		this.setBackground(blue);
		this.setForeground(white);
		Dimension size = new Dimension(width, height);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setFocusPainted(false);
	}
	

}

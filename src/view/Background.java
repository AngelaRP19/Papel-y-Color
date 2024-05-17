package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel {

    private JPanel content;

    public Background(JPanel content){
        this.content = content;
        //this.repaint();
        this.init();
    }
    @Override
	public void paint(Graphics g){
		ImageIcon imageBack = new ImageIcon("src//resources//back2.png");
		g.drawImage(imageBack.getImage(),0,0,getWidth(),getHeight(),this);
		super.paint(g);
	}
    public void init() {
    	this.content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(new Color(0,0,0,1));
        
        //this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //this.setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(content);
        
        //this.add(Box.createVerticalGlue());
    }
}

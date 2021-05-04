import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Tile extends JButton{
	private Color color;
	ImageIcon img1, img2; //add any other images
	int r, c; //possible location variables
	
	public Tile(String fileName) {
		super(); //call parent Constructor
		color = Color.white;
		
		//setup icon image
		img1 = new ImageIcon(Tile.class.getResource(fileName));
		//you can setup additional images here
		//if you're switch images when you click
		
		//call parent helper methods
		//I'm explicity using super below to 
		//emphasize using methods from parent class
		super.setIcon(img1); 
		super.setBackground(color);
	}
	
	public Tile(String fileName, int row, int col) {
		this(fileName);		
		r = row;
		c = col;
	}
	
	
	public void setRowCol(int r, int c) {
		this.r = r;
		this.c = c;
	}
	
	
}

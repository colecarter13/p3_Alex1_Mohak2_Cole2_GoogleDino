import java.awt.Color;
import java.awt.Graphics;

public class Dino {
	private int x, y; //location
	private int width;
	private Color c;
	private int vx, vy; //velocity values
	
	public Dino() {
		/* job of the const is to give values to instance variables*/
		x = 0;
		y = 0;
		width = 50;
		c = new Color(50,50,50);
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(this.c);
		g.fillOval(x, y, width, width);
		x += vx;
		
	}
	
	public void moveRight() {
		vx = 1;
	}
	
	public void stop() {
		vx = 0;
	}
	
}

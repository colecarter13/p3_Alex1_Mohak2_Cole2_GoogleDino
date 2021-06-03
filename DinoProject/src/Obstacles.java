
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.ArrayList;


public class Obstacles {
 private int x = 700, y = 280;
 private int vx = -5, vy;
 private Image img;
 private Image img1;
 private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
 private int acc;
 private int coin;
 private int yep;
 public ArrayList<Obstacles> ObsList = new ArrayList<Obstacles>();
 
 public Obstacles(int pX, boolean pDouble) {
	 coin = (int) (Math.random()* 2) + 1;
	 System.out.println(coin);
	 if(!pDouble) {
	   img = getImage("unnamed.png"); 
	 }
	
	
	if(pDouble) {
		img1 = getImage("cacti.png");
	}
	 x = pX;
	 init(x, y);
	 
 }
 
 

 public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);
		tx.setToTranslation(x,y);
		
		x += vx;
		 if(x <= 0) {
			 x = 750;
		 }
		    
		
	}
 
 
    private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(4, 4);
	}
	
	
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Dino.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
}

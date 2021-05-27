import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Dino {
	private int x = 15, y = 257; //location
	private int width;
	private int acc = 1;
	private Image img;
	private Image img2;
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	
	private int vx = 0, vy = 0; //velocity values
	
	public Dino(int pY) {
		img2 = getImage("duxkingDino.png");
		y = pY;
		init(x,y);
	}
	
	public Dino() {
		img = getImage("pixil-frame-0.png");
		init(x,y);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);
		tx.setToTranslation(x,y);
		
		y += vy;
		if(y <= 177 ) {
			vy += acc;
		}else if(y > 257) {
			vy = 0;
		}
		    
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
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
	

	
	public void moveUp() {
		vy = -3;
	}
	
	public void stop() {
		vx = 0;
	}
	
}

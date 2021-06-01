
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Obstacles {
 private int x = 0, y = 0;
 private int vx, vy;
 private Image img;
 private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
 private int acc;
 private int coin;
 private int yep;
 
 public Obstacles() {
	 coin = (int) (Math.random()* 2) + 1;
	 System.out.println(coin);
	 if(coin > 1) {
		 img = getImage("unnamed.png"); 
	 }else {
		 //img1 = getImage(second cactus image);
		 
	 }
	 
	 init(x, y);
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
}

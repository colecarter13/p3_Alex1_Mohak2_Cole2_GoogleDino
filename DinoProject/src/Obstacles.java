import java.awt.Image;
import java.awt.geom.AffineTransform;

public class Obstacles {
 private int x, y;
 private int vx, vy;
 private Image img;
 private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
 private int acc;
}

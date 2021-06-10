import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener, KeyListener{
	//handles drawing animation
	Timer animationTimer; 
	Background daBack = new Background();
	Dino bigDog = new Dino();
	Dino littleDog = new Dino(257);
	Obstacles newObs = new Obstacles(700, false, 280);
	Obstacles doubleObs = new Obstacles(1050, true, 260);
	
	public void paint(Graphics g) {
		//calling this line ensures the frame is redrawn
		super.paintComponent(g);
		daBack.paint(g);
		bigDog.paint(g);
		newObs.paint(g);
		doubleObs.paint(g);
		
		if(doubleObs.getX() < -200) {
			doubleObs.setX(750);	
		}
		if(newObs.getX() < - 100) {
			newObs.setX(850);
		}
		
		
		//call paint methods of objects or through g.drawRect etc
	
		
	}
	
	public void collide() {
		if(newObs.getX() <= bigDog.getX() || doubleObs.getX() <= bigDog.getX()) {
			System.out.println("You Lost");
		}
	}
	
	/* constructor for MainPain class */
	public MainPanel() {
		
		//Create a JFrame Object with a title bar text
		JFrame f = new JFrame("Example Drawing");
		
		//Set the size of the window
		f.setSize(800,600); //width and height
		
		//set default action for x button
		//without this, your code will run behind the scenes until
		//you force exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add this panel to the JFrame
		//allows connection with "drawing"
		f.add(this);
		f.addKeyListener(this);
		
		
		
		//setup animation timer
		animationTimer = new Timer(16, this);
		
		//do not forget to start the timer
		animationTimer.start();
		
		//instantiate the rest of the instance variables
		
		
		
		f.setVisible(true);
	}

	/* this method is invoked/called by the titmer */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//call the frame to refresh
		//recall that actitonPerformed is called by the
		//timer object every 16ms
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		
		
		switch(arg0.getKeyCode()) {
		//if keycode is 'space' key
		case 32:
			bigDog.moveUp();
			bigDog.setReady(false);
			break;
		case 38:
			bigDog.moveUp();
			break;
		
			
		}
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SketchPanel extends JPanel implements Runnable{
	
	static final int SKETCH_WIDTH = 800;
	static final int SKETCH_HEIGHT = (int)(SKETCH_WIDTH * (3.0/4));
	static final Dimension SCREEN_SIZE = new Dimension(SKETCH_WIDTH,SKETCH_HEIGHT);
	Thread sketchThread;
	Image image;
	Graphics graphics;
	Random random;
	
	
	SketchPanel(){
		this.setFocusable(true);
		this.addKeyListener(new AL());
		
		this.setPreferredSize(SCREEN_SIZE);
		
		sketchThread = new Thread(this);
		sketchThread.start();
	}
	
	public void newCanvas() {
		
	}
	
	public void newInterface() {
		
	}
	
	public void paint(Graphics g) {
		
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void run() {
		
	}
	
//	public void save() {
//		
//	}
//	
//	public void load() {
//		
//	}
	
	public class AL extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
		}
		public void keyReleased(KeyEvent e) {
			
		}
	}
	
	public class ML extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			
		}
	}
}

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.Point;

@SuppressWarnings("serial")
public class SketchPanel extends JPanel implements MouseMotionListener, ActionListener{
	
	public Point point = null;
	public Point lastPoint = null;
	
	JButton button;
	JLabel label;
	
	
	static final int SKETCH_WIDTH = 800;
	static final int SKETCH_HEIGHT = (int)(SKETCH_WIDTH * (0.5625));
	static final Dimension SCREEN_SIZE = new Dimension(SKETCH_WIDTH,SKETCH_HEIGHT);
	
//	Thread sketchThread;
//	Image image;
//	Graphics graphics;
//	Random random;
	
	
	SketchPanel(){
		this.setFocusable(true);
		
//		this.addKeyListener(new AL());
		
		this.setPreferredSize(SCREEN_SIZE);
		

		addMouseMotionListener(this);
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		
//		sketchThread = new Thread(this);
//		sketchThread.start();
	}
	
//	public void newCanvas() {
//		
//	}
//	
//	public void newInterface() {
//		
//	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(1));
		
		if (point != null && lastPoint != null) {
			g2.drawLine(point.x, point.y, lastPoint.x, lastPoint.y);
		}
		
		g2.setColor(Color.DARK_GRAY);
		g2.fillRect(0, 0, 200, SKETCH_HEIGHT);
	}
	
//	public void save() {
//		
//	}
//	
//	public void load() {
//		
//	}
	
@Override
public void mouseDragged(MouseEvent e) {
	point = lastPoint;
	lastPoint = new Point (e.getX(), e.getY());
	repaint();
}

@Override
public void mouseMoved(MouseEvent e) {
	lastPoint = null;
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		//JColorChooser colorChooser = new JColorChooser();
		
		Color color = JColorChooser.showDialog(null, "Color Chooser", Color.black);
	}
}
}
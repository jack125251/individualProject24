import java.awt.*;
import java.awt.event.*;
//import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
//import java.util.*;
import javax.swing.*;
import java.awt.Point;

@SuppressWarnings("serial")
public class SketchPanel extends JPanel implements MouseMotionListener, ActionListener {

	JPanel jp;
	
	public Point point = null;
	public Point lastPoint = null;

	Image image;
	
	
	//JButton[] jButtonArray;
	JButton button;
	
	boolean start = false;
	int s = 0;

	
//	JLabel label;

	static final int SKETCH_WIDTH = 800;
	static final int SKETCH_HEIGHT = (int) (SKETCH_WIDTH * (0.5625));
	static final Dimension SCREEN_SIZE = new Dimension(SKETCH_WIDTH, SKETCH_HEIGHT);

//	Thread sketchThread;
//	Image image;
//	Graphics graphics;
//	Random random;

	SketchPanel() {
		this.setFocusable(false);

//		this.addKeyListener(new AL());

		this.setPreferredSize(SCREEN_SIZE);

		addMouseMotionListener(this);

		this.repaint();
		button = new JButton("Start ...then click anywhere");
		button.setBounds(SKETCH_WIDTH/2, 500, 200, 100);
		button.addActionListener(this);
		button.setFocusable(true);
		button.setVisible(true);
		this.add(button);
		
		image = new ImageIcon("SketchIcon.png").getImage();
		
		//add(jp);
		this.repaint();
		
		

//		label = new JLabel();
//		label.setOpaque(true);

//		this.add(button);
//		this.add(label);

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
		
		
		
		
		//start = true;
		
		// start screen
		g2.setColor(Color.DARK_GRAY);
		//g2.fillRect(0,0,SKETCH_WIDTH,SKETCH_HEIGHT);
		if (!start) {
			g2.fillRect(0,0,SKETCH_WIDTH,SKETCH_HEIGHT);
			g2.drawImage(image, 235, 90, null);
		} else if (s == 1) {
			g2.clearRect(250,50,500,SKETCH_HEIGHT-100);
		} else {

			this.repaint();
			
			//g2.clearRect(250,50,500,SKETCH_HEIGHT-100);
			//if (start == true) {
			g2.setStroke(new BasicStroke(1));
			if (point != null && lastPoint != null) {
				g2.drawLine(point.x, point.y, lastPoint.x, lastPoint.y);
			}
			
			g2.setColor(Color.lightGray);
			g2.fillRect(0, 0, 200, SKETCH_HEIGHT);
			g2.setColor(Color.black);
			g2.drawString("Brush size:", 50, 100);
			g2.drawString("Brush color:", 50, 200);
			//}
			}
		
		
		// pen
		
		
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
		lastPoint = new Point(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lastPoint = null;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			// JColorChooser colorChooser = new JColorChooser();

			//Color color = JColorChooser.showDialog(null, "Color Chooser", Color.black);
			s++;
			start = true;
			System.out.println("button");
		}
	}
}
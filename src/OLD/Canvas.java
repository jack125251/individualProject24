import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Canvas extends JPanel {
	private Point lastPoint;

	public Canvas() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lastPoint = new Point(e.getX(), e.getY());
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.drawLine(lastPoint.x, lastPoint.y, e.getX(), e.getY());
				g.dispose();
			}
		});
	}
}

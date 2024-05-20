import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

@SuppressWarnings("serial")
abstract class Tools extends JPanel {
	Point point;
//	Point lastPoint;
//	boolean m = false;

	public Tools() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
//				lastPoint = new Point(e.getX(), e.getY());
				point = new Point(e.getX(), e.getY());
			}
		});
	}
}

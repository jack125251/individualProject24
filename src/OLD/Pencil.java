import java.awt.Graphics;

@SuppressWarnings("serial")
public class Pencil extends Tools {
	public Pencil() {
		Graphics g = getGraphics();
		g.drawLine(point.x, point.y, point.x, point.y);
		g.dispose();
	}
}

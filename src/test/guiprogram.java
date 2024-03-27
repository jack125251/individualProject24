import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class guiprogram {
	public static void main (String[] a) {
		JFrame f = new JFrame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
	);
	f.setContentPane(new Container());
	f.setSize(400,400);
	f.setVisible(true);
}
}

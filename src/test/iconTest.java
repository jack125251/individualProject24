import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
//import java.awt.Frame.*;
import java.io.*;

public class iconTest {
	public static void main (String[] a) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File("/SketchIcon.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
	f.setIconImage(image);
	
	
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
//    }
	
	}
	//public void setIconImage(Image image) {}
	// "SketchIcon.png"
}

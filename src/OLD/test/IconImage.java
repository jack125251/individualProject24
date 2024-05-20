import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//
//import java.awt.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class IconImage
//{
//	
//	public static void main(String[] a) {
//		
//		
//		JFrame f = new JFrame();
//		f.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
//		
//		f.setContentPane(new Container());
//		f.setSize(400, 400);
//		f.setVisible(true);
//		setIconImage(f);
//	}
//    public static void setIconImage(Window window)
//    {
//        try
//        {
//            InputStream imageInputStream = window.getClass().getResourceAsStream("/SketchIcon.png");
//            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
//            window.setIconImage(bufferedImage);
//        } catch (IOException exception)
//        {
//            exception.printStackTrace();
//        }
//    }
//}


public class IconImage {

    public static void main(String[] args) throws IOException {
    	
    	
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        JLabel label = new JLabel();
        // It's setting text correctly
        label.setText("Hello");
        // This doesn't work
        //label.setIcon(new ImageIcon("https://www.pngrepo.com/png/191455/512/wolf.png"));
        // This doesn't work either
        label.setIcon(new ImageIcon("/Users/9599060/CompProg2/Sketch/src/SketchIcon.png"));
        
//        String imagePath = "\"/Users/9599060/CompProg2/Sketch/src/SketchIcon.png\"";
//        InputStream imgStream = IconImage.class.getResourceAsStream(imagePath );
//        BufferedImage myImg = ImageIO.read(imgStream);
//        
//        frame.setIconImage(myImg);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("/Users/9599060/CompProg2/Sketch/src/SketchIcon.png");
        frame.setIconImage(icon);
        
        
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    //public void setIconImage(Image image) {
    	
    //}
}

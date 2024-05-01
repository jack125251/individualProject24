import java.awt.*;
import javax.swing.*;

public class SketchFrame extends JFrame{
	
	SketchPanel panel;
	
	SketchFrame(){
		panel = new SketchPanel();
		this.add(panel);
		this.setTitle("Sketch");
		// icon image
		this.setResizable(false);
		
		this.setBackground(Color.white);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}

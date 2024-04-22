import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Sketch {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Sketch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 300);
		
		frame.getContentPane().add(new Canvas(), BorderLayout.CENTER);
		
		
		
		
//		public static int DELAY = 1000/60;
//
//		Timer timer = new Timer(DELAY,new ActionListener() {
//		    public void actionPerformed(ActionEvent event) 
//		    {
//		      updateModel();
//		      repaintScreen();
//		    }
//		});
//		timer.setRepeats(true);
//		timer.start();
		
		
		
	}

	
}

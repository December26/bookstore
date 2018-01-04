package homework6;

import javax.swing.JFrame;

public class StrategiesUI {
	private Controller controller = new Controller();
	private JFrame frame1 = new JFrame();
	
	public StrategiesUI(Controller con) {
		controller = con;
		frame1.setTitle("²ßÂÔÎ¬»¤");
		frame1.setLayout(null);
	    frame1.setBounds(800, 120, 800, 600);
	    
	    
	    
	    frame1.setVisible(true);
	}
}

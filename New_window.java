import java.awt.Dimension;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class New_window extends JFrame {
	
	JLabel label;
	
	New_window(){
		
		label = new JLabel("Welcome to Tower");
		label.setOpaque(true);
		label.setBounds(0,0,300,200);
		
	
		
		add(label);
		setSize(new Dimension(300,300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

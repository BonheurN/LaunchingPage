import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Launch extends JFrame implements ActionListener {

	JButton button;
	Launch(){
		
		button = new JButton();
		button.setBounds(200,150,100,50);
		button.setBackground(Color.LIGHT_GRAY);
		button.setFocusable(false);
		button.setText("page");
		button.addActionListener(this);
		
		setTitle("Browser");
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,500));
		setLayout(null);
		setVisible(true);;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Launch launch = new Launch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			dispose();
			New_window window = new New_window();
		}
	}

}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewFrame extends JButton implements ActionListener{

	JButton button = new JButton("Next");
	
	NewFrame(){
		
	}

	/*
	 * button.addActionListener(actionListener);
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
		}
		
	
	}
}

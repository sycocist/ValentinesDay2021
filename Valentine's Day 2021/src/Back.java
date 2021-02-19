import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Back extends JButton {

	Back(){
		
	
	this.setHorizontalAlignment(JButton.CENTER);
	this.setBounds(0, 0, 100, 50);
	this.setText("Back");
	this.setFocusable(false);
	this.setFont(new Font("Times New Roman", Font.PLAIN, 24));
	this.setBackground(new Color(0xeaf6f7));
	
	}	
}

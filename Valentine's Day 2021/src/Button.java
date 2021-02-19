import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton {

	Button(String text, int x, int y, boolean nsfw){
	
	
	this.setHorizontalAlignment(JButton.CENTER);
	this.setBounds(x, y, 200, 100);
	this.setText(text);
	this.setFocusable(false);
	this.setFont(new Font("Times New Roman", Font.PLAIN, 24));
	this.setBackground(new Color(0xd1f6ff));
	if(nsfw == true) {
		this.setForeground(Color.black);
		//this.setFont(new Font("Times New Roman", Font.BOLD, 24));
		}
	else {
		this.setForeground(Color.black);
	}
	
	
}
	
	
	
}
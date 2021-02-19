import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{

	Label(String text, int size){
		this.setText(text);
		this.setFont(new Font("Times New Roman", Font.BOLD, size));
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
	}
}

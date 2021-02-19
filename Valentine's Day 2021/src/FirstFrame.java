import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame  extends JFrame {
	

	
	FirstFrame(){
		
		ImageIcon heart = new ImageIcon("heart.jpg");
		this.setTitle("Happy Valentine's Day!");
		this.setSize(800, 800); 
		this.setIconImage(heart.getImage());
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.pink);
		this.setVisible(true);
		
	}

	
	
	
}


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

public class Card extends JFrame implements ActionListener{
	
	JButton back;
	
	Card(String string){
		
		
		ImageIcon image = new ImageIcon(string);
		ImageIcon heart = new ImageIcon("heart.jpg");
		JLabel label = new JLabel();
		JLabel to = new JLabel();
		back = new JButton("Start over");
		back.setHorizontalAlignment(JButton.CENTER);
		back.setBounds(860, 0, 100, 50);
		back.setFocusable(false);
		back.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		back.setBackground(new Color(0xd1f6ff));
		back.addActionListener(this);
		
		
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		label.setBounds(0, 0, 960, 720);
		
		
		to.setText(Disclaimer.name);
		to.setFont(new Font("Satisfy", Font.PLAIN, 48));
		to.setBounds(610, 570, 300, 100);
		
		
		
		this.setTitle("Valentine's Day 2021");
		this.setSize(960, 720); 
		this.setIconImage(heart.getImage());
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		


		label.add(to);
		label.add(back);
		this.add(label);
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			MainThemes main = new MainThemes();
			this.dispose();
		}
		
	}
}
		 
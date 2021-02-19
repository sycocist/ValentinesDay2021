import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Instruments implements ActionListener{

	FirstFrame frame;
	Label label;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	
	Back back;
	
	Instruments(){
		
		frame = new FirstFrame();
		label = new Label("Final Choice?", 40);
		label.setBounds(0, 0, 800, 350);
		back = new Back();
		back.addActionListener(this);
		
		
		b1 = new Button("Flute", 170, 300, true);
		b1.addActionListener(this);
		b2 = new Button("Guitar", 420, 300, true);
		b2.addActionListener(this);
		b3 = new Button("Trombone", 170, 500, true);
		b3.addActionListener(this);
		b4 = new Button("Cello", 420, 500, true);
		b4.addActionListener(this);
		
		
	
		frame.add(label);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(back);
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Instruments();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			Card c1 = new Card("Copy of Copy of Copy of 2.png");
			frame.dispose();		
		}
		if(e.getSource()==b2) {
			Card c2 = new Card("Copy of Copy of 2 (5).png");
			frame.dispose();		
		}
		if(e.getSource()==b3) {
			Card c3 = new Card("Copy of Copy of Copy of 2 (1).png");
			frame.dispose();		
		}
		if(e.getSource()==b4) {
			Card c4 = new Card("Copy of Copy of 2 (4).png");
			frame.dispose();		
		}
		if(e.getSource()==back) {
			MainThemes themes = new MainThemes();
			frame.dispose();		
		}
	}
	
}

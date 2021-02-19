import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Theatre implements ActionListener{

	FirstFrame frame;
	Label label;
	Button b1;
	Button b2;
	Button b3;
	Back back;
	
	Theatre(){
		
		frame = new FirstFrame();
		label = new Label("Final Choice?", 40);
		label.setBounds(0, 0, 800, 350);
		back = new Back();
		back.addActionListener(this);
		
		
		b1 = new Button("Hamilton", 300, 200, false);
		
		b1.addActionListener(this);
		b2 = new Button("Dear Evan Hansen", 300, 350, true);
	
		b2.addActionListener(this);
		b3 = new Button("Hamilton", 300, 500, false);
	
		b3.addActionListener(this);
		
		
	
		frame.add(label);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(back);
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Theatre();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			Card c1 = new Card("Copy of Copy of 2 (1).png");
			frame.dispose();		
		}
		if(e.getSource()==b2) {
			Card c2 = new Card("Copy of Copy of 2 (3).png");
			frame.dispose();		
		}
		if(e.getSource()==b3) {
			Card c3 = new Card("Copy of Copy of 2 (2).png");
			frame.dispose();		
		}
		if(e.getSource()==back) {
			MainThemes themes = new MainThemes();
			frame.dispose();		
		}
	}
	
}

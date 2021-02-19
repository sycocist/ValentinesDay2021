import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class FNAF implements ActionListener{

	FirstFrame frame;
	Label label;
	Button b1;
	Button b2;
	Back back;
	
	FNAF(){
		
		frame = new FirstFrame();
		label = new Label("Final Choice?", 40);
		label.setBounds(0, 100, 800, 350);
		back = new Back();
		back.addActionListener(this);
		
		
		b1 = new Button("Pick Me!", 300, 400, true);
		b1.setBounds(170, 500, 200, 100);
		b1.addActionListener(this);
		b2 = new Button("Pick Me!", 300, 400, true);
		b2.setBounds(420, 500, 200, 100);
		b2.addActionListener(this);
		
		
	
		frame.add(label);
		frame.add(b1);
		frame.add(b2);
		frame.add(back);
	
	}
	
	
	
	
	public static void main(String[] args) {
		new FNAF();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			Card c1 = new Card("Copy of 2.png");
			frame.dispose();		
		}
		if(e.getSource()==b2) {
			Card c2 = new Card("Copy of Copy of 2.png");
			frame.dispose();		
		}
		if(e.getSource()==back) {
			MainThemes themes = new MainThemes();
			frame.dispose();		
		}
	}
	
}

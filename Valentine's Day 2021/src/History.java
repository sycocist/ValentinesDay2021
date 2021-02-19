import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class History implements ActionListener{

	FirstFrame frame;
	Label label;
	Button b1;
	Button b2;
	Button b3;
	Back back;
	
	
	History(){
		
		frame = new FirstFrame();
		label = new Label("Go on...", 40);
		label.setBounds(0, 100, 800, 100);
		back = new Back();
		back.addActionListener(this);
		
	
		
		b1 = new Button("French Revolution", 410, 200, false);
		b1.setBounds(200, 310, 400, 100);
		b1.addActionListener(this);
		b2 = new Button("Russian Revolution", 190, 200, true);
		b2.setBounds(200, 200, 400, 100);
		b2.addActionListener(this);
		b3  = new Button("Ancient Rome", 300, 400, true);
		b3.setBounds(200, 420, 400, 100);
		b3.addActionListener(this);
		
		frame.add(label);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(back);
		
	}
	
	public static void main(String[] args) {
		new History();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			Card c1 = new Card("Copy of Copy of Copy of 2 (3).png");
			frame.dispose();		
		}
		if(e.getSource()==b2) {
			Card c2 = new Card("Copy of Copy of Copy of 2 (4).png");
			frame.dispose();		
		}
		if(e.getSource()==b3) {
			Card c3 = new Card("Copy of Copy of Copy of 2 (5).png");
			frame.dispose();		
		}
		if(e.getSource()==back) {
			MainThemes themes = new MainThemes();
			frame.dispose();		
		}
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Music implements ActionListener{

	FirstFrame frame;
	Label label;
	Button Instruments;
	Button Music;
	Button Theatre;
	Back back;
	
	
	Music(){
		
		frame = new FirstFrame();
		back = new Back();
		back.addActionListener(this);
		label = new Label("Go on...", 40);
		label.setBounds(0, 100, 800, 100);
		
		Instruments = new Button("The better cult", 190, 200, false);
		Instruments.setBounds(200, 250, 400, 100);
		Instruments.addActionListener(this);
		
		Theatre  = new Button("tHeAtRe", 300, 200, false);
		Theatre.setBounds(200, 420, 400, 100);
		Theatre.addActionListener(this);
		
		frame.add(label);
		frame.add(Instruments);
		
		frame.add(Theatre);
		frame.add(back);
		
		
	}
	
	public static void main(String[] args) {
		new Music();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Instruments) {
			Instruments Instruments = new Instruments();
			frame.dispose();
		}
		
		if(e.getSource()==Theatre) {
			Theatre Theatre = new Theatre();
			frame.dispose();
		}
		if(e.getSource()==back) {
			MainThemes main = new MainThemes();
			frame.dispose();
		}
	}
}

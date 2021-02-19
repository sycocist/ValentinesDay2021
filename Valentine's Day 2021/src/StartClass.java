import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class StartClass implements ActionListener{
	
	Button button;
	FirstFrame firstFrame;
	MainThemes videoGame;
	Label label;
	
	public StartClass() {

		//STARTING FRAME
		firstFrame = new FirstFrame();
		
		
		//Label
		Label label = new Label("Happy Valentine's Day!", 60);
		label.setBounds(0, 300, 800, 100);
		
		
		button = new Button("Continue", 300, 400, false);
		button.addActionListener(this);
		
		
		firstFrame.add(label);
		firstFrame.add(button);
		
	}

	
	public static void main(String[] args) {
		new StartClass();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			Disclaimer dis = new Disclaimer(null);
			firstFrame.dispose();
		}
	

 }
}
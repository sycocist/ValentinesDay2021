import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Disclaimer implements ActionListener {

	FirstFrame frame;
	Label l1;
	Label l2;
	Label l3;
	Label l4;
	Label l5;
	Label l6;
	Label l7;
	Label l8;
	Label l9;
	Label l10;
	Label l11;
	JLabel message;
	Button next;
	Back back;
	public static String name;
	//public static String email;
	JTextField nameField;
	JTextField emailField;
	JTextField veriField;
	HashMap<String, String> logininfo = new HashMap<String, String>();

	Disclaimer(HashMap<String, String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		frame = new FirstFrame();
		frame.setVisible(false);
		
		nameField = new JTextField();
		nameField.setBounds(300, 500, 200, 25);
		nameField.addActionListener(this);
		l8 = new Label("Enter your (real) name:", 18);
		l8.setBounds(100, 500, 200, 25);
		l9 = new Label("Enter verification code:", 18);
		l9.setBounds(100, 550, 200, 25);
		/*
		emailField = new JTextField();
		emailField.setBounds(300, 450, 200, 25);
		emailField.addActionListener(this);
		*/
		
		veriField = new JTextField();
		veriField.setBounds(300, 550, 200, 25);
		veriField.addActionListener(this);
		
		l1 = new Label("Also I wrote half of this at 1am so hopefully this won't crash", 16);
		l1.setBounds(0, 700, 800, 100);
		l2 = new Label("How it Works", 36);
		l2.setBounds(0, 10, 800, 100);
		l3 = new Label("My initial plan was to email the first card you choose with no takebacks", 24);
		l3.setBounds(0, 100, 800, 100);
		l4 = new Label("Per usual, it didn't work out", 24);
		l4.setBounds(0, 150, 800, 100);
		l5 = new Label("And now this is half a week late so here's what I have", 24);
		l5.setBounds(0, 200, 800, 100);
		l6 = new Label("(So now mutliple people can \"claim\" valentines", 24);
		l6.setBounds(0, 250, 800, 100);
		l7 = new Label("And you can \"claim\" as many as you'd like", 24);
		l7.setBounds(0, 300, 800, 100);
		l10 = new Label("Also I couldn't figure out how to have a JFrame/BufferedImage", 24);
		l10.setBounds(0, 350, 800, 100);
		l11 = new Label("download option so you'll just have to screenshot the card", 24);
		l11.setBounds(0, 380, 800, 100);
		
		
		next = new Button("I accept these terms and services", 0, 650, false);
		next.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		next.setBounds(250, 600, 300, 80);
		next.addActionListener(this);
		back = new Back();
		back.addActionListener(this);
		message = new JLabel();
		message.setBounds(100, 550, 800, 30);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(next);
		frame.add(back);
		frame.add(nameField);
		frame.add(l10);
		frame.add(l11);
		//frame.add(emailField);
		frame.add(veriField);
		frame.add(message);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		LoginInfo logininfo = new LoginInfo();
		Disclaimer disclaimer = new Disclaimer(logininfo.getLoginInfo());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if(e.()==nameField || e.getSource()==emailField || e.getSource()==next) {
		if(e.getSource()==next) {
			name = nameField.getText();
			//email = emailField.getText();
			String veri = veriField.getText();
			System.out.println(name);
			//System.out.println(email);
			
			if(logininfo.containsKey(name)) {
				if(logininfo.get(name).equals(veri)){
					
					MainThemes themes = new MainThemes();
					frame.dispose();
				}
					
				else {
					message.setText("Code incorrect (or I messed up this program very badly)");
				}
			}
			else {
				message.setText("Okay either you didn't put your real name or uhhhh I put down a different name for you, txt me, my bad");	
			
		}
		}
			
		if(e.getSource()==back) {
			StartClass start = new StartClass();
			frame.dispose();
		}
		
		
	}
	
}

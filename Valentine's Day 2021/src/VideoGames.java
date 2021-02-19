import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VideoGames implements ActionListener{

	FirstFrame frame;
	Label label;
	Button DDLC;
	Button MC;
	Button FNAF;
	Back back;
	
	
	VideoGames(){
		
		frame = new FirstFrame();
		label = new Label("Go on...", 40);
		label.setBounds(0, 100, 800, 100);
		back = new Back();
		back.addActionListener(this);
		
	
		
		DDLC = new Button("Doki Doki Literature Club", 410, 200, false);
		DDLC.setBounds(200, 310, 400, 100);
		DDLC.addActionListener(this);
		MC = new Button("Minecraft", 190, 200, false);
		MC.setBounds(200, 200, 400, 100);
		MC.addActionListener(this);
		FNAF  = new Button("Five Nights at Freddy's", 300, 400, false);
		FNAF.setBounds(200, 420, 400, 100);
		FNAF.addActionListener(this);
		
		frame.add(label);
		frame.add(DDLC);
		frame.add(MC);
		frame.add(FNAF);
		frame.add(back);
		
	}
	
	public static void main(String[] args) {
		new VideoGames();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==DDLC) {
			DDLC ddlc = new DDLC();
			frame.dispose();
		}
		if(e.getSource()==MC) {
			MC mc = new MC();
			frame.dispose();
		}
		if(e.getSource()==FNAF) {
			FNAF fnaf = new FNAF();
			frame.dispose();
		}
		if(e.getSource()==back) {
			MainThemes themes = new MainThemes();
			frame.dispose();		
		}
	}
}

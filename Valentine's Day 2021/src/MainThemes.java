import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainThemes implements ActionListener{

		FirstFrame frame;
		Label label;
		Button VGbutton;
		Button Tbutton;
		Button Mbutton;
		Button Hbutton;
		Back back;
		
		
	MainThemes(){
			
			frame = new FirstFrame();
			back = new Back();
			back.addActionListener(this);
			
			label = new Label("Choose your theme:", 40);
			label.setBounds(0, 100, 800, 100);
			
			VGbutton = new Button("Video Games", 300, 200, false);
			VGbutton.setBounds(300, 200, 200, 100);
			VGbutton.addActionListener(this);
			Mbutton = new Button("Music", 300, 350, false);
			Mbutton.addActionListener(this);
			
			Hbutton = new Button("History", 300, 500, false);
			Hbutton.addActionListener(this);
			
			frame.add(label);
			frame.add(VGbutton);
			frame.add(Mbutton);
			frame.add(Hbutton);
			frame.add(back);
			
		}
		
		public static void main(String[] args) {
			new MainThemes();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==VGbutton) {
				VideoGames videoGames = new VideoGames();
				frame.dispose();
			}
			if(e.getSource()==Mbutton) {
				Music music = new Music();
				frame.dispose();
			}
			if(e.getSource()==Hbutton) {
				History history = new History();
				frame.dispose();
			}
			if(e.getSource()==back) {
				Disclaimer start = new Disclaimer(null);
				frame.dispose();
			}
		}
}

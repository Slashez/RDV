import javax.swing.JFrame;
import javax.swing.JPanel;

public class Viewer extends JFrame {
	public Viewer() {
		JPanel viewPanel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 750);
		setResizable(false);
		setLocationRelativeTo(null);
		
		add(viewPanel);
		
		setTitle("RDV");
		setVisible(true);
	}
}

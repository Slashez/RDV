import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Streamer  extends JFrame {
	public Streamer() {
		JPanel streamPanel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setResizable(false);
		Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		setLocation(d.width - 200, 0);
		setAlwaysOnTop(true);
		
		add(streamPanel);
		setTitle("RDV");
		setVisible(true);
	}
}

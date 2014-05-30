import java.awt.Button;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JFrame{
	private final String url = "http://github.com/slashez";
	public Menu() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 225);
		setResizable(false);
		setLocationRelativeTo(null);
		
		addComponents(mainPanel);
		add(mainPanel);
		
		setTitle("RDV");
		setVisible(true);
	}
	public void addComponents(JPanel pane) {
		Button btnView = new Button("View");
		btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	dispose();
                Viewer desktopView = new Viewer();
            }
        });      
		btnView.setSize(200, 50);
		btnView.setFocusable(false);
		pane.add(btnView);
		
		Button btnShare = new Button("Share");
		btnShare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	dispose();
                Streamer desktopStream = new Streamer();
            }
        });     
		btnShare.setSize(200, 50);
		btnShare.setFocusable(false);
		pane.add(btnShare);
		
		Button btnHelp = new Button("Help");
		btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "For functionality related help, email me:\nslash.the.net@gmail.com");
            }
        });     
		btnHelp.setSize(200, 50);
		btnHelp.setFocusable(false);
		pane.add(btnHelp);
		
		JLabel lblAbout1 = new JLabel("<html><div align = \"center\">RDV is open source!<br><a href=\"" + url + "\">Github</a></div></html>", BoxLayout.X_AXIS);
		lblAbout1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAbout1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblAbout1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	try {
					Desktop.getDesktop().browse(new URI(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
            }
        });
		pane.add(lblAbout1);	
	}
}

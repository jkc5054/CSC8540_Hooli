package display;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;

public class SplashPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SplashPanel() {
		setSize(new Dimension(1228, 500));
		this.setPreferredSize(new Dimension(1228,500));
		
		JLabel lblSplashScreen = new JLabel("");
		lblSplashScreen.setIcon(new ImageIcon("C:\\github-repos\\Hooli\\cfg\\SplashScreen.jpg"));
		lblSplashScreen.setBounds(0,0,1228,381);
		add(lblSplashScreen);

	}

}

package display;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SplashPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public boolean startGameClicked;
	/**
	 * Create the panel.
	 */
	public SplashPanel() {
		setSize(new Dimension(1228, 500));
		this.setPreferredSize(new Dimension(1228,500));
		setLayout(null);
		
		startGameClicked = false;
		
		JLabel lblSplashScreen = new JLabel("");
		lblSplashScreen.setIcon(new ImageIcon("C:\\github-repos\\CSC8540_Hooli\\cfg\\SplashScreen.jpg"));
		lblSplashScreen.setBounds(0,5,1228,381);
		add(lblSplashScreen);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startGameClicked = true;
			}
		});
		btnStartGame.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStartGame.setBounds(935, 397, 141, 56);
		add(btnStartGame);
		
		JButton btnGameRules = new JButton("Game Rules");
		btnGameRules.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGameRules.setBounds(1088, 397, 141, 56);
		add(btnGameRules);

	}
}

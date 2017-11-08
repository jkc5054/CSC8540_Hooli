package MVC;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameModeView extends JPanel {

	public static String Key = "GAMEMODE";
	
	/**
	 * Create the panel.
	 */
	public GameModeView(MainPanel main) {
		setLayout(null);
		
		JLabel lblChooseGameMode = new JLabel("Choose your game mode!");
		lblChooseGameMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseGameMode.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChooseGameMode.setBounds(460, 5, 430, 110);
		add(lblChooseGameMode);
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.SinglePlayer();
			}
		});
		btnSinglePlayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSinglePlayer.setBounds(430, 150, 193, 92);
		add(btnSinglePlayer);
		
		JButton btnTwoPlayers = new JButton("Two Players");
		btnTwoPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.SinglePlayer();
			}
		});
		btnTwoPlayers.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTwoPlayers.setBounds(747, 150, 193, 92);
		add(btnTwoPlayers);
		
		//pri
		
		//Choose game level
		
				JLabel lblChooseGameLevel = new JLabel("Choose your game level!");
				lblChooseGameLevel.setHorizontalAlignment(SwingConstants.CENTER);
				lblChooseGameLevel.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblChooseGameLevel.setBounds(460, 300, 430, 110);
				add(lblChooseGameLevel);

				JButton btnLevelEasy = new JButton("Easy");
				btnLevelEasy.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnLevelEasy.setBounds(430, 450, 193, 92);
				btnLevelEasy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// add action here
					}
				});	
				
				
				JButton btnLevelHard = new JButton("Hard");
				btnLevelHard.setFont(new Font("Tahoma", Font.PLAIN, 25));
				btnLevelHard.setBounds(750, 450, 193, 92);
				btnLevelHard.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//add action here
					}
				});
				
			add(btnLevelEasy);
			add(btnLevelHard);		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(1100, 597, 100, 52);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.GoBack();
			}
		});
		
		add(btnBack);
		

	}

}

package MVC;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
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
		lblChooseGameMode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChooseGameMode.setBounds(10, 5, 430, 110);
		add(lblChooseGameMode);
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSinglePlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSinglePlayer.setBounds(10, 197, 193, 92);
		add(btnSinglePlayer);
		
		JButton btnTwoPlayers = new JButton("Two Players");
		btnTwoPlayers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTwoPlayers.setBounds(247, 197, 193, 92);
		add(btnTwoPlayers);

	}

}

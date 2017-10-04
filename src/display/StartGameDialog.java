package display;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

public class StartGameDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StartGameDialog dialog = new StartGameDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StartGameDialog() {
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblChooseYourGame = new JLabel("Choose your game mode!");
			lblChooseYourGame.setBounds(107, 0, 219, 77);
			lblChooseYourGame.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblChooseYourGame);
		}
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setBounds(62, 125, 125, 25);
		contentPanel.add(btnSinglePlayer);
		
		JButton btnTwoPlayers = new JButton("Two Players");
		btnTwoPlayers.setBounds(252, 125, 125, 25);
		contentPanel.add(btnTwoPlayers);
	}
}

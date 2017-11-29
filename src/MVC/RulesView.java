package MVC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import MVC.MainPanel;

public class RulesView extends JFrame implements Jpanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RulesView frame = new RulesView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Jpanel obj = new RulesView();
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RulesView() {
		setTitle("Rules");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setBounds(200, 200, 454, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtRules = new JTextArea();
		txtRules.setBounds(5, 5, 900, 600);
		txtRules.setEditable(false);
		txtRules.setFont(new Font("Bell MT", Font.PLAIN, 20));
		txtRules.setOpaque(false);
		txtRules.setText("********** Husker Du Instructions *******" + "\n\n" + 
		"* This is a memory match game" + "\n\n" +
		"* The game board consists of tiles, all flipped down" + "\n" +
		"* The player clicks on a tile to reveal it" + "\n" +
		"* Then makes a guess click on another tile" + "\n" +
		"* If the two tiles match, player gets 1 point" + "\n" +
		"* If no match, the two tiles flip back and player clicks the next tile and so on" + "\n\n" +
 		"* One player" + "\n"	+  "	Player plays until all the matches are found" + "\n" +
		"* Two players" + "\n" + "	Youngest player goes first" + "\n" + 
		"	continues to find matches until a match is not found" + "\n" +
		"	Player 2's turn to find matches until a match is not found" + "\n" +
		"	When all the matches are found, the player with highest points is the winner"); 
		
		
		contentPane.add(txtRules);
		//setSize(900,600);
		setSize(1400,1000);
		setVisible(true);
		
	}
	
	
	public void GameModeView(MainPanel main) {
			setLayout(null);
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					main.GoBack();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(597, 397, 193, 92);
			add(btnBack);
		}
	

}

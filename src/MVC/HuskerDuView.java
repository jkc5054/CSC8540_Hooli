package MVC;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;

public class HuskerDuView {

	private JFrame frame;
	
	private SplashPanel splashPanel;
	
	private MainPanel mainPanel;
	
	private HuskerDuController controller;
	
	/**
	 * Create the application.
	 */
	public HuskerDuView(HuskerDuController inController) {
		controller = inController;
		initialize();
		
	}
	
	public void LoadImages(ImageIconContainer[] images, ImageIcon defaultIcon) {
		mainPanel.LoadImages(images, defaultIcon);
		
	}
	
	public void UpdateScores() {
		mainPanel.UpdateScores();
	}
	
	public void SelectRandomImages(){
		mainPanel.SelectRandomImages();
	}
	
	public int GetRemainingUnrevealedTiles() {
		return mainPanel.GetRemainingUnrevealedTiles();
	}
	
	public ArrayList<ImageButton> getButtonList(){
		return mainPanel.getButtonList();
	}
	
	public void SetPlayersInView(AbstractPlayer player1, AbstractPlayer player2) {
		mainPanel.SetPlayersInView(player1, player2);
	}
	
	public void setCurrentPlayer(AbstractPlayer player) {
		mainPanel.setCurrentPlayer(player);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		mainPanel = new MainPanel(controller);
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setResizable(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 1000);
		frame.setVisible(true);
	}

}

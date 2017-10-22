package MVC;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private CardLayout cardLayout = new CardLayout();
	private SplashPanel splashPanel = new SplashPanel(this);
	private GameModeView gameModeView = new GameModeView(this);
	
	public MainPanel() {
		setLayout(cardLayout);
		add(splashPanel, SplashPanel.Key);
		add(gameModeView, GameModeView.Key);
	}
	
	public void StartGame() {
		cardLayout.show(this,  GameModeView.Key);
	}
	
	public void SinglePlayer() {
		
	}
	
	public void showCard(String key) {
		cardLayout.show(this, key);
	}
}

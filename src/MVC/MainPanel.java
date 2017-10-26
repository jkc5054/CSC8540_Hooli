package MVC;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private CardLayout cardLayout = new CardLayout();
	private SplashPanel splashPanel = new SplashPanel(this);
	private GameModeView gameModeView = new GameModeView(this);
	private BoardView boardView;
	private HuskerDuController controller; 
	
	public MainPanel(HuskerDuController inController) {
		setLayout(cardLayout);
		add(splashPanel, SplashPanel.Key);
		add(gameModeView, GameModeView.Key);
		controller = inController;
		//controller = new HuskerDuController();
		//controller = inController;
		//controller.LoadImages();
		//boardView = new BoardView(this, inIcons);
		//add(boardView, BoardView.Key);
	}
	
	public void LoadImages(ImageIconContainer[] inIcons, ImageIcon defaultIcon){
		boardView = new BoardView(this, inIcons, defaultIcon);
		add(boardView, BoardView.Key);
	}
	
	public void StartGame() {
		cardLayout.show(this,  GameModeView.Key);
	}
	
	public void SinglePlayer() {
		cardLayout.show(this,  BoardView.Key);
	}
	
	public void showCard(String key) {
		cardLayout.show(this, key);
	}
	
	public void SelectImage(ImageButton button) {
		controller.SelectImage(button);
	}
	
}

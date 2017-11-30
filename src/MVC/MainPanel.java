package MVC;

import java.awt.CardLayout;
import java.util.ArrayList;

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
	}
	
	public void LoadImages(ImageIconContainer[] inIcons, ImageIcon defaultIcon){
		boardView = new BoardView(this, inIcons, defaultIcon);
		add(boardView, BoardView.Key);
	}
	
	public void StartGame() {
		cardLayout.show(this,  GameModeView.Key);
	}
	
	public void SinglePlayer() {
		controller.SetupGame();
		cardLayout.show(this,  BoardView.Key);
		controller.StartGame();
	}
	
	public void showCard(String key) {
		cardLayout.show(this, key);
	}
	
	public void SelectImage(ImageButton button) {
		controller.SelectImage(button);
	}
	
	public void GoBack(){
		cardLayout.show(this, SplashPanel.Key);
	}
	
	public void SetPlayers(AbstractPlayer player1, AbstractPlayer player2) {
		controller.SetPlayers(player1, player2);
	}
	
	public void SetPlayersInView(AbstractPlayer player1, AbstractPlayer player2) {
		boardView.SetPlayers(player1, player2);
	}
	
	public void UpdateScores() {
		boardView.UpdateScores();
	}
	
	public void SelectRandomImages(){
		boardView.SelectRandomImages();
	}
	
	public ArrayList<ImageButton> getButtonList(){
		return boardView.getButtonList();
	}
	
	public int GetRemainingUnrevealedTiles() {
		return boardView.GetRemainingUnrevealedTiles();
	}
	
	public void setCurrentPlayer(AbstractPlayer player) {
		boardView.setCurrentPlayer(player);
	}
	
	public void setDifficulty(String inDifficulty) {
		if(inDifficulty.equals("Easy")) {
			controller.SetNumTiles(19);
		}
		else if(inDifficulty.equals("Hard")) {
			controller.SetNumTiles(23);
		}
	}
	
}

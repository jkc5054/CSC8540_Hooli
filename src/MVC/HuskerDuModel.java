
package MVC;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class HuskerDuModel {
	
	public ImageIconContainer[] arrayOfContainers;
	
	public ImageIcon defaultIcon;
	
	private ImageButton previousClick = null;
	
	public int numberOfUniqueImages = 23;
	

	AbstractPlayer Player1;
	AbstractPlayer Player2;
	AbstractPlayer CurrentPlayer;

	public void LoadImages()
	{
		File folder = new File(HooliConstants.CFG_PATH + "GameImages");
		ArrayList<File> listOfFiles = new ArrayList<File>(Arrays.asList(folder.listFiles()));
		ArrayList<ImageIconContainer> listOfContainers = new ArrayList<ImageIconContainer>();
		
		for(int i = 0; i < numberOfUniqueImages; i++) {
			Image img;
			try {
				img = ImageIO.read(listOfFiles.get(i));
				ImageIcon icon = new ImageIcon(img);
				ImageIconContainer container = new ImageIconContainer(icon, i);
				
				listOfContainers.add(container);
				listOfContainers.add(ImageIconContainer.CopyContainer(container));
				

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Collections.shuffle(listOfContainers);
		arrayOfContainers = listOfContainers.toArray(new ImageIconContainer[listOfContainers.size()]);		
		
		try {
			defaultIcon = new ImageIcon(ImageIO.read(new File(HooliConstants.CFG_PATH + "DefaultIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void SetPlayers(AbstractPlayer inPlayer1, AbstractPlayer inPlayer2)
	{
		Player1 = inPlayer1;
		Player2 = inPlayer2;
		CurrentPlayer = Player1;
	}
	
	public void SwitchPlayer(){
		if(CurrentPlayer == Player1){
			CurrentPlayer = Player2;
		}
		else{
			CurrentPlayer = Player1;
		}
	}
	
	public void IncrementScoreForCurrentPlayer(){
		CurrentPlayer.scoreUp();
	}
	
	public ClickResult SelectButton(ImageButton button) {
		ClickResult result = new ClickResult();
		Player1.AddSeenImage(button);
		Player2.AddSeenImage(button);

		if(previousClick == null) {
			previousClick = button;
			result.IsMatch = false;
			result.IsSecondButton = false;
		}
		else{
			result.IsSecondButton = true;
			result.btn1 = previousClick;
			result.btn2 = button;
			if(previousClick.indexInKey == button.indexInKey){
				result.IsMatch = true;
			}
			else
			{
				result.IsMatch = false;
			}			
			previousClick = null;
		}
		return result;
	}
	
	//pri
	public String getWinner(){
		if(Player1.getScore() > Player2.getScore())
			return "Player 1";
		else 
			return "Player 2";
	}
	
	
	
	
}

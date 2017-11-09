package MVC;

import java.util.ArrayList;

public class ComputerPlayer extends AbstractPlayer {

	ArrayList<ImageButton> buttonList = new ArrayList<ImageButton>();
	
	public ComputerPlayer(String name) {
		super(name);
	}
	
	public void AddSeenImage(ImageButton inBtn) {
		buttonList.add(inBtn);
	}
	
	public void SelectImages() {
		
	}

}

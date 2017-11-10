package MVC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ComputerPlayer extends AbstractPlayer {

	ArrayList<ImageButton> buttonList = new ArrayList<ImageButton>();
	int ChanceToPickPair = 50;
	
	public ComputerPlayer(String name) {
		super(name);
	}
	
	public void AddSeenImage(ImageButton inBtn) {
		synchronized(buttonList){
			buttonList.add(inBtn);
			Collections.shuffle(buttonList);
		}
	}
	
	public void SelectImages() {
		HashMap<Integer, ImageButton> imageMap = new HashMap<Integer, ImageButton>();
		
		synchronized(buttonList){
			for(ImageButton btn : buttonList){
				synchronized(btn){
					if(imageMap.containsKey(btn.indexInKey)){
						btn.Select();
						imageMap.get(btn.indexInKey).Select();
				 	}
					else{
						imageMap.put(btn.indexInKey, btn);
					}
				}
			}
		}
	}
	
	public boolean CanSelectImages(){
		ArrayList<Integer> knownIndexes = new ArrayList<Integer>();
		
		synchronized(buttonList){
			for(ImageButton btn : buttonList){
				if(knownIndexes.contains(btn.indexInKey)){
					return true;
			 	}
				else{
					knownIndexes.add(btn.indexInKey);
				}
			}
		}

		
		return false;
	}
	
	public boolean SelectsRandomImages(){
		return true;
	}

}

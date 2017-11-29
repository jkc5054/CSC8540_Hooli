package MVC;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {

	ArrayList<ImageButton> seenButtonList = new ArrayList<ImageButton>();
	ArrayList<ImageButton> masterButtonList = new ArrayList<ImageButton>();
	int ChanceToPickPair = 50;
	
	public ComputerPlayer(String name) {
		super(name);
	}
	
	public void AddSeenImage(ImageButton inBtn) {
		if(!seenButtonList.contains(inBtn)) {
			seenButtonList.add(inBtn);
			Collections.shuffle(seenButtonList);
		}		
	}
	
	public void SetImageList(ArrayList<ImageButton> inList) {
		masterButtonList = inList;
	}
	
	public void RemoveImages(ImageButton btn1, ImageButton btn2) {
		masterButtonList.remove(btn1);
		masterButtonList.remove(btn2);
		seenButtonList.remove(btn1);
		seenButtonList.remove(btn2);
	}
	
	public void ChooseImage(ImageButton btn) {
		
	}
	
	public void SelectImages() {
		HashMap<Integer, ImageButton> imageMap = new HashMap<Integer, ImageButton>();
		
		Random r = new Random();
		int chance = r.nextInt(99) + 1;
		
		if(CanSelectImages() && (chance > this.ChanceToPickPair))
		{
			for(ImageButton btn : seenButtonList){
				if(imageMap.containsKey(btn.indexInKey)){
					this.selectedImage1 = btn;
					this.selectedImage2 = imageMap.get(btn.indexInKey);
					selectedImage1.Select();
					selectedImage2.Select();
					break;
			 	}
				else{
					imageMap.put(btn.indexInKey, btn);
				}
			}
			
			seenButtonList.remove(selectedImage1);
			seenButtonList.remove(selectedImage2);
		}
		else
		{
			SelectRandomImages();
		}
	}
	
	public boolean CanSelectImages(){
		ArrayList<Integer> knownIndexes = new ArrayList<Integer>();
		
		for(ImageButton btn : seenButtonList){
			if(knownIndexes.contains(btn.indexInKey)){
				
				return true;
		 	}
			else{
				knownIndexes.add(btn.indexInKey);
			}
		}
				
		return false;
	}
	
	public void SelectRandomImages(){
		Random r = new Random();
		String log = "Beginning SelectRandomImages\n";
		boolean firstButtonFound = false;
		boolean secondButtonFound = false;
		
		int idx1 = 0, idx2 = 0;
		while(!firstButtonFound){
			
			idx1 = r.nextInt(masterButtonList.size()-1);
			log += "idx1 attempt = " + idx1 + "\n";
			
			if(masterButtonList.get(idx1).getIcon() == masterButtonList.get(idx1).defaultIcon)
			{
				firstButtonFound = true;
				log += "idx1 accepted. Value = " + masterButtonList.get(idx1).indexInKey + "\n\n";
			}
		}
		
		while(!secondButtonFound){
			idx2 = r.nextInt(masterButtonList.size()-1);
			log += "idx2 attempt = " + idx2 + "\n";
			if(masterButtonList.get(idx2).getIcon() == masterButtonList.get(idx2).defaultIcon && idx1 != idx2){
				secondButtonFound = true;
				log += "idx2 accepted. Value = " + masterButtonList.get(idx2).indexInKey + "\n\n";
			}
		}
		
		this.selectedImage1 = masterButtonList.get(idx1);
		this.selectedImage2 = masterButtonList.get(idx2);
		
		this.selectedImage1.Select();
		this.selectedImage2.Select();

		Path p = Paths.get(HooliConstants.LOG_PATH + System.currentTimeMillis());
		try {
			Files.write(p, Arrays.asList(log), Charset.forName("UTF-8") );
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public boolean SelectsRandomImages(){
		return true;
	}

}

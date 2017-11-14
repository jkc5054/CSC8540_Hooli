package MVC;

import java.util.ArrayList;

public class HumanPlayer extends AbstractPlayer {

	ImageButton img1 = null;
	ImageButton img2 = null;
	

	
	public HumanPlayer(String name) {
		super(name);
	}
	
	public void AddSeenImage(ImageButton inBtn) {
		
	}
	
	public void ChooseImage(ImageButton btn) {
		if(img1 == null)
		{
			img1 = btn;
		}
		else 
		{
			img2 = btn;
		}
	}
	
	public void SelectImages() {
		while(img1 == null || img2 == null)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		selectedImage1 = img1;
		selectedImage2 = img2;
		
		img1 = null;
		img2 = null;
		
	}
	
	public boolean CanSelectImages(){
		return false;
	}
	
	public boolean SelectsRandomImages(){
		return false;
	}
	
	
	
	public void SetImageList(ArrayList<ImageButton> inList) {
		
	}

}

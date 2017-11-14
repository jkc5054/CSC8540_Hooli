package MVC;

import java.util.ArrayList;

public abstract class AbstractPlayer {
	
	private int score;
	private String name;
	
	ImageButton selectedImage1 = null;
	ImageButton selectedImage2 = null;
	
	public AbstractPlayer(String name){
		this.setName(name);
		score=0;
	}

	public int scoreUp(){
		return score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public int resetScore(){
		score=0;
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void AddSeenImage(ImageButton inImage);
	public abstract void SelectImages();
	public abstract boolean CanSelectImages();
	public abstract boolean SelectsRandomImages();
	public abstract void SetImageList(ArrayList<ImageButton> inList);
	public abstract void ChooseImage(ImageButton btn);
	
	
	

	
}
package MVC;

public class Player {
	
	private int score;
	private String name;
	
	public Player(String name){
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

	
}
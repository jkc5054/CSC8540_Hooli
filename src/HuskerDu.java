
public class HuskerDu {
	
	HuskerDuBoard board;
	Player player1;
	Player player2;
	//We might need to manage our game mode logic in this class
	
	public HuskerDu(Player player1, Player player2){
		
		board = new HuskerDuBoard();
		this.player1 = player1; 
		this.player2 = player2;
	}
	
	public HuskerDu(Player player){
		board = new HuskerDuBoard();
		this.player1 = player;
		player2 = null;
	}
	
	
	public void loadTiles(){
		//for loop to load 38 flipTiles
	
	}
	
	public void checkForMatch(){
		
		//check with imageicon description which is set in the board class
		
	}
	
	public void win(){
		//when all the matches are found
	}
	
	

}

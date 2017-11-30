import javax.swing.ImageIcon;

public class HuskerDuTile {
	
	ImageIcon tile;
	boolean revealed;
	
	public HuskerDuTile(){
		tile = null;
		revealed = false;	
		
	}
		
	public HuskerDuTile(ImageIcon tile){
		this.tile = tile;
	}

	public ImageIcon getTile() {
		return tile;
	}

	public void setTile(ImageIcon tile) {
		this.tile = tile;
	}

	public boolean isRevealed() {
		return revealed;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

}

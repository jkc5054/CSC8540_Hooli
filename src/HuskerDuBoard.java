import java.util.ArrayList;

import javax.swing.ImageIcon;

public class HuskerDuBoard {
	
	ArrayList<HuskerDuTile> boardList1 = new ArrayList<>();
	ArrayList<HuskerDuTile> boardList2 = new ArrayList<>();
	ImageIcon flipImage = new ImageIcon(getClass().getResource("flipImage.jpeg"));
	HuskerDuTile flipTile = new HuskerDuTile(flipImage);
	public HuskerDuBoard(){
		
		//ImageIcon flipImage = new ImageIcon(getClass().getResource("flipImage.jpeg"));
		//HuskerDuTile flipTile = new HuskerDuTile(flipImage);
		
		ImageIcon image1 = new ImageIcon(getClass().getResource("image1.jpeg"));
		HuskerDuTile tile1 = new HuskerDuTile(image1);
		
		ImageIcon image2 = new ImageIcon(getClass().getResource("image2.jpeg"));
		HuskerDuTile tile2 = new HuskerDuTile(image2);
		
		ImageIcon match1 = new ImageIcon(getClass().getResource("image1.jpeg"));
		HuskerDuTile tile11 = new HuskerDuTile(match1);
		
		ImageIcon match2 = new ImageIcon(getClass().getResource("image2.jpeg"));
		HuskerDuTile tile22 = new HuskerDuTile(match2);
		
		boardList1.add(tile1);
		boardList1.add(tile2);
		boardList2.add(tile11);
		boardList2.add(tile22);
	
		image1.setDescription("image1");
		image2.setDescription("image2");
		match1.setDescription("image1");
		match2.setDescription("image2");
		
	}
	
	public HuskerDuTile getATile(int i){
		
		HuskerDuTile tile = new HuskerDuTile();
		tile = boardList1.remove(i);
		return tile;
		
	}
	
	public HuskerDuTile getMatchingTile(int i){
		
		HuskerDuTile tile = new HuskerDuTile();
		tile = boardList2.remove(i);
		return tile;
		
	}
	
	public HuskerDuTile getFlippedTile(){
		
		HuskerDuTile tile = new HuskerDuTile();
		tile = flipTile;
		return tile;
		
		
	}
	

}

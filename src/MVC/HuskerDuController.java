package MVC;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HuskerDuController {
	
	private HuskerDuModel model;
	private HuskerDuView view;
	public ImageIconContainer[] arrayOfContainers;
	public AbstractPlayer Player1;
	public AbstractPlayer Player2;
		
	
	public HuskerDuController() {
		model = new HuskerDuModel();
	}
	
	public void LoadImages() {
		model.LoadImages();
		arrayOfContainers = model.arrayOfContainers;
		view = new HuskerDuView(this);
		view.LoadImages(arrayOfContainers, model.defaultIcon);
		//test pri
		//System.out.println("Remaining : " + view.GetRemainingUnrevealedTiles());
	}
	
	public void SetPlayers(AbstractPlayer inPlayer1, AbstractPlayer inPlayer2){
		Player1 = inPlayer1;
		Player2 = inPlayer2;
		Player1.SetImageList(view.getButtonList());
		Player2.SetImageList(view.getButtonList());
		model.SetPlayers(inPlayer1, inPlayer2);
	}
	
	public void SelectImage(ImageButton inButton) {
		Player1.AddSeenImage(inButton);
		Player2.AddSeenImage(inButton);
		model.CurrentPlayer.ChooseImage(inButton);
	}
	
	public void SetNumTiles(int tiles) {
		model.numberOfTiles = tiles;
	}
	
	public void StartGame() {
		Thread resetIconThread = null;
	    do {

			view.setCurrentPlayer(model.CurrentPlayer);
			model.CurrentPlayer.SelectImages();
			
			if(model.CurrentPlayer.selectedImage1.indexInKey == model.CurrentPlayer.selectedImage2.indexInKey) {
				Player1.RemoveImages(model.CurrentPlayer.selectedImage1, model.CurrentPlayer.selectedImage2);
				Player2.RemoveImages(model.CurrentPlayer.selectedImage1, model.CurrentPlayer.selectedImage2);
				model.CurrentPlayer.selectedImage1.setEnabled(false);
				model.CurrentPlayer.selectedImage2.setEnabled(false);
				model.IncrementScoreForCurrentPlayer();
				view.UpdateScores();
			}
			else {
				ResetIconRunnable runnable = new ResetIconRunnable(model.CurrentPlayer.selectedImage1, model.CurrentPlayer.selectedImage2);
				resetIconThread = new Thread(runnable);
				resetIconThread.start();
				model.SwitchPlayer();
			}
			
			try {
				resetIconThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (view.GetRemainingUnrevealedTiles() > 0);
		//test pri
		//System.out.println("Game over. The winner is " );//p
		//model.getWinner();//p
		JOptionPane.showMessageDialog(null, "The winner is " +model.getWinner());
	}
	
	public class WaitRunnable implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HuskerDuController controller = new HuskerDuController();
					controller.LoadImages();
					//HuskerDuView window = new HuskerDuView();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

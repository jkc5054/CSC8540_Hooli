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

public class HuskerDuController {
	/*
	public ImageIcon[] arrayOfIcons;
	
	public void LoadImages()
	{
		File folder = new File("C:\\github-repos\\Hooli\\cfg\\GameImages");
		ArrayList<File> listOfFiles = new ArrayList<File>(Arrays.asList(folder.listFiles()));
		ArrayList<ImageIcon> listOfIcons = new ArrayList<ImageIcon>();
		
		for(int i = 0; i < listOfFiles.size(); i++) {
			Image img;
			try {
				img = ImageIO.read(listOfFiles.get(i));
				listOfIcons.add(new ImageIcon(img));
				listOfIcons.add(new ImageIcon(img));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Collections.shuffle(listOfIcons);
		arrayOfIcons = listOfIcons.toArray(new ImageIcon[listOfIcons.size()]);
		
	}
	*/
	private HuskerDuModel model;
	private HuskerDuView view;
	public ImageIconContainer[] arrayOfContainers;
	
	public HuskerDuController() {
		model = new HuskerDuModel();
	}
	
	public void LoadImages() {
		model.LoadImages();
		arrayOfContainers = model.arrayOfContainers;
		view = new HuskerDuView(this);
		view.LoadImages(arrayOfContainers, model.defaultIcon);
	}
	
	public void SelectImage(ImageButton inButton) {
		ClickResult result = model.SelectButton(inButton);
		
		if(result.IsSecondButton)
		{
			if(result.IsMatch) {
				result.btn1.setEnabled(false);
				result.btn2.setEnabled(false);
			}
			else
			{
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result.btn1.setToDefault();
				result.btn2.setToDefault();
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

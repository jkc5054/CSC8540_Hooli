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
				ResetIconRunnable runnable = new ResetIconRunnable(result.btn1, result.btn2);
				(new Thread(runnable)).start();
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

package MVC;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class HuskerDuController {
	
	public ArrayList<ImageIcon> listOfIcons;
	
	public void LoadImages()
	{
		File folder = new File("C:\\github-repos\\Hooli\\cfg\\GameImages");
		ArrayList<File> listOfFiles = new ArrayList<File>(Arrays.asList(folder.listFiles()));
		listOfIcons = new ArrayList<ImageIcon>();
		
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
	}
}


package MVC;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class HuskerDuModel {
	
	public ImageIconContainer[] arrayOfContainers;
	
	public ImageIcon defaultIcon;
	
	private ImageButton previousClick = null;
	
		
	public void LoadImages()
	{
		File folder = new File(HooliConstants.CFG_PATH + "GameImages");
		ArrayList<File> listOfFiles = new ArrayList<File>(Arrays.asList(folder.listFiles()));
		ArrayList<ImageIconContainer> listOfContainers = new ArrayList<ImageIconContainer>();
		
		for(int i = 0; i < listOfFiles.size(); i++) {
			Image img;
			try {
				img = ImageIO.read(listOfFiles.get(i));
				ImageIcon icon = new ImageIcon(img);
				ImageIconContainer container = new ImageIconContainer(icon, i);
				
				listOfContainers.add(container);
				listOfContainers.add(ImageIconContainer.CopyContainer(container));
				

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Collections.shuffle(listOfContainers);
		arrayOfContainers = listOfContainers.toArray(new ImageIconContainer[listOfContainers.size()]);		
		
		try {
			defaultIcon = new ImageIcon(ImageIO.read(new File(HooliConstants.CFG_PATH + "DefaultIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ClickResult SelectButton(ImageButton button) {
		ClickResult result = new ClickResult();
		if(previousClick == null) {
			previousClick = button;
			result.IsMatch = false;
			result.IsSecondButton = false;
		}
		else{
			result.IsSecondButton = true;
			result.btn1 = previousClick;
			result.btn2 = button;
			if(previousClick.indexInKey == button.indexInKey){
				result.IsMatch = true;
				
			}
			else
			{
				result.IsMatch = false;
			}			
			previousClick = null;
		}
		return result;
	}
	
	
	
	
	
	
}

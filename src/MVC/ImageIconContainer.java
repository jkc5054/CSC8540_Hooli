package MVC;

import javax.swing.ImageIcon;

public class ImageIconContainer {
	public ImageIcon icon;
	public int key;
	
	public ImageIconContainer() {
		
	}
	
	public ImageIconContainer(ImageIcon inIcon, int inKey) {
		icon = inIcon;
		key = inKey;
	}
	
	public static ImageIconContainer CopyContainer(ImageIconContainer inContainerToCopy) {
		ImageIconContainer newContainer = new ImageIconContainer(inContainerToCopy.icon, inContainerToCopy.key);
		return newContainer;
	}
}

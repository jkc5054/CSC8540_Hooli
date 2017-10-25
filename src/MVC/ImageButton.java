package MVC;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageButton extends JButton {
	
	Icon icon = null;
	
	public ImageButton() {
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(icon != null) {
					setIcon(icon);
				}
			}
		});
	}
	
	public void setIconProperty(Icon inIcon) {
		icon = inIcon;
	}
	
}

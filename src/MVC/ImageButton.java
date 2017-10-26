package MVC;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageButton extends JButton {
	
	Icon icon = null;
	
	Icon defaultIcon = null;
	
	MainPanel main;
	
	public int indexInKey = -1;
	
	public ImageButton(Icon inDefaultIcon, MainPanel inMain) {
		defaultIcon = inDefaultIcon;
		setIcon(defaultIcon);
		main = inMain;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(icon != null) {
					setIcon(icon);
					main.SelectImage((ImageButton)arg0.getSource());
				}
			}
		});
	}
	
	public void setIconProperty(Icon inIcon) {
		icon = inIcon;
	}
	
	public void setToDefault() {
		setIcon(defaultIcon);
	}
	
	
}

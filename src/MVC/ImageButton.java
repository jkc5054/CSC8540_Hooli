package MVC;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
				Select();
			}
		});
	}
	
	public void setIconProperty(Icon inIcon) {
		icon = inIcon;
	}
	
	public void setToDefault() {
		setIcon(defaultIcon);
	}
	
	public void Select() {
		if(icon != null && isEnabled()) 
		{
			if(getIcon() == defaultIcon) 
			{
				/*
				SelectIconRunnable runnable = new SelectIconRunnable(this);
				(new Thread(runnable)).start();
			}
			else
			{
				PerformButtonAction();
				*/
				PerformButtonAction();
			}
		}
	}
	
	public void PerformButtonAction() {
		setIcon(icon);
		main.SelectImage(this);
	}
}

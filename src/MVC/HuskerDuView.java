package MVC;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;

public class HuskerDuView {

	private JFrame frame;
	
	private SplashPanel splashPanel;
	
	private MainPanel mainPanel;
	
	private HuskerDuController controller;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HuskerDuView window = new HuskerDuView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public HuskerDuView(HuskerDuController inController) {
		controller = inController;
		initialize();

	}
	
	public void LoadImages(ImageIconContainer[] images, ImageIcon defaultIcon) {
		mainPanel.LoadImages(images, defaultIcon);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		mainPanel = new MainPanel(controller);
		//splashPanel = new SplashPanel();
		
		//splashPanel.addproper
		//frame.getContentPane().setSize(new Dimension(1250, 500));
		//frame.setSize(new Dimension(1250, 500));
		//frame.setBounds(0, 0, 1250, 500);
		
		
		//JPanel mainPanel = new JPanel();		
		//mainPanel.setSize(new Dimension(1250, 500));
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setResizable(true);
		frame.pack();
	//	frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 1000);
		//mainPanel.add(splashPanel);
		frame.setVisible(true);
	}

}

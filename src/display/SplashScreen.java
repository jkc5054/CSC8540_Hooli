package display;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SplashScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SplashScreen() {
		setTitle("Husker Du");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1241, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(987, 394, 97, 25);
		contentPane.add(btnStartGame);
		
		JButton btnGameRules = new JButton("Game Rules");
		btnGameRules.setBounds(1096, 394, 119, 25);
		contentPane.add(btnGameRules);
		
		JLabel lblSplashScreen = new JLabel("");
		lblSplashScreen.setIcon(new ImageIcon("C:\\github-repos\\CSC8540_Hooli\\cfg\\SplashScreen.jpg"));
		lblSplashScreen.setBounds(0, 0, 1228, 381);
		contentPane.add(lblSplashScreen);
		
		//Graphics g = lblSplashScreen.getGraphics();
		//g.drawImage(LoadSplashScreen(), lblSplashScreen.getWidth(), lblSplashScreen.getHeight(), new ImageObserver())
	}
	
	private BufferedImage LoadSplashScreen() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("C:\\github-repos\\CSC8540_Hooli\\cfg\\SplashScreen.jpg"));
		} catch (IOException e) {
			System.out.println("Exception loading image" + e.getMessage());
		}
		return img;
	}
}

package MVC;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.Dimension;

public class BoardView extends JPanel {

	private static final long serialVersionUID = 1L;

	public static String Key = "BOARDVIEW";

	AbstractPlayer player1, player2;
	
	JTextArea textArea;
	JTextArea textArea_1;
	
	JLabel lblPlayerScore;
	JLabel lblPlayerScore_1;
	
	JTextArea currentPlayerText;
	
	private boolean CurrentlySelecting = false;

	private ArrayList<ImageButton> buttons = new ArrayList<ImageButton>();
	/**
	 * Create the panel.
	 */
	public BoardView(MainPanel main, ImageIconContainer[] iconsToUse, ImageIcon defaultIcon) {
		setSize(new Dimension(12000, 900));
		setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(1059, 226, 174, 100);
		textArea.setFont(new Font("Tahoma", Font.BOLD,60));
		textArea.setText("    0");
		add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(1059, 380, 174, 100);
		textArea_1.setFont(new Font("Tahoma", Font.BOLD,60));
		textArea_1.setText("    0");
		add(textArea_1);
		
		JLabel gameLevel = new JLabel("Level");
		gameLevel.setFont(new Font("Tahoma", Font.BOLD, 30));
		gameLevel.setBounds(937, 50, 124, 40);
		add(gameLevel);
		
		JTextArea level = new JTextArea();
		level.setBounds(1050, 50, 124, 40);
		level.setEditable(false);
		level.setFont(new Font("Tahoma", Font.BOLD,30));
		if(iconsToUse.length==38){level.setText("Easy");}
		else level.setText("Hard");
		add(level);
		
		lblPlayerScore = new JLabel();
		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPlayerScore.setBounds(850, 260, 200, 40);
		add(lblPlayerScore);
		
		lblPlayerScore_1 = new JLabel();
		lblPlayerScore_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPlayerScore_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore_1.setBounds(850, 410, 200, 40);
		add(lblPlayerScore_1);
		
		ImageButton imageButton = new ImageButton(defaultIcon, main);
		imageButton.setBounds(310, 11, 80, 80);
		add(imageButton);
		buttons.add(imageButton);
		
		ImageButton imageButton_1 = new ImageButton(defaultIcon, main);
		imageButton_1.setBounds(400, 11, 80, 80);
		add(imageButton_1);
		buttons.add(imageButton_1);
		
		ImageButton imageButton_2 = new ImageButton(defaultIcon, main);
		imageButton_2.setBounds(400, 458, 80, 80);
		add(imageButton_2);
		buttons.add(imageButton_2);
		
		ImageButton imageButton_3 = new ImageButton(defaultIcon, main);
		imageButton_3.setBounds(490, 458, 80, 80);
		add(imageButton_3);
		buttons.add(imageButton_3);
		
		ImageButton imageButton_4 = new ImageButton(defaultIcon, main);
		imageButton_4.setBounds(260, 94, 80, 80);
		add(imageButton_4);
		buttons.add(imageButton_4);
		
		ImageButton imageButton_5 = new ImageButton(defaultIcon, main);
		imageButton_5.setBounds(350, 94, 80, 80);
		add(imageButton_5);
		buttons.add(imageButton_5);
		
		ImageButton imageButton_6 = new ImageButton(defaultIcon, main);
		imageButton_6.setBounds(440, 94, 80, 80);
		add(imageButton_6);
		buttons.add(imageButton_6);
		
		ImageButton imageButton_7 = new ImageButton(defaultIcon, main);
		imageButton_7.setBounds(530, 94, 80, 80);
		add(imageButton_7);
		buttons.add(imageButton_7);
		
		ImageButton imageButton_8 = new ImageButton(defaultIcon, main);
		imageButton_8.setBounds(620, 94, 80, 80);
		add(imageButton_8);
		buttons.add(imageButton_8);
		
		ImageButton imageButton_9 = new ImageButton(defaultIcon, main);
		imageButton_9.setBounds(710, 94, 80, 80);
		add(imageButton_9);
		buttons.add(imageButton_9);
		
		ImageButton imageButton_10 = new ImageButton(defaultIcon, main);
		imageButton_10.setBounds(170, 94, 80, 80);
		add(imageButton_10);
		buttons.add(imageButton_10);
		
		ImageButton imageButton_11 = new ImageButton(defaultIcon, main);
		imageButton_11.setBounds(80, 94, 80, 80);
		add(imageButton_11);
		buttons.add(imageButton_11);
		
		ImageButton imageButton_12 = new ImageButton(defaultIcon, main);
		imageButton_12.setBounds(80, 185, 80, 80);
		add(imageButton_12);
		buttons.add(imageButton_12);
		
		ImageButton imageButton_13 = new ImageButton(defaultIcon, main);
		imageButton_13.setBounds(170, 185, 80, 80);
		add(imageButton_13);
		buttons.add(imageButton_13);
		
		ImageButton imageButton_14 = new ImageButton(defaultIcon, main);
		imageButton_14.setBounds(260, 185, 80, 80);
		add(imageButton_14);
		buttons.add(imageButton_14);
		
		ImageButton imageButton_15 = new ImageButton(defaultIcon, main);
		imageButton_15.setBounds(350, 185, 80, 80);
		add(imageButton_15);
		buttons.add(imageButton_15);
		
		ImageButton imageButton_16 = new ImageButton(defaultIcon, main);
		imageButton_16.setBounds(440, 185, 80, 80);
		add(imageButton_16);
		buttons.add(imageButton_16);
		
		ImageButton imageButton_17 = new ImageButton(defaultIcon, main);
		imageButton_17.setBounds(530, 185, 80, 80);
		add(imageButton_17);
		buttons.add(imageButton_17);
		
		ImageButton imageButton_18 = new ImageButton(defaultIcon, main);
		imageButton_18.setBounds(620, 185, 80, 80);
		add(imageButton_18);
		buttons.add(imageButton_18);
		
		ImageButton imageButton_19 = new ImageButton(defaultIcon, main);
		imageButton_19.setBounds(710, 185, 80, 80);
		add(imageButton_19);
		buttons.add(imageButton_19);
		
		ImageButton imageButton_20 = new ImageButton(defaultIcon, main);
		imageButton_20.setBounds(80, 276, 80, 80);
		add(imageButton_20);
		buttons.add(imageButton_20);
		
		ImageButton imageButton_21 = new ImageButton(defaultIcon, main);
		imageButton_21.setBounds(170, 276, 80, 80);
		add(imageButton_21);
		buttons.add(imageButton_21);
		
		ImageButton imageButton_22 = new ImageButton(defaultIcon, main);
		imageButton_22.setBounds(260, 276, 80, 80);
		add(imageButton_22);
		buttons.add(imageButton_22);
		
		ImageButton imageButton_23 = new ImageButton(defaultIcon, main);
		imageButton_23.setBounds(350, 276, 80, 80);
		add(imageButton_23);
		buttons.add(imageButton_23);
		
		ImageButton imageButton_24 = new ImageButton(defaultIcon, main);
		imageButton_24.setBounds(440, 276, 80, 80);
		add(imageButton_24);
		buttons.add(imageButton_24);
		
		ImageButton imageButton_25 = new ImageButton(defaultIcon, main);
		imageButton_25.setBounds(530, 276, 80, 80);
		add(imageButton_25);
		buttons.add(imageButton_25);
		
		ImageButton imageButton_26 = new ImageButton(defaultIcon, main);
		imageButton_26.setBounds(620, 276, 80, 80);
		add(imageButton_26);
		buttons.add(imageButton_26);
		
		ImageButton imageButton_27 = new ImageButton(defaultIcon, main);
		imageButton_27.setBounds(710, 276, 80, 80);
		add(imageButton_27);
		buttons.add(imageButton_27);
		
		ImageButton imageButton_28 = new ImageButton(defaultIcon, main);
		imageButton_28.setBounds(80, 367, 80, 80);
		add(imageButton_28);
		buttons.add(imageButton_28);
		
		ImageButton imageButton_29 = new ImageButton(defaultIcon, main);
		imageButton_29.setBounds(170, 367, 80, 80);
		add(imageButton_29);
		buttons.add(imageButton_29);
		
		ImageButton imageButton_30 = new ImageButton(defaultIcon, main);
		imageButton_30.setBounds(260, 367, 80, 80);
		add(imageButton_30);
		buttons.add(imageButton_30);
		
		ImageButton imageButton_31 = new ImageButton(defaultIcon, main);
		imageButton_31.setBounds(350, 367, 80, 80);
		add(imageButton_31);
		buttons.add(imageButton_31);
		
		ImageButton imageButton_32 = new ImageButton(defaultIcon, main);
		imageButton_32.setBounds(440, 367, 80, 80);
		add(imageButton_32);
		buttons.add(imageButton_32);
		
		ImageButton imageButton_33 = new ImageButton(defaultIcon, main);
		imageButton_33.setBounds(530, 367, 80, 80);
		add(imageButton_33);
		buttons.add(imageButton_33);
		
		ImageButton imageButton_34 = new ImageButton(defaultIcon, main);
		imageButton_34.setBounds(620, 367, 80, 80);
		add(imageButton_34);
		buttons.add(imageButton_34);
		
		ImageButton imageButton_35 = new ImageButton(defaultIcon, main);
		imageButton_35.setBounds(710, 367, 80, 80);
		add(imageButton_35);
		buttons.add(imageButton_35);
		
		ImageButton imageButton_38 = new ImageButton(defaultIcon, main);
		imageButton_38.setBounds(310, 458, 80, 80);
		add(imageButton_38);
		buttons.add(imageButton_38);
		
		ImageButton imageButton_36 = new ImageButton(defaultIcon, main);
		imageButton_36.setBounds(490, 11, 80, 80);
		add(imageButton_36);
		buttons.add(imageButton_36);
		
		/*adding more images*/
		if(iconsToUse.length==46){
		ImageButton imageButton_39 = new ImageButton(defaultIcon, main);
		imageButton_39.setBounds(130, 11, 80, 80);
		add(imageButton_39);
		buttons.add(imageButton_39);
		
		ImageButton imageButton_40 = new ImageButton(defaultIcon, main);
		imageButton_40.setBounds(220, 11, 80, 80);
		add(imageButton_40);
		buttons.add(imageButton_40);
		
		ImageButton imageButton_41 = new ImageButton(defaultIcon, main);
		imageButton_41.setBounds(580, 11, 80, 80);
		add(imageButton_41);
		buttons.add(imageButton_41);
		
		ImageButton imageButton_42 = new ImageButton(defaultIcon, main);
		imageButton_42.setBounds(670, 11, 80, 80);
		add(imageButton_42);
		buttons.add(imageButton_42);
		
		ImageButton imageButton_43 = new ImageButton(defaultIcon, main);
		imageButton_43.setBounds(130, 458, 80, 80);
		add(imageButton_43);
		buttons.add(imageButton_43);
		
		ImageButton imageButton_44 = new ImageButton(defaultIcon, main);
		imageButton_44.setBounds(220, 458, 80, 80);
		add(imageButton_44);
		buttons.add(imageButton_44);
		
		ImageButton imageButton_45 = new ImageButton(defaultIcon, main);
		imageButton_45.setBounds(580, 458, 80, 80);
		add(imageButton_45);
		buttons.add(imageButton_45);
		
		ImageButton imageButton_46 = new ImageButton(defaultIcon, main);
		imageButton_46.setBounds(670, 458, 80, 80);
		add(imageButton_46);
		buttons.add(imageButton_46);
		
		}
		for(int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setIconProperty(iconsToUse[i].icon);
			buttons.get(i).indexInKey = iconsToUse[i].key;
		}
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.StartGame();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(347, 597, 193, 92);
		add(btnBack);
		
		JLabel currentPlayerLabel = new JLabel("Current Player");
		currentPlayerLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		currentPlayerLabel.setBounds(800, 133, 261, 30);
		add(currentPlayerLabel);
		
		currentPlayerText = new JTextArea();
		currentPlayerText.setFont(new Font("Tahoma", Font.BOLD, 30));
		currentPlayerText.setEditable(false);
		currentPlayerText.setBounds(1050, 123, 220, 40);
		add(currentPlayerText);

	}
	
	public void SetPlayers(AbstractPlayer inPlayer1, AbstractPlayer inPlayer2) {
		player1 = inPlayer1;
		player2 = inPlayer2;
		
		lblPlayerScore.setText(player1.getName());
		lblPlayerScore_1.setText(player2.getName());
	}
	
	public void UpdateScores(){
		textArea.setText(""+player1.getScore());
		textArea_1.setText(""+player2.getScore());
	}
	
	public void SelectRandomImages(){
		if(!CurrentlySelecting)
		{
			CurrentlySelecting = true;
			Random r = new Random();
			String log = "Beginning SelectRandomImages\n";
			boolean firstButtonFound = false;
			boolean secondButtonFound = false;
			
			int idx1 = 0, idx2 = 0;
			while(!firstButtonFound){
				
				idx1 = r.nextInt(buttons.size()-1);
				log += "idx1 attempt = " + idx1 + "\n";
				
				if(buttons.get(idx2).getIcon() == buttons.get(idx2).defaultIcon)
				{
					firstButtonFound = true;
					log += "idx1 accepted. Value = " + buttons.get(idx1).indexInKey + "\n\n";
				}
			}
			
			while(!secondButtonFound){
				idx2 = r.nextInt(buttons.size()-1);
				log += "idx2 attempt = " + idx2 + "\n";
				if(buttons.get(idx2).getIcon() == buttons.get(idx2).defaultIcon && idx1 != idx2){
					secondButtonFound = true;
					log += "idx2 accepted. Value = " + buttons.get(idx2).indexInKey + "\n\n";
				}
			}
			
			buttons.get(idx1).Select();
			buttons.get(idx2).Select();
	
			Path p = Paths.get(HooliConstants.LOG_PATH + System.currentTimeMillis());
			try {
				Files.write(p, Arrays.asList(log), Charset.forName("UTF-8") );
			} catch (IOException e) {
				e.printStackTrace();
			}
			CurrentlySelecting = false;
		}
	}
	
	public int GetRemainingUnrevealedTiles() {
		int numUnrevealedTiles = 0;
		
		for(ImageButton btn : buttons) {
			if(btn.isEnabled())
			{
				numUnrevealedTiles++;
			}
		}
		
		return numUnrevealedTiles;
	}
	
	public ArrayList<ImageButton> getButtonList(){
		return this.buttons;
	}
	
	public void setCurrentPlayer(AbstractPlayer player) {
		currentPlayerText.setText(player.getName());
	}
}
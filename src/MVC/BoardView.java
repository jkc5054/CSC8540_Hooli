package MVC;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BoardView extends JPanel {

	/**
	 * Create the panel.
	 */
	public BoardView() {
		setLayout(null);
		
		JButton btnOne = new JButton("1");
		btnOne.setBounds(414, 27, 80, 80);
		add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(234, 27, 80, 80);
		add(btnTwo);
		
		JButton button = new JButton("2");
		button.setBounds(324, 27, 80, 80);
		add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(504, 27, 80, 80);
		add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(144, 108, 80, 80);
		add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(234, 108, 80, 80);
		add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(324, 108, 80, 80);
		add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.setBounds(414, 108, 80, 80);
		add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setBounds(504, 108, 80, 80);
		add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.setBounds(594, 108, 80, 80);
		add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.setBounds(684, 108, 80, 80);
		add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.setBounds(54, 108, 80, 80);
		add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.setBounds(54, 199, 80, 80);
		add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.setBounds(144, 199, 80, 80);
		add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.setBounds(234, 199, 80, 80);
		add(button_12);
		
		JButton button_13 = new JButton("2");
		button_13.setBounds(324, 199, 80, 80);
		add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.setBounds(414, 199, 80, 80);
		add(button_14);
		
		JButton button_15 = new JButton("2");
		button_15.setBounds(504, 199, 80, 80);
		add(button_15);
		
		JButton button_16 = new JButton("2");
		button_16.setBounds(594, 199, 80, 80);
		add(button_16);
		
		JButton button_17 = new JButton("2");
		button_17.setBounds(684, 199, 80, 80);
		add(button_17);
		
		JButton button_18 = new JButton("2");
		button_18.setBounds(54, 290, 80, 80);
		add(button_18);
		
		JButton button_19 = new JButton("2");
		button_19.setBounds(144, 290, 80, 80);
		add(button_19);
		
		JButton button_20 = new JButton("2");
		button_20.setBounds(234, 290, 80, 80);
		add(button_20);
		
		JButton button_21 = new JButton("2");
		button_21.setBounds(324, 290, 80, 80);
		add(button_21);
		
		JButton button_22 = new JButton("2");
		button_22.setBounds(414, 290, 80, 80);
		add(button_22);
		
		JButton button_23 = new JButton("2");
		button_23.setBounds(504, 290, 80, 80);
		add(button_23);
		
		JButton button_24 = new JButton("2");
		button_24.setBounds(594, 290, 80, 80);
		add(button_24);
		
		JButton button_25 = new JButton("2");
		button_25.setBounds(684, 290, 80, 80);
		add(button_25);
		
		JButton button_26 = new JButton("2");
		button_26.setBounds(54, 381, 80, 80);
		add(button_26);
		
		JButton button_27 = new JButton("2");
		button_27.setBounds(144, 381, 80, 80);
		add(button_27);
		
		JButton button_28 = new JButton("2");
		button_28.setBounds(234, 381, 80, 80);
		add(button_28);
		
		JButton button_29 = new JButton("2");
		button_29.setBounds(324, 381, 80, 80);
		add(button_29);
		
		JButton button_30 = new JButton("2");
		button_30.setBounds(414, 381, 80, 80);
		add(button_30);
		
		JButton button_31 = new JButton("2");
		button_31.setBounds(504, 381, 80, 80);
		add(button_31);
		
		JButton button_32 = new JButton("2");
		button_32.setBounds(594, 381, 80, 80);
		add(button_32);
		
		JButton button_33 = new JButton("2");
		button_33.setBounds(684, 381, 80, 80);
		add(button_33);
		
		JButton button_34 = new JButton("2");
		button_34.setBounds(234, 468, 80, 80);
		add(button_34);
		
		JButton button_35 = new JButton("2");
		button_35.setBounds(324, 468, 80, 80);
		add(button_35);
		
		JButton button_36 = new JButton("2");
		button_36.setBounds(414, 468, 80, 80);
		add(button_36);
		
		JButton button_37 = new JButton("2");
		button_37.setBounds(504, 468, 80, 80);
		add(button_37);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 582, 174, 155);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(687, 582, 174, 155);
		add(textArea_1);
		
		JLabel lblPlayerScore = new JLabel("Player 1 Score");
		lblPlayerScore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayerScore.setBounds(10, 547, 124, 24);
		add(lblPlayerScore);
		
		JLabel lblPlayerScore_1 = new JLabel("Player 2 Score");
		lblPlayerScore_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayerScore_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlayerScore_1.setBounds(737, 552, 124, 24);
		add(lblPlayerScore_1);

	}
}

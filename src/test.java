import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class test extends JFrame {
	
	private JPanel panel;
	private  JButton img1;
	private  JButton img2;
	private  JButton img3;
	private  JButton img4;
	

	public void gui(){
		JFrame frame = new JFrame();
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20,50));
		
		frame.setPreferredSize(new Dimension(1000,700)); //need to use this instead of setSize
        frame.setLocation(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        	
		img1 = new JButton();
        //img1= new JButton(new ImageIcon(getClass().getResource("image1.jpg")));
		img1.addActionListener(new img1());
		img1.setPreferredSize(new Dimension(120,120));
		
		
		img2= new JButton(new ImageIcon(getClass().getResource("image2.jpg")));
		img2.setPreferredSize(new Dimension(120,120));

		img3= new JButton(new ImageIcon(getClass().getResource("image3.jpg")));
		img3.setPreferredSize(new Dimension(120,120));

		img4= new JButton(new ImageIcon(getClass().getResource("image4.jpg")));
		img4.setPreferredSize(new Dimension(120,120));

		
		
		panel.add(img1);
		panel.add(img2);
		panel.add(img3);
		panel.add(img4);
		
		
		
		/*ArrayList<Image> images = new ArrayList<Image>();
		Image img1 = ImageIO.read(new File("image1.jpg"));
		images.add(img1);
		
		Image img2 = ImageIO.read(new File("image2.jpg"));
		images.add(img2);
		
		Image img3 = ImageIO.read(new File("image3.jpg"));
		images.add(img3);
		
		Image img4 = ImageIO.read(new File("image4.jpg"));
		images.add(img4);
		*/
		
		
		frame.add(panel);
		frame.setVisible(true);	
		
	}
	
public class img1 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent arg0) {
			img1.setIcon(new ImageIcon(getClass().getResource("image2.jpg")));
			
		}
}
	
	public static void main(String[] args){
		
		test t = new test();
		t.gui();
		
	}
	
	

}

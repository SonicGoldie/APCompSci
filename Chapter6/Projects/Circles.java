package Projects;

import javax.swing.JFrame;


public class Circles {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Circles"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

		CirclesPanel panel = new CirclesPanel();
		frame.getContentPane().add(panel);
		frame.add(panel);
		

		frame.pack(); 
		frame.setVisible(true);
	}

}

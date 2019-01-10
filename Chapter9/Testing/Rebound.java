package Testing;

import java.awt.*;
import javax.swing.*;

public class Rebound 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.getContentPane().add(new ReboundPanel());
	}
}

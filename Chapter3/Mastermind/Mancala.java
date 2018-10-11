package Mastermind;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mancala
	{
		enum color {red, orange, yellow, green, blue, purple, pink} // red = 1, orange = 2, ect.
	public static void main (String[] args)
{
  		
 		color color1, color2, color3, color4;
  		Random gen = new Random();
  		Scanner scan = new Scanner (System.in);
		JFrame frame = new JFrame ("Mastermind");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  		JPanel primary = new JPanel();
  		primary.setBackground(Color.pink);
        primary.setPreferredSize(new Dimension(512, 768));
  
  		JLabel Title = new JLabel("MASTERMIND");
  		JLabel Instructions = new JLabel("Please enter 4 Colors.");
  		
  		primary.add(Title);
  		primary.add(Instructions);
  		
  		frame.getContentPane().add(primary);
  		frame.pack();
  		frame.setVisible(true);
 
  		//Gui things go here
          
        //color1 = gen.new 
  
  		//
  		//xxx = scan.nextLine();
  		
  		///if {xxx /= }
}
	}
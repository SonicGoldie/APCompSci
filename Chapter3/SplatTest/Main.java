package SplatTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Mastermind"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel);		
		
		frame.pack(); 
		frame.setVisible(true); 
		
		int count, x, y;
		
		JButton red = new JButton(); 
		JButton orange = new JButton();
		JButton yellow = new JButton(); 
		JButton blue = new JButton();
		JButton green = new JButton(); 
		JButton purple = new JButton();
		
		red.setBounds(430, 100, 30, 30);  
		orange.setBounds(430, 150, 30, 30);
		yellow.setBounds(430, 200, 30, 30);  
		green.setBounds(430, 250, 30, 30);
		blue.setBounds(430, 300, 30, 30);  
		purple.setBounds(430, 350, 30, 30);
		
		red.addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	            System.out.println("red"); 
	            panel.genCircle(Color.red);
	            
		}  
	    }
			);
			
			orange.addActionListener(new ActionListener()
	    {     	
		public void actionPerformed(ActionEvent e){  
				System.out.println("orange");    
				panel.genCircle(Color.orange);
		}
	    }
			);  
		
			yellow.addActionListener(new ActionListener()
	    {     	
		public void actionPerformed(ActionEvent e){  
				System.out.println("yellow");  
				panel.genCircle(Color.yellow);
		}  
	    }
			);
			
			green.addActionListener(new ActionListener()
	    {     	
		public void actionPerformed(ActionEvent e){  
	            System.out.println("green");
	            panel.genCircle(Color.green);
		}
	    }
			);  
	    
			blue.addActionListener(new ActionListener()
	    {     	
		public void actionPerformed(ActionEvent e){  
				System.out.println("blue");
				panel.genCircle(Color.blue);
		}  
	    }
			);
			
			purple.addActionListener(new ActionListener()
	    {     	
		public void actionPerformed(ActionEvent action){      
	            System.out.println("purple");
	            panel.genCircle(Color.magenta);
		}
	    }
			);  
		
			red.setOpaque(false);
			orange.setOpaque(false);
			yellow.setOpaque(false);
			green.setOpaque(false);
			blue.setOpaque(false);
			purple.setOpaque(false);
			
			frame.add(red);
			frame.add(orange);
			frame.add(yellow);
			frame.add(green);
			frame.add(blue);
			frame.add(purple);
	}
		
}

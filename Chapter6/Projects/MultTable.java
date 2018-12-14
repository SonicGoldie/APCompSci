package Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultTable {
	private static JPanel[] Boxes;

	public static void main(String[] args) 
	{

		JFrame frame = new JFrame("Multiplication Table");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1000,1000));
		panel.setLayout(new GridLayout(0,13,0,0));
		panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		panel.setBackground(Color.cyan);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

		Boxes = new JPanel[169];
		int counter = 0, checker = 1;

		for(int ism=0; ism<Boxes.length; ism++)
		{
			Boxes[ism] = new JPanel();
			Boxes[ism].setBorder(BorderFactory.createLineBorder(Color.white, 2));
			if (counter == 0)
			{
				Boxes[ism].setBackground(Color.BLACK);
			}
			/*if (((counter-checker) / 12 ) == 0)
			{
				Boxes[ism].setBackground(Color.blue);
			}*/
			else
			{
				
				Boxes[ism].add(new JLabel ("" + counter));
				Boxes[ism].setBackground(Color.gray);
			}
			
			panel.add(Boxes[ism]);
			counter++;
			checker++;

		}
		



	}

}

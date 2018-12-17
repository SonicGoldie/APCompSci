package Projects;

import java.awt.*;
import javax.swing.JApplet;


public class Checkerboard extends JApplet 
{

	public void paint(Graphics g) 
	{

		int row;   // Row number, from 0 to 7
		int col;   // Column number, from 0 to 7
		int x,y;   // Top-left corner of square

		for ( row = 0;  row < 8;  row++ ) 
		{

			for ( col = 0;  col < 8;  col++) 
			{
				x = col * 20;
				y = row * 20;
				if ( (row % 2) == (col % 2) )
					g.setColor(Color.red);
				else
					g.setColor(Color.black);
				g.fillRect(x, y, 20, 20);
			} 

		}

	}

}
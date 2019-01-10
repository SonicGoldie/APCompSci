package Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class CirclesPanel extends JPanel
{
	Random rand = new Random();
	private Circle6[] circle;
	private Color color;
	private int x, y, dia, r, g, b;
	public CirclesPanel() 
	{
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.black);
		
		circle = new Circle6[100];
		for (int i = 0; i < 100; i++)
		{
			r = rand.nextInt(256);
			g = rand.nextInt(256);
			b = rand.nextInt(256);
			color = new Color(r,g,b);
			x = rand.nextInt(901);
			y = rand.nextInt(901);
			dia = rand.nextInt(101);
			circle[i] = new Circle6(dia, color, x, y);
			
		}
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		for (int i = 0; i < 100; i++)
		{
			circle[i].draw(page);
		}
	}
}

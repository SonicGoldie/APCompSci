package Snowman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Snowman extends JApplet
{
	public void paint(Graphics page)
	{
		final int mid = 150;
		final int top = 50;
		
		page.setColor(Color.cyan);
		page.fillRect(0, 0, 300, 500);
		
		page.setColor(Color.blue);
		page.fillRect(0, 175, 300, 50);
		
		page.setColor(Color.yellow);
		page.fillOval(-40, -40, 80, 80);
		
		page.setColor(Color.WHITE);
		page.fillOval(mid-20, top, 40, 40);
		page.fillOval(mid-35, top+35, 70, 50);
		page.fillOval(mid-50, top+80, 100, 60);
		
		page.setColor(Color.black);
		page.fillOval(mid-10, top+10, 5, 5);
		page.fillOval(mid+5, top+10, 5, 5);
		
		page.drawArc(mid-10, top+20, 20, 10, 190, 160);
		
		page.drawLine(mid-25, top+60, mid-50, top+40);
		page.drawLine(mid+25, top+60, mid+55, top+5);
		
		page.drawLine(mid-20, top+5, mid+20, top+5);
		page.fillRect(mid-15, top-20, 30, 25);
	}

}

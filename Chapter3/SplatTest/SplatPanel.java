package SplatTest;
import javax.swing.*;
import java.awt.*;
public class SplatPanel extends JPanel
{
	private int x, y;
	private Square[] midS;
	private Circle[] midC;
	private Square[] topS;
	private Circle[] topC;
	private Square[] sideS;
	private Circle[] sideC;
	private Square[] buttonS;
	private Square test1, test2;
	
	public SplatPanel()
	{
		x=0;
		y=120;
		midS = new Square[40];
			for(int ism=0; ism<midS.length; ism++)
			{
				x += 60;
			
				midS[ism] = new Square(50, Color.GRAY, x, y);
				if(x >= 240)
				{
					x=0;
				}
				if(y% 60== 0  && x ==0)
				{
					y += 60;
				}
				
			} 
			x = 10;
			y = 130;
		midC = new Circle[40];
			for(int icm=0; icm<midC.length; icm++)
		{
						
			x += 60;
			
			midC[icm] = new Circle(30, Color.red, x, y);
			if (x >= 230)
			{
				x=10;
				
			}
			if (x == 10)
			{
				y+= 60;
			}
			
		}
			//midC[1].setColor(Color.cyan);
		
		x=0;
		y=40;
		topS = new Square[4];
		for(int ist=0; ist<topS.length; ist++)
		{
			x+= 60;
			topS[ist] = new Square(50, Color.gray, x, y);
			if (x >= 240)
			{
				x=0;
			}
			
		}
		x=10;
		y=50;
		topC = new Circle[4];
		for(int ict=0; ict<topC.length; ict++)
		{
			x += 60;
			
			topC[ict] = new Circle(30, Color.RED, x, y);
			if (x >= 230)
			{
				x=10;
			}
		}
		x = 320;
		y = 60;
		sideS = new Square[10];
		for(int iss=0; iss<sideS.length; iss++)
		{
			y += 60;		
			sideS[iss] = new Square(50,Color.GRAY, x, y);
			
		}	
		
		
		x = 330;
		y = 70;
		sideC = new Circle[10];
		for(int ics=0; ics<sideC.length; ics++)
		{
			y += 60;		
			sideC[ics] = new Circle(30,Color.RED, x, y);
			
		}
		
		x = 400;
		y = 540;
		test1 = new Square(50, Color.GRAY, x, y);
		test2= new Square(44, Color.black, x+3, y+3);
		
		
		
		//circle1 = new Circle(30, Color.red, 70, 35);
		//circle2 = new Circle(50, Color.green, 30, 20);
		//circle3 = new Circle(100, Color.cyan, 60, 85);
		//circle4 = new Circle(45, Color.yellow, 170, 30);
		//circle5 = new Circle(60, Color.blue, 200, 60);
		//square1 = new Square(50, Color.gray, 60, 40);
		
		setPreferredSize(new Dimension(550,750));
		setBackground(Color.black);
			
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		
		
		for(int i = 0; i < midS.length; i++)
		{
			midS[i].draw(page);
		}
		
		for (int i = 0; i < midC.length; i++)
		{
			midC[i].draw(page);
		}
		for(int i = 0; i < topS.length; i++)
		{
			topS[i].draw(page);
		}
		
		for (int i = 0; i < topC.length; i++)
		{
			topC[i].draw(page);
		}
		for (int i= 0; i < sideS.length; i++) 
		{
			sideS[i].draw(page);
		}
		for (int i = 0; i < sideC.length; i++)
		{
			sideC[i].draw(page);
		}
		test1.draw(page);
		test2.draw(page);
	}

}

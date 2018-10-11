package SplatTest;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Panel extends JPanel {
	
	private Circle circleButtonRed, circleButtonOrange, circleButtonYellow, circleButtonGreen, 
	circleButtonBlue, circleButtonPurple;
	
	private Color color;
	
	private Color[] pegGroup;
	
	private Circle[] midC, topC, pegsC;
	
	private Square[] midS, topS1, topS2, sideS;
	
	
	int pegs;
	
	Random gen = new Random();
	
	public Panel() {		
		
		int x=0, y=120;
		
		midC = new Circle[40];
		midS = new Square[40];
		
		for(int s = 0; s < midS.length; s++)
		{
			x += 60;
	
			midS[s]= new Square(50, Color.gray, x, y);
			
			if(x >= 240)
			{
				x = 0;
			}
			
			if(x==0)
			{
				y+= 60;
			}
		}
			
		y=130;
		x=10;

		for(int i = 0; i < midC.length; i++)
		{
			x += 60;
	
			midC[i]= new Circle(30, Color.gray, x, y);
			
			if(x >= 240)
			{
				x = 10;
			}
			
			if(x==10)
			{
				y+= 60;
			}
		}
		
		x=0;
		y=40;
		topS1 = new Square[4];
		for(int ist1=0; ist1<topS1.length; ist1++)
		{
			x+= 60;
			topS1[ist1] = new Square(50, Color.gray, x, y);
			if (x >= 240)
			{
				x=0;
			}
			
		}
		
		x=0;
		y=40;
		topS2 = new Square[4];
		for(int ist2=0; ist2<topS2.length; ist2++)
		{
			x+= 60;
			topS2[ist2] = new Square(50, Color.gray, x, y);
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
			
			topC[ict] = new Circle(30, Color.gray, x, y);// make these the same color as the squares (or opaque)
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
		
		//peg1 = new Circle(10, color.white, 0, 0);		
		
		//pegsC = new Cirlce[4];
		//for (isp )
		
		pegsC = new Circle[40];
		for (int isp=0; isp<pegsC.length; isp++)
		{
			pegsC[isp] = new Circle(10, color.gray, -100, -100);
		}
		
		pegGroup = new Color[4];
		
				
		int[] pegs = new int[4];
		for(int peg=0; peg<pegs.length; peg++)
		{		
			pegs[peg] = gen.nextInt(6);
			if (pegs[peg] == 1)
			{
				topC[peg].setColor(Color.red);
			}
			if (pegs[peg] == 2)
			{
				topC[peg].setColor(Color.orange);
			}
			if (pegs[peg] == 3)
			{
				topC[peg].setColor(Color.yellow);
			}
			if (pegs[peg] == 4)
			{
				topC[peg].setColor(Color.green);
			}
			if (pegs[peg] == 5)
			{
				topC[peg].setColor(Color.blue);
			}
			if (pegs[peg] == 0)
			{
				topC[peg].setColor(Color.magenta);
			}
			
		}
		
		
		circleButtonRed = new Circle(30, Color.red, 430, 100);
		circleButtonOrange = new Circle(30, Color.orange, 430, 150);
		circleButtonYellow = new Circle(30, Color.yellow, 430, 200);
		circleButtonGreen = new Circle(30, Color.green, 430, 250);
		circleButtonBlue = new Circle(30, Color.blue, 430, 300);
		circleButtonPurple = new Circle(30, Color.magenta, 430, 350);
	
		setPreferredSize(new Dimension(500, 750));
		setBackground(Color.DARK_GRAY);
		
		//int myX = sideS[next/4].getX();
		//int myY = sideS[next/4].getY();
		//peg1 = new Circle(10, color.white, myX+10, myY+10);
	}
	
	int next = 36;
	public void genCircle(Color color)
	{
		
		int currentpeg = 0;
		pegGroup[0] = color.gray;	
		pegGroup[1] = color.gray;	
		pegGroup[2] = color.gray;	
		pegGroup[3] = color.gray;
		midC[next].setColor(color);
		if ((next + 1)%4 == 0)
			
			{
		
			boolean correct1 = false, correct2 = false, correct3 = false, correct4 = false;
			boolean midC3 = false, midC2 = false, midC1 = false, midC0 =false;
			boolean topC3 = false, topC2 = false, topC1 = false, topC0 =false;
			if (midC[next].getColor() == topC[3].getColor())
			{
				System.out.println("black peg");//I didn't want to actually make circles, but that could happen
				topC3 = true;
				midC3= true;
				correct1 = true;
				//peg4 = Color.black;
				pegGroup[currentpeg] = color.BLACK;
				currentpeg++;
				
			}
			
			
			if (midC[next-1].getColor() == topC[2].getColor())
			{
				System.out.println("black peg");
				topC2 = true;
				midC2 = true;
				correct2 = true;
				//peg1 = Color.black;
				pegGroup[currentpeg] = color.BLACK;
				currentpeg++;
			}
			
			
			if (midC[next-2].getColor() == topC[1].getColor())
			{
				System.out.println("black peg");
				topC1 = true;
				midC1 = true;
				correct3 = true;
				//peg2 = Color.black;
				pegGroup[currentpeg] = color.BLACK;
				currentpeg++;
			}
			
			
			if (midC[next-3].getColor() == topC[0].getColor())
			{
				System.out.println("black peg");
				topC0 = true;
				midC0 = true;
				correct4 = true;
				//peg3 = Color.black;
				pegGroup[currentpeg] = color.BLACK;
				currentpeg++;
			}
			
	
			if (midC[next].getColor() == topC[2].getColor() && topC2 == false && midC3 == false)
			{
				System.out.println("white peg");
				topC2 = true;
				midC3 = true;
				//if (pegsC[next].getColor() == color.gray)
				//{
				//	peg1 = color.white;
				//}
				//else 
				//{
				//	peg2 = color.white;
				//}
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-1].getColor() == topC[1].getColor() && topC1 == false && midC2 == false)
			{
				System.out.println("white peg");
				topC1 = true;
				midC2 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-2].getColor() == topC[0].getColor() && topC0 == false && midC1 == false)
			{
				System.out.println("white peg");
				topC0= true;
				midC1 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-3].getColor() == topC[3].getColor() && topC3 == false && midC0 == false)
			{
				System.out.println("white peg");
				topC3 = true;
				midC0 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
	
			if (midC[next].getColor() == topC[1].getColor() && topC1 == false && midC3 == false)
			{
				System.out.println("white peg");
				topC1 = true;
				midC3 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-1].getColor() == topC[0].getColor() && topC0 == false && midC2 == false)
			{
				System.out.println("white peg");
				topC0 = true;
				midC2 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-2].getColor() == topC[3].getColor() && topC3 == false && midC1 == false)
			{
				System.out.println("white peg");
				topC3= true;
				midC1 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-3].getColor() == topC[2].getColor() && topC2 == false && midC0 == false)
			{
				System.out.println("white peg");
				topC2 = true;
				midC0 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			
			if (midC[next].getColor() == topC[0].getColor() && topC0 == false && midC3 == false )
			{
				System.out.println("white peg");
				topC0 = true;
				midC3 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-1].getColor() == topC[3].getColor() && topC3 == false && midC2 == false)
			{
				System.out.println("white peg");
				topC3 = true;
				midC2 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-2].getColor() == topC[2].getColor() && topC2 == false && midC1 == false)
			{
				System.out.println("white peg");
				topC2= true;
				midC1 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			if (midC[next-3].getColor() == topC[1].getColor() && topC1 == false && midC0 == false)
			{
				System.out.println("white peg");
				topC1 = true;
				midC0 = true;
				pegGroup[currentpeg] = color.white;
				currentpeg++;
			}
			
			if (topC1 == false && topC2 == false && topC3 == false && topC0 == false)
			{
				System.out.println("nothing is correct"); // you can remove this too, idk if we need it
			}
			
			if (correct1 == true && correct2 == true && correct3 == true && correct4 == true)
			{
				System.out.println("You win!!");
				for(int ist=0; ist<topS1.length; ist++)
				{
					
					topS1[ist] = new Square(50, Color.gray, -100, -100);
					
				}
				
				//If you want a winning screen or smth, put or call it here
				// also make the top circles visible
			}
			
			//sideS[next/4].setColor(color.white);
			
			
			int myX = sideS[next/4].getX();
			int myY = sideS[next/4].getY();
			
			pegsC[next].setColor(pegGroup[0]);
			pegsC[next-1].setColor(pegGroup[1]);
			pegsC[next-2].setColor(pegGroup[2]);
			pegsC[next-3].setColor(pegGroup[3]);
			
			pegsC[next].setX(myX+10);
			pegsC[next].setY(myY+10);
			
			pegsC[next-1].setX(myX+30);
			pegsC[next-1].setY(myY+10);
			
			pegsC[next-2].setX(myX+10);
			pegsC[next-2].setY(myY+30);
			
			pegsC[next-3].setX(myX+30);
			pegsC[next-3].setY(myY+30);
			
			next -= 8;
			
			if (next < -1 )
			{
				for(int ist1=0; ist1<topS1.length; ist1++)
				{
					
					topS1[ist1] = new Square(50, Color.gray, -100, -100);
					
				}
				
			}
			
			}

		next += 1;
		
		
		repaint();
		
		
		
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
	
		circleButtonRed.draw(page);
		circleButtonOrange.draw(page);
		circleButtonYellow.draw(page);
		circleButtonGreen.draw(page);
		circleButtonBlue.draw(page);
		circleButtonPurple.draw(page);
		
		
		for(int s = 0; s < midS.length; s++)
		{
			midS[s].draw(page);
		}
		
		for(int i = 0; i < midC.length; i++)
		{
			midC[i].draw(page);
		}
		
		//for(int ist2 = 0; ist2 < topS2.length; ist2++)
		//{
		//	topS2[ist2].draw(page);
		//}
		for(int ist2 = 0; ist2 < topS2.length; ist2++)
		{
			topS1[ist2].draw(page);
		}
		
		for(int ict = 0; ict < topC.length; ict++)
		{
			topC[ict].draw(page);
		}
		
		for(int iss = 0; iss < sideS.length; iss++)
		{
			sideS[iss].draw(page);
		}
		
		for(int ist = 0; ist < topS1.length; ist++)
		{
			topS1[ist].draw(page);
		}
		
		
		
		
		
		for(int isp = 0; isp < pegsC.length; isp++)
		{
			pegsC[isp].draw(page);
		}
		
		
		
	
	
	}

}

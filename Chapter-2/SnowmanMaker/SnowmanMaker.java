package SnowmanMaker;

import java.applet.Applet;
import java.awt.Color; 	
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JApplet;

public class SnowmanMaker
{
	//declare all variables here
	int BackgroundColor, FloorColor, SunColor, Ball1Color, Ball1SizeX, Ball1SizeY, Ball2Color, Ball2SizeX, Ball2SizeY, Ball3Color, Ball3SizeX, Ball3SizeY;
	int MouthColor, EyeColor, ArmColor, HatColor;
	
	public void main(String[] args)
	{
		System.out.println("Hello World!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, You are going to embark on an adventure.");
		System.out.println("This adventure ensures your ideal snowman, the way you want it.");
		System.out.println("To start, please select a backgound color");
		System.out.println("1) Black      2) Blue");
		System.out.println("3) Cyan       4) Gray");
		System.out.println("5) Dark Gray  6) Light Gray");
		System.out.println("7) Green      8) Magenta");
		System.out.println("9) Orange     10) Pink");
		System.out.println("11) Red       12) White");
		System.out.println("13) Yellow");
		BackgroundColor = scan.nextInt();
		scan.nextLine();
		System.out.println("Please select a color for the gound");
		System.out.println("1) Black      2) Blue");
		System.out.println("3) Cyan       4) Gray");
		System.out.println("5) Dark Gray  6) Light Gray");
		System.out.println("7) Green      8) Magenta");
		System.out.println("9) Orange     10) Pink");
		System.out.println("11) Red       12) White");
		System.out.println("13) Yellow");
		FloorColor = scan.nextInt();
		scan.nextLine();
		System.out.println("Please select a color for the Sun");
		System.out.println("1) Black      2) Blue");
		System.out.println("3) Cyan       4) Gray");
		System.out.println("5) Dark Gray  6) Light Gray");
		System.out.println("7) Green      8) Magenta");
		System.out.println("9) Orange     10) Pink");
		System.out.println("11) Red       12) White");
		System.out.println("13) Yellow");
		SunColor = scan.nextInt();
		scan.nextLine();
		
	}
	public void paint(Graphics page)
	{
		
		//Work
		if (BackgroundColor == 1){page.setColor(Color.BLACK);}
		else if (BackgroundColor == 2){page.setColor(Color.BLUE); }
		else if (BackgroundColor == 2){page.setColor(Color.BLUE); }
		else if (BackgroundColor == 3){page.setColor(Color.CYAN); }
		else if (BackgroundColor == 4){page.setColor(Color.GRAY); }
		else if (BackgroundColor == 5){page.setColor(Color.darkGray);}
		else if (BackgroundColor == 6){page.setColor(Color.lightGray); }
		else if (BackgroundColor == 7){page.setColor(Color.PINK);}
		else if (BackgroundColor == 8){page.setColor(Color.MAGENTA);}
		if (BackgroundColor == 9){page.setColor(Color.ORANGE);}
		if (BackgroundColor == 10){page.setColor(Color.PINK);}
		if (BackgroundColor == 11){page.setColor(Color.RED);}
		if (BackgroundColor == 12){page.setColor(Color.WHITE);}
		if (BackgroundColor == 13){page.setColor(Color.YELLOW);}
		page.fillRect(0, 0, 1024, 768);
	    
		if (FloorColor == 1){page.setColor(Color.BLACK);}
		if (FloorColor == 2){page.setColor(Color.BLUE);}
		if (FloorColor == 3){page.setColor(Color.CYAN);}
		if (FloorColor == 4){page.setColor(Color.GRAY);}
		if (FloorColor == 5){page.setColor(Color.darkGray);}
		if (FloorColor == 6){page.setColor(Color.lightGray);}
		if (FloorColor == 7){page.setColor(Color.GREEN);}
		if (FloorColor == 8){page.setColor(Color.MAGENTA);}
		if (FloorColor == 9){page.setColor(Color.ORANGE);}
		if (FloorColor == 10){page.setColor(Color.PINK);}
		if (FloorColor == 11){page.setColor(Color.RED);}
		if (FloorColor == 12){page.setColor(Color.WHITE);}
		if (FloorColor == 13){page.setColor(Color.YELLOW);}
		page.fillRect(0, 668, 1024, 100);
		
		if (SunColor == 1){page.setColor(Color.BLACK);}
		if (SunColor == 2){page.setColor(Color.BLUE);}
		if (SunColor == 3){page.setColor(Color.CYAN);}
		if (SunColor == 4){page.setColor(Color.GRAY);}
		if (SunColor == 5){page.setColor(Color.darkGray);}
		if (SunColor == 6){page.setColor(Color.lightGray);}
		if (SunColor == 7){page.setColor(Color.GREEN);}
		if (SunColor == 8){page.setColor(Color.MAGENTA);}
		if (SunColor == 9){page.setColor(Color.ORANGE);}
		if (SunColor == 10){page.setColor(Color.PINK);}
		if (SunColor == 11){page.setColor(Color.RED);}
		if (SunColor == 12){page.setColor(Color.WHITE);}
		if (SunColor == 13){page.setColor(Color.YELLOW);}
		page.fillOval(-100, -100, 350, 350);
		}
}
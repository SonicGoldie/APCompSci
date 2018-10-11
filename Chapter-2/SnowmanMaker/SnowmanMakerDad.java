package SnowmanMaker;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JApplet;

public class SnowmanMakerDad extends Applet
{
    private int BackgroundColor, FloorColor, SunColor, Ball1Color, Ball1Size, Ball2Color, Ball2Size, Ball3Color, Ball3Size;
    private int MouthColor, EyeColor, ArmColor, HatColor;
    private Color bgcolor=Color.WHITE;
    private Color fcolor=Color.WHITE;
    private Color scolor=Color.WHITE;
    private Color b1color=Color.WHITE;
    private Color b2color=Color.WHITE;
    private Color b3color=Color.WHITE;
    private Color mcolor=Color.WHITE;
    private Color ecolor=Color.WHITE;
    private Color acolor=Color.WHITE;
    private Color hcolor=Color.WHITE;
        static final long serialVersionUID = 10;
        private boolean launched = false;
        private Graphics myPage = null;
        private boolean resized = false;
        
        public void start()
        {
         
         Scanner scan = new Scanner(System.in);
         if(scan != null) {
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
        	 System.out.println("Please select a color for the Ground");
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
        	 
        	 System.out.println("Plese select a color for your 1st Ball");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 Ball1Color=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Please select the size for your first ball (Suggested 300)");
        	 Ball1Size=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your 2nd Ball");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 Ball2Color=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Please select the size for your second ball (Suggested 200 / or smaller than 1st)");
        	 Ball2Size=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your 3rd Ball");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 Ball3Color=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Please select the size for your third ball (Suggested 150 / or smaller than 2nd)");
        	 Ball3Size=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your Hat");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 HatColor=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your Eyes");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 EyeColor=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your Mouth");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 MouthColor=scan.nextInt();
        	 scan.nextLine();
        	 
        	 System.out.println("Plese select a color for your Arms");
        	 System.out.println("1) Black      2) Blue");
        	 System.out.println("3) Cyan       4) Gray");
        	 System.out.println("5) Dark Gray  6) Light Gray");
        	 System.out.println("7) Green      8) Magenta");
        	 System.out.println("9) Orange     10) Pink");
        	 System.out.println("11) Red       12) White");
        	 System.out.println("13) Yellow");
        	 ArmColor=scan.nextInt();
        	 scan.nextLine();
        	 
        	 resize(1024,768);         
         	}
        }
        public void paint(Graphics page)
        {

                /*if(launched) {
                 //System.out.println(" REFRESH!!!!!");
                 page.setColor(bgcolor);
                 page.fillRect(0, 0, 1024, 768);
                 page.setColor(fcolor);
                 page.fillRect(0, 668, 1024, 100);
                 page.setColor(scolor);
                 page.fillOval(-100, -100, 350, 350);
                 return;
                }*/
                // The items from here down could actually be moved to the "Start" method.  it would clean things up
                // all except for the lines about myPage.setcolor, or mypage.fillrect. 
                // launched = true;
                myPage = page;
                    if (BackgroundColor == 1){bgcolor=Color.BLACK;}
                    if (BackgroundColor == 2){bgcolor=Color.BLUE; }
                    if (BackgroundColor == 3){bgcolor=Color.CYAN; }
                    if (BackgroundColor == 4){bgcolor=Color.GRAY; }
                    if (BackgroundColor == 5){bgcolor=Color.darkGray; }
                    if (BackgroundColor == 6){bgcolor=Color.lightGray;}
                    if (BackgroundColor == 7){bgcolor=Color.GREEN; }
                    if (BackgroundColor == 8){bgcolor=Color.MAGENTA;}
                    if (BackgroundColor == 9){bgcolor=Color.ORANGE;}
                    if (BackgroundColor == 10){bgcolor=Color.PINK;}
                    if (BackgroundColor == 11){bgcolor=Color.RED;}
                    if (BackgroundColor == 12){bgcolor=Color.WHITE;}
                    if (BackgroundColor == 13){bgcolor=Color.YELLOW;}
                    myPage.setColor(bgcolor);
                    myPage.fillRect(0, 0, 1024, 768);
                     
                    if (FloorColor == 1){fcolor=Color.BLACK; }
                    if (FloorColor == 2){fcolor=Color.BLUE; }                       
                    if (FloorColor == 3){fcolor=Color.CYAN;}
                    if (FloorColor == 4){fcolor=Color.GRAY;}
                    if (FloorColor == 5){fcolor=Color.darkGray;}
                    if (FloorColor == 6){fcolor=Color.lightGray;}
                    if (FloorColor == 7){fcolor=Color.GREEN;}
                    if (FloorColor == 8){fcolor=Color.MAGENTA;}
                    if (FloorColor == 9){fcolor=Color.ORANGE;}
                    if (FloorColor == 10){fcolor=Color.PINK;}
                    if (FloorColor == 11){fcolor=Color.RED;}
                    if (FloorColor == 12){fcolor=Color.WHITE;}
                    if (FloorColor == 13){fcolor=Color.YELLOW;}
                    myPage.setColor(fcolor);
                    myPage.fillRect(0, 668, 1024, 100);
                     
                    if (SunColor == 1){scolor=Color.BLACK;}
             		if (SunColor == 2){scolor=Color.BLUE;}
             		if (SunColor == 3){scolor=Color.CYAN;}
             		if (SunColor == 4){scolor=Color.GRAY;}
             		if (SunColor == 5){scolor=Color.darkGray;}
             		if (SunColor == 6){scolor=Color.lightGray;}
             		if (SunColor == 7){scolor=Color.GREEN;}
             		if (SunColor == 8){scolor=Color.MAGENTA;}
             		if (SunColor == 9){scolor=Color.ORANGE;}
             		if (SunColor == 10){scolor=Color.PINK;}
             		if (SunColor == 11){scolor=Color.RED;}
             		if (SunColor == 12){scolor=Color.WHITE;}
             		if (SunColor == 13){scolor=Color.YELLOW;}
             		myPage.setColor(scolor);
             		myPage.fillOval(-100, -100, 350, 350);
             		
             		if (Ball1Color == 1){b1color=Color.BLACK;}
             		if (Ball1Color == 2){b1color=Color.BLUE;}
             		if (Ball1Color == 3){b1color=Color.CYAN;}
             		if (Ball1Color == 4){b1color=Color.GRAY;}
             		if (Ball1Color == 5){b1color=Color.darkGray;}
             		if (Ball1Color == 6){b1color=Color.lightGray;}
             		if (Ball1Color == 7){b1color=Color.GREEN;}
             		if (Ball1Color == 8){b1color=Color.MAGENTA;}
             		if (Ball1Color == 9){b1color=Color.ORANGE;}
             		if (Ball1Color == 10){b1color=Color.PINK;}
             		if (Ball1Color == 11){b1color=Color.RED;}
             		if (Ball1Color == 12){b1color=Color.WHITE;}
             		if (Ball1Color == 13){b1color=Color.YELLOW;}
             		myPage.setColor(b1color);
             		myPage.fillOval(512-(Ball1Size/2), 668-(Ball1Size/2), Ball1Size, Ball1Size);     
             		
             		if (Ball2Color == 1){b2color=Color.BLACK;}
             		if (Ball2Color == 2){b2color=Color.BLUE;}
             		if (Ball2Color == 3){b2color=Color.CYAN;}
             		if (Ball2Color == 4){b2color=Color.GRAY;}
             		if (Ball2Color == 5){b2color=Color.darkGray;}
             		if (Ball2Color == 6){b2color=Color.lightGray;}
             		if (Ball2Color == 7){b2color=Color.GREEN;}
             		if (Ball2Color == 8){b2color=Color.MAGENTA;}
             		if (Ball2Color == 9){b2color=Color.ORANGE;}
             		if (Ball2Color == 10){b2color=Color.PINK;}
             		if (Ball2Color == 11){b2color=Color.RED;}
             		if (Ball2Color == 12){b2color=Color.WHITE;}
             		if (Ball2Color == 13){b2color=Color.YELLOW;}
             		myPage.setColor(b2color);
             		myPage.fillOval(512-(Ball2Size/2), 468-(Ball2Size/2), Ball2Size, Ball2Size);
             		
             		if (Ball3Color == 1){b3color=Color.BLACK;}
             		if (Ball3Color == 2){b3color=Color.BLUE;}
             		if (Ball3Color == 3){b3color=Color.CYAN;}
             		if (Ball3Color == 4){b3color=Color.GRAY;}
             		if (Ball3Color == 5){b3color=Color.darkGray;}
             		if (Ball3Color == 6){b3color=Color.lightGray;}
             		if (Ball3Color == 7){b3color=Color.GREEN;}
             		if (Ball3Color == 8){b3color=Color.MAGENTA;}
             		if (Ball3Color == 9){b3color=Color.ORANGE;}
             		if (Ball3Color == 10){b3color=Color.PINK;}
             		if (Ball3Color == 11){b3color=Color.RED;}
             		if (Ball3Color == 12){b3color=Color.WHITE;}
             		if (Ball3Color == 13){b3color=Color.YELLOW;}
             		myPage.setColor(b3color);
             		myPage.fillOval(512-(Ball3Size/2), 318-(Ball3Size/2), Ball3Size, Ball3Size);
             		
             		if (HatColor == 1){hcolor=Color.BLACK;}
             		if (HatColor == 2){hcolor=Color.BLUE;}
             		if (HatColor == 3){hcolor=Color.CYAN;}
             		if (HatColor == 4){hcolor=Color.GRAY;}
             		if (HatColor == 5){hcolor=Color.darkGray;}
             		if (HatColor == 6){hcolor=Color.lightGray;}
             		if (HatColor == 7){hcolor=Color.GREEN;}
             		if (HatColor == 8){hcolor=Color.MAGENTA;}
             		if (HatColor == 9){hcolor=Color.ORANGE;}
             		if (HatColor == 10){hcolor=Color.PINK;}
             		if (HatColor == 11){hcolor=Color.RED;}
             		if (HatColor == 12){hcolor=Color.WHITE;}
             		if (HatColor == 13){hcolor=Color.YELLOW;}
             		myPage.setColor(hcolor);
             		myPage.fillRect(437, 238-(Ball3Size/2), 150, 100);
             		myPage.fillRect(412, 338-(Ball3Size/2), 200, 10);
             		
             		if (EyeColor == 1){ecolor=Color.BLACK;}
             		if (EyeColor == 2){ecolor=Color.BLUE;}
             		if (EyeColor == 3){ecolor=Color.CYAN;}
             		if (EyeColor == 4){ecolor=Color.GRAY;}
             		if (EyeColor == 5){ecolor=Color.darkGray;}
             		if (EyeColor == 6){ecolor=Color.lightGray;}
             		if (EyeColor == 7){ecolor=Color.GREEN;}
             		if (EyeColor == 8){ecolor=Color.MAGENTA;}
             		if (EyeColor == 9){ecolor=Color.ORANGE;}
             		if (EyeColor == 10){ecolor=Color.PINK;}
             		if (EyeColor == 11){ecolor=Color.RED;}
             		if (EyeColor == 12){ecolor=Color.WHITE;}
             		if (EyeColor == 13){ecolor=Color.YELLOW;}
             		myPage.setColor(ecolor);
             		myPage.fillOval(487, 368 - (Ball3Size/2), 10, 10);
             		myPage.fillOval(537, 368 - (Ball3Size/2), 10, 10);
             		

             		if (MouthColor == 1){mcolor=Color.BLACK;}
             		if (MouthColor == 2){mcolor=Color.BLUE;}
             		if (MouthColor == 3){mcolor=Color.CYAN;}
             		if (MouthColor == 4){mcolor=Color.GRAY;}
             		if (MouthColor == 5){mcolor=Color.darkGray;}
             		if (MouthColor == 6){mcolor=Color.lightGray;}
             		if (MouthColor == 7){mcolor=Color.GREEN;}
             		if (MouthColor == 8){mcolor=Color.MAGENTA;}
             		if (MouthColor == 9){mcolor=Color.ORANGE;}
             		if (MouthColor == 10){mcolor=Color.PINK;}
             		if (MouthColor == 11){mcolor=Color.RED;}
             		if (MouthColor == 12){mcolor=Color.WHITE;}
             		if (MouthColor == 13){mcolor=Color.YELLOW;}
             		myPage.setColor(mcolor);
             		myPage.drawArc(512, 318, 20, 10, 190, 160);
             		
             		
             		if (ArmColor == 1){acolor=Color.BLACK;}
             		if (ArmColor == 2){acolor=Color.BLUE;}
             		if (ArmColor == 3){acolor=Color.CYAN;}
             		if (ArmColor == 4){acolor=Color.GRAY;}
             		if (ArmColor == 5){acolor=Color.darkGray;}
             		if (ArmColor == 6){acolor=Color.lightGray;}
             		if (ArmColor == 7){acolor=Color.GREEN;}
             		if (ArmColor == 8){acolor=Color.MAGENTA;}
             		if (ArmColor == 9){acolor=Color.ORANGE;}
             		if (ArmColor == 10){acolor=Color.PINK;}
             		if (ArmColor == 11){acolor=Color.RED;}
             		if (ArmColor == 12){acolor=Color.WHITE;}
             		if (ArmColor == 13){acolor=Color.YELLOW;}
             		myPage.setColor(acolor);
             		myPage.drawLine(512-((Ball2Size/2)/2), 468-((Ball2Size/2)/2), ((512-(Ball2Size)) + 50), ((468-(Ball2Size)) + 50));
             		myPage.drawLine(512+((Ball2Size/2)/2), 468-((Ball2Size/2)/2), ((512+(Ball2Size)) - 50), ((468-(Ball2Size)) - 50));
                    
        }
        }
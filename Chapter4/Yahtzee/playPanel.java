package Yahtzee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
																				
public class playPanel extends JPanel{
	SlataSolution s;
	openSquare[] outline;
	Square[] sq, dice;
	Circle[] dots;
	JButton[] diceButton;
	JButton roll = new JButton();
	Random gen = new Random();
	ScoringPanel Panel;
	int die1, die2, die3, die4, die5, die6, die7, die8, die9, die10;
	int counter, o, x, y, db = 0;
	int D1, D2, D3, D4, D5;
	Color color;
	boolean player1 = false, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
	boolean[] dnum;
	
	public playPanel() 
	{
		
		//Sets Button
		roll.setBounds(650, 450, 100, 40);
		roll.setOpaque(true);
		roll.setText("Roll dice");
		
		//Sets Arrays list sizes
		outline = new openSquare[10];
		sq = new Square[20];
		dice = new Square[10];
		dots = new Circle[60];
		diceButton = new JButton[20];
		dnum = new boolean[20];
		
		//Sets Size and Color
		setPreferredSize(new Dimension(1000, 1000));
		this.setBackground(Color.lightGray);
		
		//sets Bottome Pulling Dice
		x = 200; y = 600;
			
		for(int s = 0; s < sq.length; s++) 
		{
			sq[s] = new Square(70, Color.gray, x, y);
			x += 120;
			
			if(s == 4) {
				y = 300;
				x = 200;
			}
			
			if(s == 9) {
				y = 700;
				x = 200;
			}
			
			if(s == 14) {
				y = 200;
				x = 200;
			}
		}
		
		//sets Top Buttons
		x = 200;
		y = 300;
		for(db = 0; db < diceButton.length; db++) 
		{
			diceButton[db] = new JButton(); 
			diceButton[db].setBounds(x, y, 70, 70);
			diceButton[db].setBackground(Color.darkGray);
		
			x += 120;
			
			if(db == 4) {
				y = 600;
				x = 200;
			}
			if(db == 9) {
				y = 700;
				x = 200;
			}
			if(db == 14) {
				y = 200;
				x = 200;
			}
		}
		
		//sets Top Die
		x = 200; y = 700;
		
		for(int d = 0; d < dice.length; d++) 
		{
			dice[d] = new Square(70, Color.white, x, y);
			x += 120;
			if(d == 4)
			{
				y = 200;
				x = 200;
			}
		}
		
		x = 200;
		y = 700;
		
		for(int r = 0; r < outline.length; r++) 
		{
			outline[r] = new openSquare(70, Color.black, x, y);
			x += 120;
			if(r == 4) 
			{
				x = 200;
				y = 200;
			}
		}
		
		// sets Top Dots
		x = 125; y = 750;
		color = Color.black;
		for(o = 0; o < dots.length; o++) 
		{
			if(o%2 == 0) 
			{
				x -= 30;
				y += 20;
			}
			if(o%2 != 0) 
			{
				x += 30;
			}
			if(o%6 == 0)
			{
				x += 120;
				y -= 60;	
			}
			if(o == 30)
			{
				y = 210;
				x = 215;
			}
			dots[o] = new Circle(10, color, x, y);
		}	
			
		//sets Roll Die for Player 1
		counter = 0;
		roll.addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){ 
			
			if(player1 == true)
			{
				if(counter < 3) 
				{
				
					if(d1 == false) 
					{
						die1 = gen.nextInt(6)+1; 
					}
					if(d2 == false) 
					{
						die2 = gen.nextInt(6)+1; 
					}
					if(d3 == false) 
					{
						die3 = gen.nextInt(6)+1; 
					} 
					if(d4 == false) 
					{
						die4 = gen.nextInt(6)+1; 
					} 
					if(d5 == false) 
					{
						die5 = gen.nextInt(6)+1; 
					}
			}
			counter++;
				
				y = 600;
				x = 80;
				for(int d = 0; d < dice.length; d++) 
				{
					x += 120;
					if(d == 5)
					{
						y = 200;
						x = 200;
					}
					if(d1 == true && d == 0) 
					{
						dice[d] = new Square(70, Color.white, x, y+100);
					}
					if(d1 == false && d == 0)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d2 == true && d == 1) 
					{
						dice[d] = new Square(70, Color.white, x, y+100);
					}
					if(d2 == false && d == 1)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d3 == true && d == 2) 
					{
						dice[d] = new Square(70, Color.white, x, y+100);
					}
					if(d3 == false && d == 2)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d4 == true && d == 3) 
					{
						dice[d] = new Square(70, Color.white, x, y+100);
					}
					if(d4 == false && d == 3)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d5 == true && d == 4) 
					{
						dice[d] = new Square(70, Color.white, x, y+100);
					}
					if(d5 == false && d == 4)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}				
			}
			for(o = 0; o < 30; o++) 
			{ 			
				if(die1 == 1) 
				{ 
					 color = Color.BLACK;
					 x = 230;
					 y = 630 + 100*o;
				}
				if(die1 == 1 && o > 0 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 2) 
				{
					color = Color.BLACK;
					x = 230;
					y = 620 + 25*o;
				}
				if(die1 == 2 && o > 1 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 3) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die1 == 3 && o > 2 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 4) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 215;
						y = 615 + o*15;
					}
					else 
					{
						x = 245;
						y = 600 + o*15;
					}
				}
				if(die1 == 4 && o > 3 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 5) 
				{
					color = Color.BLACK;
					if(o == 0 || o == 3 ) 
					{
						x = 215;
						y = 615 + o*10;
					}
					if(o == 1 || o == 4) 
					{
						x = 245;
						y = 605 + o*10;
					}
					if(o == 2) 
					{
						x = 230;
						y = 630;
					}
				}
				if(die1 == 5 && o == 5) 
				{
					x = 280;
					color = Color.lightGray;
				}
				
				if(die1 == 6) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 215;
						 y = 610 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 245;
						 y = 600 + o*10;
					 }
				}
				
				if(die2 == 1 && o > 5) 
				{ 
					 color = Color.BLACK;
					 x = 350;
					 y = 630;
				}
				if(die2 == 1 && o > 6 && o < 12) 
				{
					y = 700;
					color = Color.lightGray;
					x = 400;
				}
				if(die2 == 2 && o > 5) 
				{
					color = Color.BLACK;
					x = 350;
					y = 470 + 25*o;
				}
				if(die2 == 2 && o > 7) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die2 == 3 && o > 5) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die2 == 3 && o > 8) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die2 == 4 && o > 5) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 335;
						y = 525 + o*15;
					}
					else 
					{
						x = 365;
						y = 510 + o*15;
					}
				}
				if(die2 == 4 && o > 9) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die2 == 5 && o > 5) 
				{
					color = Color.BLACK;
					if(o == 6 || o == 9) 
					{
						x = 335;
						y = 555 + o*10;
					}
					if(o == 7 || o == 10) 
					{
						x = 365;
						y = 545 + o*10;
					}
					if(o == 8) 
					{
						x = 350;
						y = 630;
					}
				}
				if(die2 == 5 && o > 10) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die2 == 6 && o > 5) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 335;
						 y = 550 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 365;
						 y = 540 + o*10;
					 }
				}	
				if(die2 == 6 && o > 11) 
				{
					color = Color.lightGray;
					x = 400;
				} 
				if(die3 == 1 && o > 11) 
				{ 
					 color = Color.BLACK;
					 x = 470;
					 y = 630;
				}
				if(die3 == 1 && o > 12 && o < 17) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die3 == 2 && o > 11) 
				{
					color = Color.BLACK;
					x = 470;
					y = 320 + 25*o;
				}
				if(die3 == 2 && o > 13 && o < 18) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die3 == 3 && o > 11) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die3 == 3 && o > 14) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die3 == 4 && o > 11) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 455;
						y = 435 + o*15;
					}
					else 
					{
						x = 485;
						y = 420 + o*15;
					}
				}
				if(die3 == 4 && o > 15 && o < 18) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die3 == 5 && o > 11) 
				{
					color = Color.BLACK;
					if(o == 12 || o == 15) 
					{
						x = 455;
						y = 495 + o*10;
					}
					if(o == 13 || o == 16) 
					{
						x = 485;
						y = 485 + o*10;
					}
					if(o == 14) 
					{
						x = 470;
						y = 630;
					}
				}
				if(die3 == 5 && o > 16) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die3 == 6 && o > 11) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 455;
						 y = 490 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 485;
						 y = 480 + o*10;
					 }
				}		
				
				if(die4 == 1 && o > 17) 
				{ 
					 color = Color.BLACK;
					 x = 590;
					 y = 630;
				}
				if(die4 == 1 && o > 18) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die4 == 2 && o > 17) 
				{
					color = Color.BLACK;
					x = 590;
					y = 170 + 25*o;
				}
				if(die4 == 2 && o > 19) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die4 == 3 && o > 17) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die4 == 3 && o > 20) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die4 == 4 && o > 17) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 575;
						y = 345 + o*15;
					}
					else 
					{
						x = 605;
						y = 330 + o*15;
					}
				}
				if(die4 == 4 && o > 21) 
				{
					color = Color.lightGray;
					x = 400;
					
				}
				if(die4 == 5 && o > 17) 
				{
					color = Color.BLACK;
					if(o == 18 || o == 21) 
					{
						x = 575;
						y = 435 + o*10;
					}
					if(o == 19 || o == 22) 
					{
						x = 605;
						y = 425 + o*10;
					}
					if(o == 20) 
					{
						x = 590;
						y = 630;
					}
				}
				if(die4 == 5 && o > 22) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die4 == 6 && o > 17) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 575;
						 y = 430 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 605;
						 y = 420 + o*10;
					 }
				}	
				if(die4 == 6 && o > 23) 
				{
					color = Color.lightGray;
					x = 400;
				} 
				
				if(die5 == 1 && o > 23) 
				{ 
					 color = Color.BLACK;
					 x = 710;
					 y = 630;
				}
				if(die5 == 1 && o > 24) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die5 == 2 && o > 23) 
				{
					color = Color.BLACK;
					x = 710;
					y = 20 + 25*o;
				}
				if(die5 == 2 && o > 25) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die5 == 3 && o > 23) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die5 == 3 && o > 26) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die5 == 4 && o > 23) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 695;
						y = 255 + o*15;
					}
					else 
					{
						x = 725;
						y = 240 + o*15;
					}
				}
				if(die5 == 4 && o > 27) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die5 == 5 && o > 23) 
				{
					color = Color.BLACK;
					if(o == 24 || o == 27) 
					{
						x = 695;
						y = 375 + o*10;
					}
					if(o == 25 || o == 28) 
					{
						x = 725;
						y = 365 + o*10;
					}
					if(o == 26) 
					{
						x = 710;
						y = 630;
					}
				}
				if(die5 == 5 && o > 28) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die5 == 6 && o > 23) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 695;
						 y = 370 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 725;
						 y = 360 + o*10;
					 }
				}	
				if(die5 == 6 && o > 29) 
				{
					color = Color.lightGray;
					x = 400;
				}
				
				if(d1 == true && o < 6)
				{
					dots[o] = new Circle(10, color, x, y+100);
				}
				if(d1 == false && o < 6) 
				{
				dots[o] = new Circle(10, color, x, y);	
				}
				if(d2 == true && o > 5 && o < 12)
				{
					dots[o] = new Circle(10, color, x, y+100);
				}
				if(d2 == false && o > 5 && o < 12) 
				{
				dots[o] = new Circle(10, color, x, y);	
				}
				if(d3 == true && o > 11 && o < 18)
				{
					dots[o] = new Circle(10, color, x, y+100);
				}
				if(d3 == false && o > 11 && o < 18) 
				{
				dots[o] = new Circle(10, color, x, y);	
				}
				if(d4 == true && o > 17 && o < 24)
				{
					dots[o] = new Circle(10, color, x, y+100);
				}
				if(d4 == false && o > 17 && o < 24) 
				{
				dots[o] = new Circle(10, color, x, y);	
				}
				if(d5 == true && o > 23 && o < 30)
				{
					dots[o] = new Circle(10, color, x, y+100);
				}
				if(d5 == false && o > 23 && o < 30) 
				{
				dots[o] = new Circle(10, color, x, y);	
				}
				s.repaint();
			}	
			}	
			
			if(player1 == false)
			{
			//if(counter < 3) {
				
			if(d6 == false) 
			{
			die6 = gen.nextInt(6)+1; 
			}
			if(d7 == false) 
			{
			die7 = gen.nextInt(6)+1; 
			}
			if(d8 == false) 
			{
			die8 = gen.nextInt(6)+1; 
			} 
			if(d9 == false) 
			{
			die9 = gen.nextInt(6)+1; 
			} 
			if(d10 == false) 
			{
			die10 = gen.nextInt(6)+1; 
			}
			
			//}
			
			counter++;
				
				y = 600;
				x = 80;
				for(int d = 5; d < dice.length; d++) 
				{
					x += 120;
					if(d == 5)
					{
						y = 300;
						x = 200;
					}
					if(d6 == true && d == 5) 
					{
						dice[d] = new Square(70, Color.white, x, y-100);
					}
					if(d6 == false && d == 5)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d7 == true && d == 6) 
					{
						dice[d] = new Square(70, Color.white, x, y-100);
					}
					if(d7 == false && d == 6)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d8 == true && d == 7) 
					{
						dice[d] = new Square(70, Color.white, x, y-100);
					}
					if(d8 == false && d == 7)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d9 == true && d == 8) 
					{
						dice[d] = new Square(70, Color.white, x, y-100);
					}
					if(d9 == false && d == 8)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}
					if(d10 == true && d == 9) 
					{
						dice[d] = new Square(70, Color.white, x, y-100);
					}
					if(d10 == false && d == 9)
					{
					dice[d] = new Square(70, Color.white, x, y);
					}				
			}
			for(o = 30; o < 60; o++) 
			{ 			
				if(die6 == 1 && o == 30) 
				{ 
					 color = Color.BLACK;
					 x = 230;
					 y = 630 + 100*(o-30);
				}
				if(die6 == 1 && o > 30) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die6 == 2) 
				{
					color = Color.BLACK;
					x = 230;
					y = 620 + 25*(o-30);
				}
				if(die6 == 2 && o > 31) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die6 == 3 && o < 33) 
				{
					color = Color.BLACK;
					x = 210 + 20*(o-30);
					y = 630;
				}
				if(die6 == 3 && o > 32) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die6 == 4) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 215;
						y = 615 + 15*(o-30);
					}
					else 
					{
						x = 245;
						y = 600 + 15*(o-30);
					}
				}
				if(die6 == 4 && o > 33) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die6 == 5) 
				{
					color = Color.BLACK;
					if(o == 30 || o == 33) 
					{
						x = 215;
						y = 615 + 10*(o-30);
					}
					if(o == 31 || o == 34) 
					{
						x = 245;
						y = 605 + 10*(o-30);
					}
					if(o == 32) 
					{
						x = 230;
						y = 630;
					}
				}
				if(die6 == 5 && o > 34) 
				{
					x = 280;
					color = Color.lightGray;
				}
				
				if(die6 == 6) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 215;
						 y = 610 + 10*(o-30);
					}
					 if(o%2 != 0) 
					 {
						 x = 245;
						 y = 600 + 10*(o-30);
					 }
				}
				if(die6 == 6 && o > 35) 
				{
					y = 700;
					color = Color.lightGray;
					x = 400;
				}
				
				if(die7 == 1 && o > 35) 
				{ 
					 color = Color.BLACK;
					 x = 350;
					 y = 630;
				}
				if(die7 == 1 && o > 36) 
				{
					y = 700;
					color = Color.lightGray;
					x = 400;
				}
				if(die7 == 2 && o > 35) 
				{
					color = Color.BLACK;
					x = 350;
					y = 470 + 25*(o-30);
				}
				if(die7 == 2 && o > 37) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die7 == 3 && o > 35) 
				{
					color = Color.BLACK;
					x = 210 + 20*(o-30);
					y = 630;
				}
				if(die7 == 3 && o > 38) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die7 == 4 && o > 35) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 335;
						y = 525 + 15*(o-30);
					}
					else 
					{
						x = 365;
						y = 510 + 15*(o-30);
					}
				}
				if(die7 == 4 && o > 39) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die7 == 5 && o > 35) 
				{
					color = Color.BLACK;
					if(o == 36 || o == 39) 
					{
						x = 335;
						y = 555 + 10*(o-30);
					}
					if(o == 37 || o == 40) 
					{
						x = 365;
						y = 545 + 10*(o-30);
					}
					if(o == 38) 
					{
						x = 350;
						y = 630;
					}
				}
				if(die7 == 5 && o > 40) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die7 == 6 && o > 35) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 335;
						 y = 550 + 10*(o-30);
					}
					 if(o%2 != 0) 
					 {
						 x = 365;
						 y = 540 + 10*(o-30);
					 }
				}	
				if(die7 == 6 && o > 41) 
				{
					color = Color.lightGray;
					x = 400;
				} 
				if(die8 == 1 && o > 41) 
				{ 
					 color = Color.BLACK;
					 x = 470;
					 y = 630;
				}
				if(die8 == 1 && o > 42) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die8 == 2 && o > 41) 
				{
					color = Color.BLACK;
					x = 470;
					y = 320 + 25*(o-30);
				}
				if(die8 == 2 && o > 43) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die8 == 3 && o > 41) 
				{
					color = Color.BLACK;
					x = 210 + 20*(o-30);
					y = 630;
				}
				if(die8 == 3 && o > 44) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die8 == 4 && o > 41) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 455;
						y = 435 + 15*(o-30);
					}
					else 
					{
						x = 485;
						y = 420 + 15*(o-30);
					}
				}
				if(die8 == 4 && o > 45) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die8 == 5 && o > 41) 
				{
					color = Color.BLACK;
					if(o == 42 || o == 45) 
					{
						x = 455;
						y = 495 + 10*(o-30);
					}
					if(o == 43 || o == 46) 
					{
						x = 485;
						y = 485 + 10*(o-30);
					}
					if(o == 44) 
					{
						x = 470;
						y = 630;
					}
				}
				if(die8 == 5 && o > 46) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die8 == 6 && o > 41) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 455;
						 y = 490 + 10*(o-30);
					}
					 if(o%2 != 0) 
					 {
						 x = 485;
						 y = 480 + 10*(o-30);
					 }
				}		
				if(die8 == 6 && o > 47) 
				{
					x = 400;
					color = Color.lightGray;
				}
				
				if(die9 == 1 && o > 47) 
				{ 
					 color = Color.BLACK;
					 x = 590;
					 y = 630;
				}
				if(die9 == 1 && o > 48) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die9 == 2 && o > 47) 
				{
					color = Color.BLACK;
					x = 590;
					y = 170 + 25*(o-30);
				}
				if(die9 == 2 && o > 49) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die9 == 3 && o > 47) 
				{
					color = Color.BLACK;
					x = 210 + 20*(o-30);
					y = 630;
				}
				if(die9 == 3 && o > 50) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die9 == 4 && o > 47) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 575;
						y = 345 + 15*(o-30);
					}
					else 
					{
						x = 605;
						y = 330 + 15*(o-30);
					}
				}
				if(die9 == 4 && o > 51) 
				{
					color = Color.lightGray;
					x = 400;
					
				}
				if(die9 == 5 && o > 47) 
				{
					color = Color.BLACK;
					if(o == 48 || o == 51) 
					{
						x = 575;
						y = 435 + 10*(o-30);
					}
					if(o == 49 || o == 52) 
					{
						x = 605;
						y = 425 + 10*(o-30);
					}
					if(o == 50) 
					{
						x = 590;
						y = 630;
					}
				}
				if(die9 == 5 && o > 52) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die9 == 6 && o > 47) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 575;
						 y = 430 + 10*(o-30);
					}
					 if(o%2 != 0) 
					 {
						 x = 605;
						 y = 420 + 10*(o-30);
					 }
				}	
				if(die9 == 6 && o > 53) 
				{
					color = Color.lightGray;
					x = 400;
				} 
				
				if(die10 == 1 && o > 53) 
				{ 
					 color = Color.BLACK;
					 x = 710;
					 y = 630;
				}
				if(die10 == 1 && o > 54) 
				{
					y = 700; x = 400;
					color = Color.lightGray;
				}
				if(die10 == 2 && o > 53) 
				{
					color = Color.BLACK;
					x = 710;
					y = 20 + 25*(o-30);
				}
				if(die10 == 2 && o > 55) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die10 == 3 && o > 53) 
				{
					color = Color.BLACK;
					x = 210 + 20*(o-30);
					y = 630;
				}
				if(die10 == 3 && o > 56) 
				{
					x = 400;
					color = Color.lightGray;
				}
				if(die10 == 4 && o > 53) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 695;
						y = 255 + 15*(o-30);
					}
					else 
					{
						x = 725;
						y = 240 + 15*(o-30);
					}
				}
				if(die10 == 4 && o > 57) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die10 == 5 && o > 53) 
				{
					color = Color.BLACK;
					if(o == 54 || o == 57) 
					{
						x = 695;
						y = 375 + 10*(o-30);
					}
					if(o == 55 || o == 58) 
					{
						x = 725;
						y = 365 + 10*(o-30);
					}
					if(o == 56) 
					{
						x = 710;
						y = 630;
					}
				}
				if(die10 == 5 && o > 58) 
				{
					x = 280;
					color = Color.lightGray;
				}
				if(die10 == 6 && o > 53) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 695;
						 y = 370 + 10*(o-30);
					}
					 if(o%2 != 0) 
					 {
						 x = 725;
						 y = 360 + 10*(o-30);
					 }
				}	
				if(die10 == 6 && o > 59) 
				{
					color = Color.lightGray;
					x = 400;
				}
				
				if(d6 == true && o < 36)
				{
					dots[o] = new Circle(10, color, x, y-400);
				}
				if(d6 == false && o < 36) 
				{
				dots[o] = new Circle(10, color, x, y-300);	
				}
				if(d7 == true && o > 35 && o < 42)
				{
					dots[o] = new Circle(10, color, x, y-400);
				}
				if(d7 == false && o > 35 && o < 42) 
				{
				dots[o] = new Circle(10, color, x, y-300);	
				}
				if(d8 == true && o > 41 && o < 48)
				{
					dots[o] = new Circle(10, color, x, y-400);
				}
				if(d8 == false && o > 41 && o < 48) 
				{
				dots[o] = new Circle(10, color, x, y-300);	
				}
				if(d9 == true && o > 47 && o < 54)
				{
					dots[o] = new Circle(10, color, x, y-400);
				}
				if(d9 == false && o > 47 && o < 54) 
				{
				dots[o] = new Circle(10, color, x, y-300);	
				}
				if(d10 == true && o > 53 && o < 60)
				{
					dots[o] = new Circle(10, color, x, y-400);
				}
				if(d10 == false && o > 53 && o < 60) 
				{
				dots[o] = new Circle(10, color, x, y-300);	
				}
			}	
			}
			s.repaint();

			repaint();
	    }
		}
			);
		
		
		for(db = 0; db < diceButton.length; db++) 
		{
			
			diceButton[0].addActionListener(new ActionListener()		
			{     	
			public void actionPerformed(ActionEvent e){ 
				
		        
					dice[5] = new Square(70, Color.white, 200, 200);
					d6 = true;
			            
		            for(o = 30; o < 36; o++) 
					{ 
		
		            	if(die6 == 1 && o == 30) 
						{ 
							 color = Color.BLACK;
							 x = 230;
							 y = 630 + 100*(o-30);
						}
						if(die6 == 1 && o > 30) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die6 == 2) 
						{
							color = Color.BLACK;
							x = 230;
							y = 620 + 25*(o-30);
						}
						if(die6 == 2 && o > 31) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die6 == 3 && o < 33) 
						{
							color = Color.BLACK;
							x = 210 + 20*(o-30);
							y = 630;
						}
						if(die6 == 3 && o > 32) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die6 == 4) 
						{
							color = Color.BLACK;
							if(o%2 == 0) 
							{
								x = 215;
								y = 615 + 15*(o-30);
							}
							else 
							{
								x = 245;
								y = 600 + 15*(o-30);
							}
						}
						if(die6 == 4 && o > 33) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die6 == 5) 
						{
							color = Color.BLACK;
							if(o == 30 || o == 33) 
							{
								x = 215;
								y = 615 + 10*(o-30);
							}
							if(o == 31 || o == 34) 
							{
								x = 245;
								y = 605 + 10*(o-30);
							}
							if(o == 32) 
							{
								x = 230;
								y = 630;
							}
						}
						if(die6 == 5 && o > 34) 
						{
							x = 280;
							color = Color.lightGray;
						}
						
						if(die6 == 6) 
						{
							color = Color.BLACK;
							 if(o%2 == 0) 
							 {
								 x = 215;
								 y = 610 + 10*(o-30);
							}
							 if(o%2 != 0) 
							 {
								 x = 245;
								 y = 600 + 10*(o-30);
							 }
						}
						if(die6 == 6 && o > 35) 
						{
							y = 700;
							color = Color.lightGray;
							x = 400;
						}

					
					dots[o] = new Circle(10, color, x, y-400);
					}	
		    
			repaint();
			
			}
			}
				);
			
			diceButton[1].addActionListener(new ActionListener()		
			{     	
			public void actionPerformed(ActionEvent e){  
		        
					dice[6] = new Square(70, Color.white, 320, 200);
					d7 = true;
			            
		            for(o = 36; o < 42; o++) 
					{ 
		
		            	if(die7 == 1 && o > 35) 
						{ 
							 color = Color.BLACK;
							 x = 350;
							 y = 630;
						}
						if(die7 == 1 && o > 36) 
						{
							y = 700;
							color = Color.lightGray;
							x = 400;
						}
						if(die7 == 2 && o > 35) 
						{
							color = Color.BLACK;
							x = 350;
							y = 470 + 25*(o-30);
						}
						if(die7 == 2 && o > 37) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die7 == 3 && o > 35) 
						{
							color = Color.BLACK;
							x = 210 + 20*(o-30);
							y = 630;
						}
						if(die7 == 3 && o > 38) 
						{
							x = 400;
							color = Color.lightGray;
						}
						if(die7 == 4 && o > 35) 
						{
							color = Color.BLACK;
							if(o%2 == 0) 
							{
								x = 335;
								y = 525 + 15*(o-30);
							}
							else 
							{
								x = 365;
								y = 510 + 15*(o-30);
							}
						}
						if(die7 == 4 && o > 39) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die7 == 5 && o > 35) 
						{
							color = Color.BLACK;
							if(o == 36 || o == 39) 
							{
								x = 335;
								y = 555 + 10*(o-30);
							}
							if(o == 37 || o == 40) 
							{
								x = 365;
								y = 545 + 10*(o-30);
							}
							if(o == 38) 
							{
								x = 350;
								y = 630;
							}
						}
						if(die7 == 5 && o > 40) 
						{
							x = 280;
							color = Color.lightGray;
						}
						if(die7 == 6 && o > 35) 
						{
							color = Color.BLACK;
							 if(o%2 == 0) 
							 {
								 x = 335;
								 y = 550 + 10*(o-30);
							}
							 if(o%2 != 0) 
							 {
								 x = 365;
								 y = 540 + 10*(o-30);
							 }
						}	
						if(die7 == 6 && o > 41) 
						{
							color = Color.lightGray;
							x = 400;
						} 
					
					dots[o] = new Circle(10, color, x, y-400);
					}	
		    
			repaint();
			
			}
			}
				);
			
			diceButton[2].addActionListener(new ActionListener()		
			{     	
			public void actionPerformed(ActionEvent e){  
		        
					dice[7] = new Square(70, Color.white, 440, 200);
					d8 = true;
			            
		            for(o = 42; o < 48; o++) 
					{ 
		
		            	if(die8 == 1 && o > 41) 
						{ 
							 color = Color.BLACK;
							 x = 470;
							 y = 630;
						}
						if(die8 == 1 && o > 42) 
						{
							y = 700; x = 400;
							color = Color.lightGray;
						}
						if(die8 == 2 && o > 41) 
						{
							color = Color.BLACK;
							x = 470;
							y = 320 + 25*(o-30);
						}
						if(die8 == 2 && o > 43) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die8 == 3 && o > 41) 
						{
							color = Color.BLACK;
							x = 210 + 20*(o-30);
							y = 630;
						}
						if(die8 == 3 && o > 44) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die8 == 4 && o > 41) 
						{
							color = Color.BLACK;
							if(o%2 == 0) 
							{
								x = 455;
								y = 435 + 15*(o-30);
							}
							else 
							{
								x = 485;
								y = 420 + 15*(o-30);
							}
						}
						if(die8 == 4 && o > 45) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die8 == 5 && o > 41) 
						{
							color = Color.BLACK;
							if(o == 42 || o == 45) 
							{
								x = 455;
								y = 495 + 10*(o-30);
							}
							if(o == 43 || o == 46) 
							{
								x = 485;
								y = 485 + 10*(o-30);
							}
							if(o == 44) 
							{
								x = 470;
								y = 630;
							}
						}
						if(die8 == 5 && o > 46) 
						{
							x = 400;
							color = Color.lightGray;
						}
						if(die8 == 6 && o > 41) 
						{
							color = Color.BLACK;
							 if(o%2 == 0) 
							 {
								 x = 455;
								 y = 490 + 10*(o-30);
							}
							 if(o%2 != 0) 
							 {
								 x = 485;
								 y = 480 + 10*(o-30);
							 }
						}		
						if(die8 == 6 && o > 47) 
						{
							x = 400;
							color = Color.lightGray;
						}
						
					
					dots[o] = new Circle(10, color, x, y-400);
					}	
		    
			repaint();
			
			}
			}
				);
			
			diceButton[3].addActionListener(new ActionListener()		
			{     	
			public void actionPerformed(ActionEvent e){  
		        
					dice[8] = new Square(70, Color.white, 560, 200);
					d9 = true;
			            
		            for(o = 48; o < 54; o++) 
					{ 
		
		            	if(die9 == 1 && o > 47) 
						{ 
							 color = Color.BLACK;
							 x = 590;
							 y = 630;
						}
						if(die9 == 1 && o > 48) 
						{
							y = 700; x = 400;
							color = Color.lightGray;
						}
						if(die9 == 2 && o > 47) 
						{
							color = Color.BLACK;
							x = 590;
							y = 170 + 25*(o-30);
						}
						if(die9 == 2 && o > 49) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die9 == 3 && o > 47) 
						{
							color = Color.BLACK;
							x = 210 + 20*(o-30);
							y = 630;
						}
						if(die9 == 3 && o > 50) 
						{
							x = 400;
							color = Color.lightGray;
						}
						if(die9 == 4 && o > 47) 
						{
							color = Color.BLACK;
							if(o%2 == 0) 
							{
								x = 575;
								y = 345 + 15*(o-30);
							}
							else 
							{
								x = 605;
								y = 330 + 15*(o-30);
							}
						}
						if(die9 == 4 && o > 51) 
						{
							color = Color.lightGray;
							x = 400;
							
						}
						if(die9 == 5 && o > 47) 
						{
							color = Color.BLACK;
							if(o == 48 || o == 51) 
							{
								x = 575;
								y = 435 + 10*(o-30);
							}
							if(o == 49 || o == 52) 
							{
								x = 605;
								y = 425 + 10*(o-30);
							}
							if(o == 50) 
							{
								x = 590;
								y = 630;
							}
						}
						if(die9 == 5 && o > 52) 
						{
							x = 280;
							color = Color.lightGray;
						}
						if(die9 == 6 && o > 47) 
						{
							color = Color.BLACK;
							 if(o%2 == 0) 
							 {
								 x = 575;
								 y = 430 + 10*(o-30);
							}
							 if(o%2 != 0) 
							 {
								 x = 605;
								 y = 420 + 10*(o-30);
							 }
						}	
						if(die9 == 6 && o > 53) 
						{
							color = Color.lightGray;
							x = 400;
						} 

					
					dots[o] = new Circle(10, color, x, y-400);
					}	
		    
			repaint();
			
			}
			}
				);
			
			diceButton[4].addActionListener(new ActionListener()		
			{     	
			public void actionPerformed(ActionEvent e){  
		        
					dice[9] = new Square(70, Color.white, 680, 200);
					d10 = true;
			            
		            for(o = 54; o < 60; o++) 
					{ 
		
		            	if(die10 == 1 && o > 53) 
						{ 
							 color = Color.BLACK;
							 x = 710;
							 y = 630;
						}
						if(die10 == 1 && o > 54) 
						{
							y = 700; x = 400;
							color = Color.lightGray;
						}
						if(die10 == 2 && o > 53) 
						{
							color = Color.BLACK;
							x = 710;
							y = 20 + 25*(o-30);
						}
						if(die10 == 2 && o > 55) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die10 == 3 && o > 53) 
						{
							color = Color.BLACK;
							x = 210 + 20*(o-30);
							y = 630;
						}
						if(die10 == 3 && o > 56) 
						{
							x = 400;
							color = Color.lightGray;
						}
						if(die10 == 4 && o > 53) 
						{
							color = Color.BLACK;
							if(o%2 == 0) 
							{
								x = 695;
								y = 255 + 15*(o-30);
							}
							else 
							{
								x = 725;
								y = 240 + 15*(o-30);
							}
						}
						if(die10 == 4 && o > 57) 
						{
							color = Color.lightGray;
							x = 400;
						}
						if(die10 == 5 && o > 53) 
						{
							color = Color.BLACK;
							if(o == 54 || o == 57) 
							{
								x = 695;
								y = 375 + 10*(o-30);
							}
							if(o == 55 || o == 58) 
							{
								x = 725;
								y = 365 + 10*(o-30);
							}
							if(o == 56) 
							{
								x = 710;
								y = 630;
							}
						}
						if(die10 == 5 && o > 58) 
						{
							x = 280;
							color = Color.lightGray;
						}
						if(die10 == 6 && o > 53) 
						{
							color = Color.BLACK;
							 if(o%2 == 0) 
							 {
								 x = 695;
								 y = 370 + 10*(o-30);
							}
							 if(o%2 != 0) 
							 {
								 x = 725;
								 y = 360 + 10*(o-30);
							 }
						}	
						if(die10 == 6 && o > 59) 
						{
							color = Color.lightGray;
							x = 400;
						}
					
					dots[o] = new Circle(10, color, x, y-400);
					}	
		    
			repaint();
			
			}
			}
				);
			
		diceButton[5].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[0] = new Square(70, Color.white, 200, 700);
				d1 = true;
		            
	            for(o = 0; o < 6; o++) 
				{ 
	
	            if(die1 == 1) 
				{ 
					 color = Color.BLACK;
					 x = 230;
					 y = 630 + 100*o;
				}
				if(die1 == 1 && o > 0 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 2) 
				{
					color = Color.BLACK;
					x = 230;
					y = 620 + 25*o;
				}
				if(die1 == 2 && o > 1 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 3) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die1 == 3 && o > 2 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 4) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 215;
						y = 615 + o*15;
					}
					else 
					{
						x = 245;
						y = 600 + o*15;
					}
				}
				if(die1 == 4 && o > 3 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 5) 
				{
					color = Color.BLACK;
					if(o == 0 || o == 3 ) 
					{
						x = 215;
						y = 615 + o*10;
					}
					if(o == 1 || o == 4) 
					{
						x = 245;
						y = 605 + o*10;
					}
					if(o == 2) 
					{
						x = 230;
						y = 630;
					}
				}
				if(die1 == 5 && o == 5) 
				{
					x = 280;
					color = Color.lightGray;
				}
				
				if(die1 == 6) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 215;
						 y = 610 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 245;
						 y = 600 + o*10;
					 }
				}
				
				dots[o] = new Circle(10, color, x, y+100);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[6].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[1] = new Square(70, Color.white, 320, 700);
		        d2 = true;    
				
	            for(o = 6; o < 12 && o > 5 ; o++) 
				{ 
	
	            	if(die2 == 1 && o > 5) 
					{ 
						 color = Color.BLACK;
						 x = 350;
						 y = 630;
					}
					if(die2 == 1 && o > 6 && o < 12) 
					{
						y = 700;
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 2 && o > 5) 
					{
						color = Color.BLACK;
						x = 350;
						y = 470 + 25*o;
					}
					if(die2 == 2 && o > 7) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 3 && o > 5) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die2 == 3 && o > 8) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die2 == 4 && o > 5) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 335;
							y = 525 + o*15;
						}
						else 
						{
							x = 365;
							y = 510 + o*15;
						}
					}
					if(die2 == 4 && o > 9) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 5 && o > 5) 
					{
						color = Color.BLACK;
						if(o == 6 || o == 9) 
						{
							x = 335;
							y = 555 + o*10;
						}
						if(o == 7 || o == 10) 
						{
							x = 365;
							y = 545 + o*10;
						}
						if(o == 8) 
						{
							x = 350;
							y = 630;
						}
					}
					if(die2 == 5 && o > 10) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die2 == 6 && o > 5) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 335;
							 y = 550 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 365;
							 y = 540 + o*10;
						 }
					}	
					if(die2 == 6 && o > 11) 
					{
						color = Color.lightGray;
						x = 400;
					} 
				
				dots[o] = new Circle(10, color, x, y+100);
				}	
	    
		repaint();
		
		}
		}
	);
		
		diceButton[7].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[2] = new Square(70, Color.white, 440, 700);
				d3 = true;
		            
	            for(o = 12; o < 18 && o > 11 ; o++) 
				{ 
	            	if(die3 == 1 && o > 11) 
					{ 
						 color = Color.BLACK;
						 x = 470;
						 y = 630;
					}
					if(die3 == 1 && o > 12 && o < 17) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die3 == 2 && o > 11) 
					{
						color = Color.BLACK;
						x = 470;
						y = 320 + 25*o;
					}
					if(die3 == 2 && o > 13 && o < 18) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 3 && o > 11) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die3 == 3 && o > 14) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 4 && o > 11) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 455;
							y = 435 + o*15;
						}
						else 
						{
							x = 485;
							y = 420 + o*15;
						}
					}
					if(die3 == 4 && o > 15 && o < 18) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 5 && o > 11) 
					{
						color = Color.BLACK;
						if(o == 12 || o == 15) 
						{
							x = 455;
							y = 495 + o*10;
						}
						if(o == 13 || o == 16) 
						{
							x = 485;
							y = 485 + o*10;
						}
						if(o == 14) 
						{
							x = 470;
							y = 630;
						}
					}
					if(die3 == 5 && o > 16) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die3 == 6 && o > 11) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 455;
							 y = 490 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 485;
							 y = 480 + o*10;
						 }
					}						
				dots[o] = new Circle(10, color, x, y+100);
				}	
	    
		repaint();
		
		}
		}
	);
		
		diceButton[8].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[3] = new Square(70, Color.white, 560, 700);  
				d4 = true;
				
	            for(o = 18; o < 24 && o > 17 ; o++) 
				{ 
	            	if(die4 == 1 && o > 17) 
					{ 
						 color = Color.BLACK;
						 x = 590;
						 y = 630;
					}
					if(die4 == 1 && o > 18) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die4 == 2 && o > 17) 
					{
						color = Color.BLACK;
						x = 590;
						y = 170 + 25*o;
					}
					if(die4 == 2 && o > 19) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die4 == 3 && o > 17) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die4 == 3 && o > 20) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die4 == 4 && o > 17) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 575;
							y = 345 + o*15;
						}
						else 
						{
							x = 605;
							y = 330 + o*15;
						}
					}
					if(die4 == 4 && o > 21) 
					{
						color = Color.lightGray;
						x = 400;
						
					}
					if(die4 == 5 && o > 17) 
					{
						color = Color.BLACK;
						if(o == 18 || o == 21) 
						{
							x = 575;
							y = 435 + o*10;
						}
						if(o == 19 || o == 22) 
						{
							x = 605;
							y = 425 + o*10;
						}
						if(o == 20) 
						{
							x = 590;
							y = 630;
						}
					}
					if(die4 == 5 && o > 22) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die4 == 6 && o > 17) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 575;
							 y = 430 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 605;
							 y = 420 + o*10;
						 }
					}	
					if(die4 == 6 && o > 23) 
					{
						color = Color.lightGray;
						x = 400;
					} 						
				dots[o] = new Circle(10, color, x, y+100);
				}	
	    
		repaint();
		
		}
		}
	);

		diceButton[9].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[4] = new Square(70, Color.white, 680, 700);
				d5 = true;
		            
	            for(o = 24; o < 30 && o > 23 ; o++) 
				{ 
	            	
	            	if(die5 == 1 && o > 23) 
					{ 
						 color = Color.BLACK;
						 x = 710;
						 y = 630;
					}
					if(die5 == 1 && o > 24) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die5 == 2 && o > 23) 
					{
						color = Color.BLACK;
						x = 710;
						y = 20 + 25*o;
					}
					if(die5 == 2 && o > 25) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die5 == 3 && o > 23) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die5 == 3 && o > 26) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die5 == 4 && o > 23) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 695;
							y = 255 + o*15;
						}
						else 
						{
							x = 725;
							y = 240 + o*15;
						}
					}
					if(die5 == 4 && o > 27) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die5 == 5 && o > 23) 
					{
						color = Color.BLACK;
						if(o == 24 || o == 27) 
						{
							x = 695;
							y = 375 + o*10;
						}
						if(o == 25 || o == 28) 
						{
							x = 725;
							y = 365 + o*10;
						}
						if(o == 26) 
						{
							x = 710;
							y = 630;
						}
					}
					if(die5 == 5 && o > 28) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die5 == 6 && o > 23) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 695;
							 y = 370 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 725;
							 y = 360 + o*10;
						 }
					}	
					if(die5 == 6 && o > 29) 
					{
						color = Color.lightGray;
						x = 400;
					}
	            	
				dots[o] = new Circle(10, color, x, y+100);
				}	
	    
		repaint();
		
		}
		}
	);
		
		diceButton[10].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[0] = new Square(70, Color.white, 200, 600);
				d1 = false;
		            
	            for(o = 0; o < 6; o++) 
				{ 
	
	            if(die1 == 1) 
				{ 
					 color = Color.BLACK;
					 x = 230;
					 y = 630 + 100*o;
				}
				if(die1 == 1 && o > 0 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 2) 
				{
					color = Color.BLACK;
					x = 230;
					y = 620 + 25*o;
				}
				if(die1 == 2 && o > 1 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 3) 
				{
					color = Color.BLACK;
					x = 210 + o*20;
					y = 630;
				}
				if(die1 == 3 && o > 2 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 4) 
				{
					color = Color.BLACK;
					if(o%2 == 0) 
					{
						x = 215;
						y = 615 + o*15;
					}
					else 
					{
						x = 245;
						y = 600 + o*15;
					}
				}
				if(die1 == 4 && o > 3 && o < 6) 
				{
					color = Color.lightGray;
					x = 400;
				}
				if(die1 == 5) 
				{
					color = Color.BLACK;
					if(o == 0 || o == 3 ) 
					{
						x = 215;
						y = 615 + o*10;
					}
					if(o == 1 || o == 4) 
					{
						x = 245;
						y = 605 + o*10;
					}
					if(o == 2) 
					{
						x = 230;
						y = 630;
					}
				}
				if(die1 == 5 && o == 5) 
				{
					x = 280;
					color = Color.lightGray;
				}
				
				if(die1 == 6) 
				{
					color = Color.BLACK;
					 if(o%2 == 0) 
					 {
						 x = 215;
						 y = 610 + o*10;
					}
					 if(o%2 != 0) 
					 {
						 x = 245;
						 y = 600 + o*10;
					 }
				}
				
				dots[o] = new Circle(10, color, x, y);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[11].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[1] = new Square(70, Color.white, 320, 600);
		        d2 = false;    
				
	            for(o = 6; o < 12 && o > 5 ; o++) 
				{ 
	
	            	if(die2 == 1 && o > 5) 
					{ 
						 color = Color.BLACK;
						 x = 350;
						 y = 630;
					}
					if(die2 == 1 && o > 6 && o < 12) 
					{
						y = 700;
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 2 && o > 5) 
					{
						color = Color.BLACK;
						x = 350;
						y = 470 + 25*o;
					}
					if(die2 == 2 && o > 7) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 3 && o > 5) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die2 == 3 && o > 8) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die2 == 4 && o > 5) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 335;
							y = 525 + o*15;
						}
						else 
						{
							x = 365;
							y = 510 + o*15;
						}
					}
					if(die2 == 4 && o > 9) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die2 == 5 && o > 5) 
					{
						color = Color.BLACK;
						if(o == 6 || o == 9) 
						{
							x = 335;
							y = 555 + o*10;
						}
						if(o == 7 || o == 10) 
						{
							x = 365;
							y = 545 + o*10;
						}
						if(o == 8) 
						{
							x = 350;
							y = 630;
						}
					}
					if(die2 == 5 && o > 10) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die2 == 6 && o > 5) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 335;
							 y = 550 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 365;
							 y = 540 + o*10;
						 }
					}	
					if(die2 == 6 && o > 11) 
					{
						color = Color.lightGray;
						x = 400;
					} 
				
				dots[o] = new Circle(10, color, x, y);
				}	
	    
		repaint();
		
		}
		}
	);
		
		diceButton[12].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[2] = new Square(70, Color.white, 440, 600);
				d3 = false;
		            
	            for(o = 12; o < 18 && o > 11 ; o++) 
				{ 
	            	if(die3 == 1 && o > 11) 
					{ 
						 color = Color.BLACK;
						 x = 470;
						 y = 630;
					}
					if(die3 == 1 && o > 12 && o < 17) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die3 == 2 && o > 11) 
					{
						color = Color.BLACK;
						x = 470;
						y = 320 + 25*o;
					}
					if(die3 == 2 && o > 13 && o < 18) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 3 && o > 11) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die3 == 3 && o > 14) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 4 && o > 11) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 455;
							y = 435 + o*15;
						}
						else 
						{
							x = 485;
							y = 420 + o*15;
						}
					}
					if(die3 == 4 && o > 15 && o < 18) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die3 == 5 && o > 11) 
					{
						color = Color.BLACK;
						if(o == 12 || o == 15) 
						{
							x = 455;
							y = 495 + o*10;
						}
						if(o == 13 || o == 16) 
						{
							x = 485;
							y = 485 + o*10;
						}
						if(o == 14) 
						{
							x = 470;
							y = 630;
						}
					}
					if(die3 == 5 && o > 16) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die3 == 6 && o > 11) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 455;
							 y = 490 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 485;
							 y = 480 + o*10;
						 }
					}						
				dots[o] = new Circle(10, color, x, y);
				}	
	    
		repaint();
		
		}
		}
	);
		
		diceButton[13].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[3] = new Square(70, Color.white, 560, 600);  
				d4 = false;
				
	            for(o = 18; o < 24 && o > 17 ; o++) 
				{ 
	            	if(die4 == 1 && o > 17) 
					{ 
						 color = Color.BLACK;
						 x = 590;
						 y = 630;
					}
					if(die4 == 1 && o > 18) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die4 == 2 && o > 17) 
					{
						color = Color.BLACK;
						x = 590;
						y = 170 + 25*o;
					}
					if(die4 == 2 && o > 19) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die4 == 3 && o > 17) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die4 == 3 && o > 20) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die4 == 4 && o > 17) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 575;
							y = 345 + o*15;
						}
						else 
						{
							x = 605;
							y = 330 + o*15;
						}
					}
					if(die4 == 4 && o > 21) 
					{
						color = Color.lightGray;
						x = 400;
						
					}
					if(die4 == 5 && o > 17) 
					{
						color = Color.BLACK;
						if(o == 18 || o == 21) 
						{
							x = 575;
							y = 435 + o*10;
						}
						if(o == 19 || o == 22) 
						{
							x = 605;
							y = 425 + o*10;
						}
						if(o == 20) 
						{
							x = 590;
							y = 630;
						}
					}
					if(die4 == 5 && o > 22) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die4 == 6 && o > 17) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 575;
							 y = 430 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 605;
							 y = 420 + o*10;
						 }
					}	
					if(die4 == 6 && o > 23) 
					{
						color = Color.lightGray;
						x = 400;
					} 						
				dots[o] = new Circle(10, color, x, y);
				}	
	    
		repaint();
		
		}
		}
	);

		diceButton[14].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[4] = new Square(70, Color.white, 680, 600);
				d5 = false;
		            
	            for(o = 24; o < 30 && o > 23 ; o++) 
				{ 
	            	
	            	if(die5 == 1 && o > 23) 
					{ 
						 color = Color.BLACK;
						 x = 710;
						 y = 630;
					}
					if(die5 == 1 && o > 24) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die5 == 2 && o > 23) 
					{
						color = Color.BLACK;
						x = 710;
						y = 20 + 25*o;
					}
					if(die5 == 2 && o > 25) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die5 == 3 && o > 23) 
					{
						color = Color.BLACK;
						x = 210 + o*20;
						y = 630;
					}
					if(die5 == 3 && o > 26) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die5 == 4 && o > 23) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 695;
							y = 255 + o*15;
						}
						else 
						{
							x = 725;
							y = 240 + o*15;
						}
					}
					if(die5 == 4 && o > 27) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die5 == 5 && o > 23) 
					{
						color = Color.BLACK;
						if(o == 24 || o == 27) 
						{
							x = 695;
							y = 375 + o*10;
						}
						if(o == 25 || o == 28) 
						{
							x = 725;
							y = 365 + o*10;
						}
						if(o == 26) 
						{
							x = 710;
							y = 630;
						}
					}
					if(die5 == 5 && o > 28) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die5 == 6 && o > 23) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 695;
							 y = 370 + o*10;
						}
						 if(o%2 != 0) 
						 {
							 x = 725;
							 y = 360 + o*10;
						 }
					}	
					if(die5 == 6 && o > 29) 
					{
						color = Color.lightGray;
						x = 400;
					}
	            	
				dots[o] = new Circle(10, color, x, y);
				}	
	    
		repaint();
		
				
		}
		}
				);
		
		diceButton[15].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[5] = new Square(70, Color.white, 200, 300);
				d6 = false;
		            
	            for(o = 30; o < 36; o++) 
				{ 
	
	            	if(die6 == 1 && o == 30) 
					{ 
						 color = Color.BLACK;
						 x = 230;
						 y = 630 + 100*(o-30);
					}
					if(die6 == 1 && o > 30) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die6 == 2) 
					{
						color = Color.BLACK;
						x = 230;
						y = 620 + 25*(o-30);
					}
					if(die6 == 2 && o > 31) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die6 == 3 && o < 33) 
					{
						color = Color.BLACK;
						x = 210 + 20*(o-30);
						y = 630;
					}
					if(die6 == 3 && o > 32) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die6 == 4) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 215;
							y = 615 + 15*(o-30);
						}
						else 
						{
							x = 245;
							y = 600 + 15*(o-30);
						}
					}
					if(die6 == 4 && o > 33) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die6 == 5) 
					{
						color = Color.BLACK;
						if(o == 30 || o == 33) 
						{
							x = 215;
							y = 615 + 10*(o-30);
						}
						if(o == 31 || o == 34) 
						{
							x = 245;
							y = 605 + 10*(o-30);
						}
						if(o == 32) 
						{
							x = 230;
							y = 630;
						}
					}
					if(die6 == 5 && o > 34) 
					{
						x = 280;
						color = Color.lightGray;
					}
					
					if(die6 == 6) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 215;
							 y = 610 + 10*(o-30);
						}
						 if(o%2 != 0) 
						 {
							 x = 245;
							 y = 600 + 10*(o-30);
						 }
					}
					if(die6 == 6 && o > 35) 
					{
						y = 700;
						color = Color.lightGray;
						x = 400;
					}

				
				dots[o] = new Circle(10, color, x, y-300);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[16].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[6] = new Square(70, Color.white, 320, 300);
				d7 = false;
		            
	            for(o = 36; o < 42; o++) 
				{ 
	
	            	if(die7 == 1 && o > 35) 
					{ 
						 color = Color.BLACK;
						 x = 350;
						 y = 630;
					}
					if(die7 == 1 && o > 36) 
					{
						y = 700;
						color = Color.lightGray;
						x = 400;
					}
					if(die7 == 2 && o > 35) 
					{
						color = Color.BLACK;
						x = 350;
						y = 470 + 25*(o-30);
					}
					if(die7 == 2 && o > 37) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die7 == 3 && o > 35) 
					{
						color = Color.BLACK;
						x = 210 + 20*(o-30);
						y = 630;
					}
					if(die7 == 3 && o > 38) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die7 == 4 && o > 35) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 335;
							y = 525 + 15*(o-30);
						}
						else 
						{
							x = 365;
							y = 510 + 15*(o-30);
						}
					}
					if(die7 == 4 && o > 39) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die7 == 5 && o > 35) 
					{
						color = Color.BLACK;
						if(o == 36 || o == 39) 
						{
							x = 335;
							y = 555 + 10*(o-30);
						}
						if(o == 37 || o == 40) 
						{
							x = 365;
							y = 545 + 10*(o-30);
						}
						if(o == 38) 
						{
							x = 350;
							y = 630;
						}
					}
					if(die7 == 5 && o > 40) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die7 == 6 && o > 35) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 335;
							 y = 550 + 10*(o-30);
						}
						 if(o%2 != 0) 
						 {
							 x = 365;
							 y = 540 + 10*(o-30);
						 }
					}	
					if(die7 == 6 && o > 41) 
					{
						color = Color.lightGray;
						x = 400;
					} 
				
				dots[o] = new Circle(10, color, x, y-300);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[17].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[7] = new Square(70, Color.white, 440, 300);
				d8 = false;
		            
	            for(o = 42; o < 48; o++) 
				{ 
	
	            	if(die8 == 1 && o > 41) 
					{ 
						 color = Color.BLACK;
						 x = 470;
						 y = 630;
					}
					if(die8 == 1 && o > 42) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die8 == 2 && o > 41) 
					{
						color = Color.BLACK;
						x = 470;
						y = 320 + 25*(o-30);
					}
					if(die8 == 2 && o > 43) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die8 == 3 && o > 41) 
					{
						color = Color.BLACK;
						x = 210 + 20*(o-30);
						y = 630;
					}
					if(die8 == 3 && o > 44) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die8 == 4 && o > 41) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 455;
							y = 435 + 15*(o-30);
						}
						else 
						{
							x = 485;
							y = 420 + 15*(o-30);
						}
					}
					if(die8 == 4 && o > 45) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die8 == 5 && o > 41) 
					{
						color = Color.BLACK;
						if(o == 42 || o == 45) 
						{
							x = 455;
							y = 495 + 10*(o-30);
						}
						if(o == 43 || o == 46) 
						{
							x = 485;
							y = 485 + 10*(o-30);
						}
						if(o == 44) 
						{
							x = 470;
							y = 630;
						}
					}
					if(die8 == 5 && o > 46) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die8 == 6 && o > 41) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 455;
							 y = 490 + 10*(o-30);
						}
						 if(o%2 != 0) 
						 {
							 x = 485;
							 y = 480 + 10*(o-30);
						 }
					}		
					if(die8 == 6 && o > 47) 
					{
						x = 400;
						color = Color.lightGray;
					}
					
				
				dots[o] = new Circle(10, color, x, y-300);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[18].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[8] = new Square(70, Color.white, 560, 300);
				d9 = false;
		            
	            for(o = 48; o < 54; o++) 
				{ 
	
	            	if(die9 == 1 && o > 47) 
					{ 
						 color = Color.BLACK;
						 x = 590;
						 y = 630;
					}
					if(die9 == 1 && o > 48) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die9 == 2 && o > 47) 
					{
						color = Color.BLACK;
						x = 590;
						y = 170 + 25*(o-30);
					}
					if(die9 == 2 && o > 49) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die9 == 3 && o > 47) 
					{
						color = Color.BLACK;
						x = 210 + 20*(o-30);
						y = 630;
					}
					if(die9 == 3 && o > 50) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die9 == 4 && o > 47) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 575;
							y = 345 + 15*(o-30);
						}
						else 
						{
							x = 605;
							y = 330 + 15*(o-30);
						}
					}
					if(die9 == 4 && o > 51) 
					{
						color = Color.lightGray;
						x = 400;
						
					}
					if(die9 == 5 && o > 47) 
					{
						color = Color.BLACK;
						if(o == 48 || o == 51) 
						{
							x = 575;
							y = 435 + 10*(o-30);
						}
						if(o == 49 || o == 52) 
						{
							x = 605;
							y = 425 + 10*(o-30);
						}
						if(o == 50) 
						{
							x = 590;
							y = 630;
						}
					}
					if(die9 == 5 && o > 52) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die9 == 6 && o > 47) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 575;
							 y = 430 + 10*(o-30);
						}
						 if(o%2 != 0) 
						 {
							 x = 605;
							 y = 420 + 10*(o-30);
						 }
					}	
					if(die9 == 6 && o > 53) 
					{
						color = Color.lightGray;
						x = 400;
					} 

				
				dots[o] = new Circle(10, color, x, y-300);
				}	
	    
		repaint();
		
		}
		}
			);
		
		diceButton[19].addActionListener(new ActionListener()		
		{     	
		public void actionPerformed(ActionEvent e){  
	        
				dice[9] = new Square(70, Color.white, 680, 300);
				d10 = false;
		            
	            for(o = 54; o < 60; o++) 
				{ 
	
	            	if(die10 == 1 && o > 53) 
					{ 
						 color = Color.BLACK;
						 x = 710;
						 y = 630;
					}
					if(die10 == 1 && o > 54) 
					{
						y = 700; x = 400;
						color = Color.lightGray;
					}
					if(die10 == 2 && o > 53) 
					{
						color = Color.BLACK;
						x = 710;
						y = 20 + 25*(o-30);
					}
					if(die10 == 2 && o > 55) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die10 == 3 && o > 53) 
					{
						color = Color.BLACK;
						x = 210 + 20*(o-30);
						y = 630;
					}
					if(die10 == 3 && o > 56) 
					{
						x = 400;
						color = Color.lightGray;
					}
					if(die10 == 4 && o > 53) 
					{
						color = Color.BLACK;
						if(o%2 == 0) 
						{
							x = 695;
							y = 255 + 15*(o-30);
						}
						else 
						{
							x = 725;
							y = 240 + 15*(o-30);
						}
					}
					if(die10 == 4 && o > 57) 
					{
						color = Color.lightGray;
						x = 400;
					}
					if(die10 == 5 && o > 53) 
					{
						color = Color.BLACK;
						if(o == 54 || o == 57) 
						{
							x = 695;
							y = 375 + 10*(o-30);
						}
						if(o == 55 || o == 58) 
						{
							x = 725;
							y = 365 + 10*(o-30);
						}
						if(o == 56) 
						{
							x = 710;
							y = 630;
						}
					}
					if(die10 == 5 && o > 58) 
					{
						x = 280;
						color = Color.lightGray;
					}
					if(die10 == 6 && o > 53) 
					{
						color = Color.BLACK;
						 if(o%2 == 0) 
						 {
							 x = 695;
							 y = 370 + 10*(o-30);
						}
						 if(o%2 != 0) 
						 {
							 x = 725;
							 y = 360 + 10*(o-30);
						 }
					}	
					if(die10 == 6 && o > 59) 
					{
						color = Color.lightGray;
						x = 400;
					}
				
				dots[o] = new Circle(10, color, x, y-300);
				}	
	    
		repaint();
		
		}
		}
			);
		
		}
	}
	
	
	public void paintComponent(Graphics page) 
	{
		super.paintComponent(page);
		
		this.add(roll);
			
		for(int db = 0; db < diceButton.length; db++)
		{
			this.add(diceButton[db]);
			diceButton[db].setOpaque(false);
		}
		
		for(int s = 0; s < sq.length; s++)
		{
			sq[s].draw(page);
		}
		
		for(int d = 0; d < dice.length; d++)
		{
			dice[d].draw(page);
		}

		for(o = 0; o < dots.length; o++)
		{
			dots[o].draw(page);
		}
		
		for(int r = 0; r < outline.length; r++)
		{
			outline[r].draw(page);
		}
		
	}
	
}

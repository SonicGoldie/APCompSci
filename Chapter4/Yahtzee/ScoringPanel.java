package Yahtzee;

import javax.swing.JPanel;
import java.awt.*;

public class ScoringPanel extends JPanel
{
	Scoring score = new Scoring();
	SmallStraightCheck test;
	private Square[] Row1, Row2, Row3;
	private Square Outline, Outline1;
	public ScoringPanel(int D1, int D2, int D3, int D4, int D5)
	{
		setPreferredSize(new Dimension(450, 1000));
		setBackground(Color.cyan);
		Row1 = new Square[18];
		for(int s = 0; s < Row1.length; s++)
		{
			
		}
		
		score.Ones(D1, D2, D3, D4, D5);
		score.Twos(D1, D2, D3, D4, D5);
		score.Threes(D1, D2, D3, D4, D5);
		score.Fours(D1, D2, D3, D4, D5);
		score.Fives(D1, D2, D3, D4, D5);
		score.Sixes(D1, D2, D3, D4, D5);
		score.ThreeOAK(D1, D2, D3, D4, D5);
		score.FourOAK(D1, D2, D3, D4, D5);
		score.FullHouse(D1, D2, D3, D4, D5);
		score.SS(D1, D2, D3, D4, D5);
		score.LS(D1, D2, D3, D4, D5);
		score.Yahtzee(D1, D2, D3, D4, D5);
		score.Chance(D1, D2, D3, D4, D5);
		
		System.out.println("" + D1 + "" + D2 + "" + D3 + "" + D4 + "" + D5 + "");
				
	}
	
}

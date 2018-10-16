package Yahtzee;

import javax.swing.JPanel;

public class ScoringPanel extends JPanel
{
	Scoring score = new Scoring();
	SmallStraightCheck test;
	public ScoringPanel(int D1, int D2, int D3, int D4, int D5)
	{
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
		System.out.println("Ones: " + score.scoreOnes);
		System.out.println("Twos: " +score.scoreTwos);
		System.out.println("Threes: " +score.scoreThrees);
		System.out.println("Fours: " + score.scoreFours);
		System.out.println("Fives: " + score.scoreFives);
		System.out.println("Sixes: " + score.scoreSixes);
		System.out.println("Three of a Kind: " + score.scoreThreeOAK);
		System.out.println("Four of a Kind: " + score.scoreFourOAK);
		System.out.println("Full House: " + score.scoreFH);
		System.out.println("Small Straight: " + score.scoreSS);
		System.out.println("Large Straight: " + score.scoreLS);
		System.out.println("Chance: " + score.scoreChance);
		System.out.println("Yahtzee: " + score.scoreYahtzee);
	}
}

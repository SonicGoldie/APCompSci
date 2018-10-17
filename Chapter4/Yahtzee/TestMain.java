package Yahtzee;

import java.util.Random;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TestMain {
	Random rand = new Random();

	public static void main(String[] args) 
	{
			
		
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);
		
		
		playPanel playPanel = new playPanel();
		ScoringPanel Panel = new ScoringPanel(playPanel.die6, playPanel.die7, playPanel.die8, playPanel.die9, playPanel.die10);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3,0,0));
		panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		panel.setBackground(Color.cyan);
				
		
		JPanel Blank = new JPanel();
		Blank.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Blank.add(new JLabel(""));
		Blank.setBackground(Color.cyan);
		panel.add(Blank);
		
		JPanel You = new JPanel();
		You.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		You.add(new JLabel("You"));
		You.setBackground(Color.cyan);
		panel.add(You);
		
		JPanel Player2 = new JPanel();
		Player2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Player2.add(new JLabel("Player2"));
		Player2.setBackground(Color.cyan);
		panel.add(Player2);
		
		JPanel Ones = new JPanel();
		Ones.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Ones.add(new JLabel("Ones"));
		Ones.setBackground(Color.cyan);
		panel.add(Ones);
		
		JPanel OneScoreYou = new JPanel();
		OneScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreYou.add(new JLabel("" + Panel.score.scoreOnes));
		OneScoreYou.setBackground(Color.cyan);
		panel.add(OneScoreYou);
		
		JPanel OneScoreP2 = new JPanel();
		OneScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreP2.add(new JLabel("" + Panel.score.scoreOnes));
		OneScoreP2.setBackground(Color.cyan);
		panel.add(OneScoreP2);
		
		JPanel Twos = new JPanel();
		Twos.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Twos.add(new JLabel("Twos"));
		Twos.setBackground(Color.cyan);
		panel.add(Twos);
		
		JPanel TwoScoreYou = new JPanel();
		TwoScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreYou.add(new JLabel("" + Panel.score.scoreTwos));
		TwoScoreYou.setBackground(Color.cyan);
		panel.add(TwoScoreYou);
		
		JPanel TwoScoreP2 = new JPanel();
		TwoScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreP2.add(new JLabel("" + Panel.score.scoreTwos));
		TwoScoreP2.setBackground(Color.cyan);
		panel.add(TwoScoreP2);
		
		JPanel Threes = new JPanel();
		Threes.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Threes.add(new JLabel("Threes"));
		Threes.setBackground(Color.cyan);
		panel.add(Threes);
		
		JPanel ThreeScoreYou = new JPanel();
		ThreeScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreYou.add(new JLabel("" + Panel.score.scoreThrees));
		ThreeScoreYou.setBackground(Color.cyan);
		panel.add(ThreeScoreYou);
		
		JPanel ThreeScoreP2 = new JPanel();
		ThreeScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreP2.add(new JLabel("" + Panel.score.scoreThrees));
		ThreeScoreP2.setBackground(Color.cyan);
		panel.add(ThreeScoreP2);
		
		JPanel Fours = new JPanel();
		Fours.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Fours.add(new JLabel("Fours"));
		Fours.setBackground(Color.cyan);
		panel.add(Fours);
		
		JPanel FourScoreYou = new JPanel();
		FourScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourScoreYou.add(new JLabel("" + Panel.score.scoreFours));
		FourScoreYou.setBackground(Color.cyan);
		panel.add(FourScoreYou);
		
		JPanel FourScoreP2 = new JPanel();
		FourScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourScoreP2.add(new JLabel("" + Panel.score.scoreFours));
		FourScoreP2.setBackground(Color.cyan);
		panel.add(FourScoreP2);
		
		JPanel Fives = new JPanel();
		Fives.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Fives.add(new JLabel("Fives"));
		Fives.setBackground(Color.cyan);
		panel.add(Fives);
		
		JPanel FiveScoreYou = new JPanel();
		FiveScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FiveScoreYou.add(new JLabel("" + Panel.score.scoreFives));
		FiveScoreYou.setBackground(Color.cyan);
		panel.add(FiveScoreYou);
		
		JPanel FiveScoreP2 = new JPanel();
		FiveScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FiveScoreP2.add(new JLabel("" + Panel.score.scoreFives));
		FiveScoreP2.setBackground(Color.cyan);
		panel.add(FiveScoreP2);
		
		JPanel Sixs = new JPanel();
		Sixs.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Sixs.add(new JLabel("Sixes"));
		Sixs.setBackground(Color.cyan);
		panel.add(Sixs);
		
		JPanel SixScoreYou = new JPanel();
		SixScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SixScoreYou.add(new JLabel("" + Panel.score.scoreSixes));
		SixScoreYou.setBackground(Color.cyan);
		panel.add(SixScoreYou);
		
		JPanel SixScoreP2 = new JPanel();
		SixScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SixScoreP2.add(new JLabel("" + Panel.score.scoreSixes));
		SixScoreP2.setBackground(Color.cyan);
		panel.add(SixScoreP2);
		
		JPanel Sum = new JPanel();
		Sum.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Sum.add(new JLabel("Sum"));
		Sum.setBackground(Color.blue);
		panel.add(Sum);
		
		JPanel SumYou = new JPanel();
		SumYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumYou.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumYou.setBackground(Color.blue);
		panel.add(SumYou);
		
		JPanel SumP2 = new JPanel();
		SumP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumP2.setBackground(Color.blue);
		panel.add(SumP2);
		
		
		JPanel ThreeOAK = new JPanel();
		ThreeOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAK.add(new JLabel("Three Of A Kind"));
		ThreeOAK.setBackground(Color.cyan);
		panel.add(ThreeOAK);
		
		JPanel ThreeOAKcoreYou = new JPanel();
		ThreeOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreYou.add(new JLabel("" + Panel.score.scoreThreeOAK));
		ThreeOAKcoreYou.setBackground(Color.cyan);
		panel.add(ThreeOAKcoreYou);
		
		JPanel ThreeOAKcoreP2 = new JPanel();
		ThreeOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreP2.add(new JLabel("" + Panel.score.scoreThreeOAK));
		ThreeOAKcoreP2.setBackground(Color.cyan);
		panel.add(ThreeOAKcoreP2);
		
		JPanel FourOAK = new JPanel();
		FourOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAK.add(new JLabel("Four Of A Kind"));
		FourOAK.setBackground(Color.cyan);
		panel.add(FourOAK);
		
		JPanel FourOAKcoreYou = new JPanel();
		FourOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAKcoreYou.add(new JLabel("" + Panel.score.scoreFourOAK));
		FourOAKcoreYou.setBackground(Color.cyan);
		panel.add(FourOAKcoreYou);
		
		JPanel FourOAKcoreP2 = new JPanel();
		FourOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAKcoreP2.add(new JLabel("" + Panel.score.scoreFourOAK));
		FourOAKcoreP2.setBackground(Color.cyan);
		panel.add(FourOAKcoreP2);
		
		JPanel FullHouse = new JPanel();
		FullHouse.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHouse.add(new JLabel("FullHouse"));
		FullHouse.setBackground(Color.cyan);
		panel.add(FullHouse);
		
		JPanel FullHousecoreYou = new JPanel();
		FullHousecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHousecoreYou.add(new JLabel("" + Panel.score.scoreFH));
		FullHousecoreYou.setBackground(Color.cyan);
		panel.add(FullHousecoreYou);
		
		JPanel FullHousecoreP2 = new JPanel();
		FullHousecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHousecoreP2.add(new JLabel("" + Panel.score.scoreFH));
		FullHousecoreP2.setBackground(Color.cyan);
		panel.add(FullHousecoreP2);
		
		JPanel SS = new JPanel();
		SS.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SS.add(new JLabel("Small Straight"));
		SS.setBackground(Color.cyan);
		panel.add(SS);
		
		JPanel SScoreYou = new JPanel();
		SScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SScoreYou.add(new JLabel("" + Panel.score.scoreSS));
		SScoreYou.setBackground(Color.cyan);
		panel.add(SScoreYou);
		
		JPanel SScoreP2 = new JPanel();
		SScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SScoreP2.add(new JLabel("" + Panel.score.scoreSS));
		SScoreP2.setBackground(Color.cyan);
		panel.add(SScoreP2);
		
		JPanel LS = new JPanel();
		LS.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LS.add(new JLabel("Large Straight"));
		LS.setBackground(Color.cyan);
		panel.add(LS);
		
		JPanel LScoreYou = new JPanel();
		LScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LScoreYou.add(new JLabel("" + Panel.score.scoreLS));
		LScoreYou.setBackground(Color.cyan);
		panel.add(LScoreYou);
		
		JPanel LScoreP2 = new JPanel();
		LScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LScoreP2.add(new JLabel("" + Panel.score.scoreLS));
		LScoreP2.setBackground(Color.cyan);
		panel.add(LScoreP2);
		
		JPanel Chance = new JPanel();
		Chance.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Chance.add(new JLabel("Chance"));
		Chance.setBackground(Color.cyan);
		panel.add(Chance);
		
		JPanel ChancecoreYou = new JPanel();
		ChancecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ChancecoreYou.add(new JLabel("" + Panel.score.scoreChance));
		ChancecoreYou.setBackground(Color.cyan);
		panel.add(ChancecoreYou);
		
		JPanel ChancecoreP2 = new JPanel();
		ChancecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ChancecoreP2.add(new JLabel("" + Panel.score.scoreChance));
		ChancecoreP2.setBackground(Color.cyan);
		panel.add(ChancecoreP2);
		
		JPanel Yahtzee = new JPanel();
		Yahtzee.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Yahtzee.add(new JLabel("Yahtzee"));
		Yahtzee.setBackground(Color.cyan);
		panel.add(Yahtzee);
		
		JPanel YahtzeecoreYou = new JPanel();
		YahtzeecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		YahtzeecoreYou.add(new JLabel("" + Panel.score.scoreYahtzee));
		YahtzeecoreYou.setBackground(Color.cyan);
		panel.add(YahtzeecoreYou);
		
		JPanel YahtzeecoreP2 = new JPanel();
		YahtzeecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		YahtzeecoreP2.add(new JLabel("" + Panel.score.scoreYahtzee));
		YahtzeecoreP2.setBackground(Color.cyan);
		panel.add(YahtzeecoreP2);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.white);
		primary.add(playPanel);
		primary.add(panel);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}

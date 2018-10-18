package Yahtzee;

import java.util.Random;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TestMain {
	Random rand = new Random();
	static JLabel[] Labels;
	static JPanel[] Panels;
	static ScoringPanel SPanel;
	
	
	public static void SetValues()
	{
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);
		
		/*SPanel = new ScoringPanel(1,2,2,3,4);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3,0,0));
		panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(450, 1000));
			
		Labels = new JLabel[54];
		Panels = new JPanel[54];
		for(int l = 0; l < Labels.length; l++)
		{
			Labels[l] = new JLabel();	
			
		}
		for(int p = 0; p < Panels.length; p++)
		{
			Panels[p] = new JPanel();
			Panels[p].setBorder(BorderFactory.createLineBorder(Color.white, 2));
			Panels[p].setBackground(Color.cyan);
			Panels[p].add(Labels[p]);
			panel.add(Panels[p]);
			
		}
		
		
		
		Labels[1].setText("Player 1");
		Labels[2].setText("Player 2");
		Labels[3].setText("Ones");
		Labels[4].setText("" + SPanel.score.scoreOnes);
		Labels[5].setText("" + SPanel.score.scoreOnes);
		Labels[6].setText("Twos");
		Labels[7].setText("" + SPanel.score.scoreTwos);
		Labels[8].setText("" + SPanel.score.scoreTwos);
		Labels[9].setText("Threes");
		Labels[10].setText("" + SPanel.score.scoreThrees);
		Labels[11].setText("" + SPanel.score.scoreThrees);
		Labels[12].setText("Fours");
		Labels[13].setText("" + SPanel.score.scoreFours);
		Labels[14].setText(""  + SPanel.score.scoreFours);
		Labels[15].setText("Fives");
		Labels[16].setText(""  + SPanel.score.scoreFives);
		Labels[17].setText(""  + SPanel.score.scoreFives);
		Labels[18].setText("Sixes");
		Labels[19].setText(""  + SPanel.score.scoreSixes);
		Labels[20].setText(""  + SPanel.score.scoreSixes);
		Panels[21].setBackground(Color.blue);
		Labels[21].setText("Sum");
		Panels[22].setBackground(Color.blue);
		Labels[22].setText("" + SPanel.score.scoreSum);
		Panels[23].setBackground(Color.blue);
		Labels[23].setText("" + SPanel.score.scoreSum);
		Panels[24].setBackground(Color.blue);
		Labels[24].setText("Bonus");
		Panels[25].setBackground(Color.blue);
		Labels[25].setText("" + SPanel.score.scoreBonus);
		Panels[26].setBackground(Color.blue);
		Labels[26].setText("" + SPanel.score.scoreBonus);
		Labels[27].setText("Three Of A Kind");
		Labels[28].setText("" + SPanel.score.scoreThreeOAK);
		Labels[29].setText("" + SPanel.score.scoreThreeOAK);
		Labels[30].setText("Four Of A Kind");
		Labels[31].setText("" + SPanel.score.scoreFourOAK);
		Labels[32].setText("" + SPanel.score.scoreFourOAK);
		Labels[33].setText("Full House");
		Labels[34].setText("" + SPanel.score.scoreFH);
		Labels[35].setText("" + SPanel.score.scoreFH);
		Labels[36].setText("Small Straight");
		Labels[37].setText("" + SPanel.score.scoreSS);
		Labels[38].setText("" + SPanel.score.scoreSS);
		Labels[39].setText("Large Straight");
		Labels[40].setText("" + SPanel.score.scoreLS);
		Labels[41].setText("" + SPanel.score.scoreLS);
		Labels[42].setText("Chance");
		Labels[43].setText("" + SPanel.score.scoreChance);
		Labels[44].setText("" + SPanel.score.scoreChance);
		Labels[45].setText("Yahtzee");
		Labels[46].setText("" + SPanel.score.scoreYahtzee);
		Labels[47].setText("" + SPanel.score.scoreYahtzee);
		Panels[48].setBackground(Color.blue);
		Labels[48].setText("Bonus");
		Panels[49].setBackground(Color.blue);
		Labels[49].setText("" + 0);
		Panels[50].setBackground(Color.blue);
		Labels[50].setText("" + 0);
		Panels[51].setBackground(Color.blue);
		Labels[51].setText("Total Score");
		Panels[52].setBackground(Color.blue);
		Labels[52].setText("" + SPanel.score.scoreTotal);
		Panels[53].setBackground(Color.blue);
		Labels[53].setText("" + + SPanel.score.scoreTotal);*/









		
		
		
		
		
		
		playPanel playPanel = new playPanel();
		/*ScoringPanel Panel1 = new ScoringPanel(playPanel.die1, playPanel.die2, playPanel.die3, playPanel.die4, playPanel.die5);
		ScoringPanel Panel2 = new ScoringPanel(playPanel.die6, playPanel.die7, playPanel.die8, playPanel.die9, playPanel.die10);
		int OneScore = Panel1.score.scoreOnes;
		JLabel test = new JLabel("" + OneScore);
		
		
				
		
		Panels[0].setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Blank.setBackground(Color.cyan);
		Blank.add(new JLabel(""));
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
		OneScoreYou.add(test);
		test.setText("" + 7);
		OneScoreYou.setBackground(Color.cyan);
		panel.add(OneScoreYou);
		
		JPanel OneScoreP2 = new JPanel();
		OneScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreP2.add(new JLabel("" + Panel2.score.scoreOnes));
		OneScoreP2.setBackground(Color.cyan);
		panel.add(OneScoreP2);
		
		JPanel Twos = new JPanel();
		Twos.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Twos.add(new JLabel("Twos"));
		Twos.setBackground(Color.cyan);
		panel.add(Twos);
		
		JPanel TwoScoreYou = new JPanel();
		TwoScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreYou.add(new JLabel("" + Panel1.score.scoreTwos));
		TwoScoreYou.setBackground(Color.cyan);
		panel.add(TwoScoreYou);
		
		JPanel TwoScoreP2 = new JPanel();
		TwoScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreP2.add(new JLabel("" + Panel2.score.scoreTwos));
		TwoScoreP2.setBackground(Color.cyan);
		panel.add(TwoScoreP2);
		
		JPanel Threes = new JPanel();
		Threes.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Threes.add(new JLabel("Threes"));
		Threes.setBackground(Color.cyan);
		panel.add(Threes);
		
		JPanel ThreeScoreYou = new JPanel();
		ThreeScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreYou.add(new JLabel("" + Panel1.score.scoreThrees));
		ThreeScoreYou.setBackground(Color.cyan);
		panel.add(ThreeScoreYou);
		
		JPanel ThreeScoreP2 = new JPanel();
		ThreeScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreP2.add(new JLabel("" + Panel2.score.scoreThrees));
		ThreeScoreP2.setBackground(Color.cyan);
		panel.add(ThreeScoreP2);
		
		JPanel Fours = new JPanel();
		Fours.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Fours.add(new JLabel("Fours"));
		Fours.setBackground(Color.cyan);
		panel.add(Fours);
		
		JPanel FourScoreYou = new JPanel();
		FourScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourScoreYou.add(new JLabel("" + Panel1.score.scoreFours));
		FourScoreYou.setBackground(Color.cyan);
		panel.add(FourScoreYou);
		
		JPanel FourScoreP2 = new JPanel();
		FourScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourScoreP2.add(new JLabel("" + Panel2.score.scoreFours));
		FourScoreP2.setBackground(Color.cyan);
		panel.add(FourScoreP2);
		
		JPanel Fives = new JPanel();
		Fives.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Fives.add(new JLabel("Fives"));
		Fives.setBackground(Color.cyan);
		panel.add(Fives);
		
		JPanel FiveScoreYou = new JPanel();
		FiveScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FiveScoreYou.add(new JLabel("" + Panel1.score.scoreFives));
		FiveScoreYou.setBackground(Color.cyan);
		panel.add(FiveScoreYou);
		
		JPanel FiveScoreP2 = new JPanel();
		FiveScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FiveScoreP2.add(new JLabel("" + Panel2.score.scoreFives));
		FiveScoreP2.setBackground(Color.cyan);
		panel.add(FiveScoreP2);
		
		JPanel Sixs = new JPanel();
		Sixs.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Sixs.add(new JLabel("Sixes"));
		Sixs.setBackground(Color.cyan);
		panel.add(Sixs);
		
		JPanel SixScoreYou = new JPanel();
		SixScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SixScoreYou.add(new JLabel("" + Panel1.score.scoreSixes));
		SixScoreYou.setBackground(Color.cyan);
		panel.add(SixScoreYou);
		
		JPanel SixScoreP2 = new JPanel();
		SixScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SixScoreP2.add(new JLabel("" + Panel2.score.scoreSixes));
		SixScoreP2.setBackground(Color.cyan);
		panel.add(SixScoreP2);
		
		JPanel Sum = new JPanel();
		Sum.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Sum.add(new JLabel("Sum"));
		Sum.setBackground(Color.blue);
		panel.add(Sum);
		
		JPanel SumYou = new JPanel();
		SumYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumYou.add(new JLabel("" + Panel1.score.scoreOnes + Panel1.score.scoreTwos + Panel1.score.scoreThrees + Panel1.score.scoreFours + Panel1.score.scoreFives + Panel1.score.scoreSixes));
		SumYou.setBackground(Color.blue);
		panel.add(SumYou);
		
		JPanel SumP2 = new JPanel();
		SumP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumP2.add(new JLabel("" + Panel2.score.scoreOnes + Panel2.score.scoreTwos + Panel2.score.scoreThrees + Panel2.score.scoreFours + Panel2.score.scoreFives + Panel2.score.scoreSixes));
		SumP2.setBackground(Color.blue);
		panel.add(SumP2);
		
		
		JPanel ThreeOAK = new JPanel();
		ThreeOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAK.add(new JLabel("Three Of A Kind"));
		ThreeOAK.setBackground(Color.cyan);
		panel.add(ThreeOAK);
		
		JPanel ThreeOAKcoreYou = new JPanel();
		ThreeOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreYou.add(new JLabel("" + Panel1.score.scoreThreeOAK));
		ThreeOAKcoreYou.setBackground(Color.cyan);
		panel.add(ThreeOAKcoreYou);
		
		JPanel ThreeOAKcoreP2 = new JPanel();
		ThreeOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreP2.add(new JLabel("" + Panel2.score.scoreThreeOAK));
		ThreeOAKcoreP2.setBackground(Color.cyan);
		panel.add(ThreeOAKcoreP2);
		
		JPanel FourOAK = new JPanel();
		FourOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAK.add(new JLabel("Four Of A Kind"));
		FourOAK.setBackground(Color.cyan);
		panel.add(FourOAK);
		
		JPanel FourOAKcoreYou = new JPanel();
		FourOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAKcoreYou.add(new JLabel("" + Panel1.score.scoreFourOAK));
		FourOAKcoreYou.setBackground(Color.cyan);
		panel.add(FourOAKcoreYou);
		
		JPanel FourOAKcoreP2 = new JPanel();
		FourOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAKcoreP2.add(new JLabel("" + Panel2.score.scoreFourOAK));
		FourOAKcoreP2.setBackground(Color.cyan);
		panel.add(FourOAKcoreP2);
		
		JPanel FullHouse = new JPanel();
		FullHouse.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHouse.add(new JLabel("FullHouse"));
		FullHouse.setBackground(Color.cyan);
		panel.add(FullHouse);
		
		JPanel FullHousecoreYou = new JPanel();
		FullHousecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHousecoreYou.add(new JLabel("" + Panel1.score.scoreFH));
		FullHousecoreYou.setBackground(Color.cyan);
		panel.add(FullHousecoreYou);
		
		JPanel FullHousecoreP2 = new JPanel();
		FullHousecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHousecoreP2.add(new JLabel("" + Panel2.score.scoreFH));
		FullHousecoreP2.setBackground(Color.cyan);
		panel.add(FullHousecoreP2);
		
		JPanel SS = new JPanel();
		SS.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SS.add(new JLabel("Small Straight"));
		SS.setBackground(Color.cyan);
		panel.add(SS);
		
		JPanel SScoreYou = new JPanel();
		SScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SScoreYou.add(new JLabel("" + Panel1.score.scoreSS));
		SScoreYou.setBackground(Color.cyan);
		panel.add(SScoreYou);
		
		JPanel SScoreP2 = new JPanel();
		SScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SScoreP2.add(new JLabel("" + Panel2.score.scoreSS));
		SScoreP2.setBackground(Color.cyan);
		panel.add(SScoreP2);
		
		JPanel LS = new JPanel();
		LS.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LS.add(new JLabel("Large Straight"));
		LS.setBackground(Color.cyan);
		panel.add(LS);
		
		JPanel LScoreYou = new JPanel();
		LScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LScoreYou.add(new JLabel("" + Panel1.score.scoreLS));
		LScoreYou.setBackground(Color.cyan);
		panel.add(LScoreYou);
		
		JPanel LScoreP2 = new JPanel();
		LScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LScoreP2.add(new JLabel("" + Panel2.score.scoreLS));
		LScoreP2.setBackground(Color.cyan);
		panel.add(LScoreP2);
		
		JPanel Chance = new JPanel();
		Chance.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Chance.add(new JLabel("Chance"));
		Chance.setBackground(Color.cyan);
		panel.add(Chance);
		
		JPanel ChancecoreYou = new JPanel();
		ChancecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ChancecoreYou.add(new JLabel("" + Panel1.score.scoreChance));
		ChancecoreYou.setBackground(Color.cyan);
		panel.add(ChancecoreYou);
		
		JPanel ChancecoreP2 = new JPanel();
		ChancecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ChancecoreP2.add(new JLabel("" + Panel2.score.scoreChance));
		ChancecoreP2.setBackground(Color.cyan);
		panel.add(ChancecoreP2);
		
		JPanel Yahtzee = new JPanel();
		Yahtzee.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Yahtzee.add(new JLabel("Yahtzee"));
		Yahtzee.setBackground(Color.cyan);
		panel.add(Yahtzee);
		
		JPanel YahtzeecoreYou = new JPanel();
		YahtzeecoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		YahtzeecoreYou.add(new JLabel("" + Panel1.score.scoreYahtzee));
		YahtzeecoreYou.setBackground(Color.cyan);
		panel.add(YahtzeecoreYou);
		
		JPanel YahtzeecoreP2 = new JPanel();
		YahtzeecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		YahtzeecoreP2.add(new JLabel("" + Panel2.score.scoreYahtzee));
		YahtzeecoreP2.setBackground(Color.cyan);
		panel.add(YahtzeecoreP2);*/
		
		JPanel primary = new JPanel();
		SlataSolution panel = new SlataSolution();
		primary.setBackground(Color.white);
		primary.add(playPanel);
		primary.add(panel);
		
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}

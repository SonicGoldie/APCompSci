package Yahtzee;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlataSolution extends JPanel
{
	static JLabel[] Labels;
	static JPanel[] Panels;
	static ScoringPanel SPanel;
	
	public SlataSolution() 
	{
		SPanel = new ScoringPanel(1,2,2,3,4);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3,0,0));
		panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		panel.setBackground(Color.cyan);
		//panel.setPreferredSize(new Dimension(450, 1000));
		//panel.setLocation(1000, 0);
		//this.setLayout(new GridLayout(0,3,0,0));
		
		Labels = new JLabel[54];
		Panels = new JPanel[54];
		for(int l = 0; l < Labels.length; l++)
		{
			Labels[l] = new JLabel();	
			
		}
		int x = 1000;
		int y = 0;
		for(int p = 0; p < Panels.length; p++)
		{
			Panels[p] = new JPanel();
			Panels[p].setBorder(BorderFactory.createLineBorder(Color.white, 2));
			Panels[p].setBackground(Color.cyan);
			Panels[p].add(Labels[p]);
			Panels[p].setLocation(x, y);
			panel.add(Panels[p]);
			
		}
		
		
		
		Labels[1].setText("Player 1");
		Labels[2].setText("Player 2");
		Labels[3].setText("Ones");
		
		Labels[6].setText("Twos");
		
		Labels[9].setText("Threes");
		
		Labels[12].setText("Fours");
		
		Labels[15].setText("Fives");

		Labels[18].setText("Sixes");
		
		Panels[21].setBackground(Color.blue);
		Labels[21].setText("Sum");
		Panels[22].setBackground(Color.blue);
		
		Panels[23].setBackground(Color.blue);
		
		Panels[24].setBackground(Color.blue);
		Labels[24].setText("Bonus");
		Panels[25].setBackground(Color.blue);
		
		Panels[26].setBackground(Color.blue);
		
		Labels[27].setText("Three Of A Kind");
		
		Labels[30].setText("Four Of A Kind");
		
		Labels[33].setText("Full House");
		
		Labels[36].setText("Small Straight");
		
		Labels[39].setText("Large Straight");
		
		Labels[42].setText("Chance");
		
		Labels[45].setText("Yahtzee");
		
		Panels[48].setBackground(Color.blue);
		Labels[48].setText("Bonus");
		Panels[49].setBackground(Color.blue);
		Labels[49].setText("" + 0);
		Panels[50].setBackground(Color.blue);
		Labels[50].setText("" + 0);
		Panels[51].setBackground(Color.blue);
		Labels[51].setText("Total Score");
		Panels[52].setBackground(Color.blue);
		
		Panels[53].setBackground(Color.blue);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Labels[4].setText("" + SPanel.score.scoreOnes);
		Labels[5].setText("" + SPanel.score.scoreOnes);
		Labels[7].setText("" + SPanel.score.scoreTwos);
		Labels[8].setText("" + SPanel.score.scoreTwos);
		Labels[10].setText("" + SPanel.score.scoreThrees);
		Labels[11].setText("" + SPanel.score.scoreThrees);
		Labels[13].setText("" + SPanel.score.scoreFours);
		Labels[14].setText(""  + SPanel.score.scoreFours);
		Labels[16].setText(""  + SPanel.score.scoreFives);
		Labels[17].setText(""  + SPanel.score.scoreFives);
		Labels[19].setText(""  + SPanel.score.scoreSixes);
		Labels[20].setText(""  + SPanel.score.scoreSixes);
		Labels[22].setText("" + SPanel.score.scoreSum);
		Labels[23].setText("" + SPanel.score.scoreSum);
		Labels[25].setText("" + SPanel.score.scoreBonus);
		Labels[26].setText("" + SPanel.score.scoreBonus);
		Labels[28].setText("" + SPanel.score.scoreThreeOAK);
		Labels[29].setText("" + SPanel.score.scoreThreeOAK);
		Labels[31].setText("" + SPanel.score.scoreFourOAK);
		Labels[32].setText("" + SPanel.score.scoreFourOAK);
		Labels[34].setText("" + SPanel.score.scoreFH);
		Labels[35].setText("" + SPanel.score.scoreFH);
		Labels[37].setText("" + SPanel.score.scoreSS);
		Labels[38].setText("" + SPanel.score.scoreSS);
		Labels[40].setText("" + SPanel.score.scoreLS);
		Labels[41].setText("" + SPanel.score.scoreLS);
		Labels[43].setText("" + SPanel.score.scoreChance);
		Labels[44].setText("" + SPanel.score.scoreChance);
		Labels[46].setText("" + SPanel.score.scoreYahtzee);
		Labels[47].setText("" + SPanel.score.scoreYahtzee);
		Labels[52].setText("" + SPanel.score.scoreTotal);
		Labels[53].setText("" + + SPanel.score.scoreTotal);
	
		for(int p = 0; p < Panels.length; p++)
		{
			this.add(Panels[p]);
		}
		
		
	}

}

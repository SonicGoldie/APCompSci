package Yahtzee;

import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.border.*;




public class TestMain {
	Random rand = new Random();
	//Labels for scores
	public static JLabel p1oneslabel = new JLabel();
	public static JLabel p1twoslabel = new JLabel();
	public static JLabel p1threeslabel = new JLabel();
	public static JLabel p1fourslabel = new JLabel();
	public static JLabel p1fiveslabel = new JLabel();
	public static JLabel p1sixeslabel = new JLabel();
    public static JLabel p1sumsLabel = new JLabel();
    public static JLabel p1threeOAKLabel = new JLabel();
    public static JLabel p1fourOAKLabel = new JLabel();
	public static JLabel p1fullhouseLabel = new JLabel();
	public static JLabel p1ssLabel = new JLabel();
	public static JLabel p1lsLabel = new JLabel();
	public static JLabel p1yahtzeeLabel= new JLabel();
	public static JLabel p1chanceLabel = new JLabel();
	
	public static JLabel p2oneslabel = new JLabel();
	public static JLabel p2onesLabel = new JLabel();
	public static JLabel p2twoslabel = new JLabel();
	public static JLabel p2threeslabel = new JLabel();
	public static JLabel p2fourslabel = new JLabel();
	public static JLabel p2fiveslabel = new JLabel();
	public static JLabel p2sixeslabel = new JLabel();
    public static JLabel p2sumsLabel = new JLabel();
    public static JLabel p2threeOAKLabel = new JLabel();
    public static JLabel p2fourOAKLabel = new JLabel();
	public static JLabel p2fullhouseLabel = new JLabel();
	public static JLabel p2ssLabel = new JLabel();
	public static JLabel p2lsLabel = new JLabel();
	public static JLabel p2yahtzeeLabel= new JLabel();
	public static JLabel p2chanceLabel = new JLabel();
	

	public static void main(String[] args) 
	{
			
		//declariations
		Scoring score;
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);
		Font labelfont;
		
		
		playPanel playPanel = new playPanel();
		ScoringPanel Panel = new ScoringPanel(playPanel.die6, playPanel.die7, playPanel.die8, playPanel.die9, playPanel.die10);
		//public static ScoringPanel Panel = new ScoringPanel(playPanel.die6, playPanel.die7, playPanel.die8, playPanel.die9, playPanel.die10);
		//ScoringPanel Panel = new ScoringPanel(playPanel.die6, playPanel.die7, playPanel.die8, playPanel.die9, playPanel.die10);
		//public score = new Scoring();
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(450,1000));
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
		OneScoreYou.add(p1oneslabel);
		p1oneslabel.putClientProperty("myName",1);
		OneScoreYou.setBackground(Color.cyan);
		panel.add(OneScoreYou);

		// attach mouse click listener to the jlabels
		Component mouseClick = new MyComponent()  ;
		p1oneslabel.addMouseListener((MouseListener) mouseClick);
		// Set the font to be non-bold
		labelfont = p1oneslabel.getFont();
// This label initially is notset
		p1oneslabel.putClientProperty("scoreNotSet",true);
// Set the font to non-bold
		p1oneslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));
		
		JPanel OneScoreP2 = new JPanel();
		OneScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreP2.add(p2onesLabel);
		//OneScoreP2.add(new JLabel("" + Panel.score.scoreOnes));
		OneScoreP2.setBackground(Color.cyan);
		panel.add(OneScoreP2);
		
		JPanel Twos = new JPanel();
		Twos.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Twos.add(new JLabel("Twos"));
		Twos.setBackground(Color.cyan);
		panel.add(Twos);
		
		JPanel TwoScoreYou = new JPanel();
		TwoScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreYou.add(p1twoslabel);
		p1twoslabel.putClientProperty("myName",2);
		labelfont = p1oneslabel.getFont();
		p1twoslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));
		
		//TwoScoreYou.add(new JLabel("" + Panel.score.scoreTwos));
		TwoScoreYou.setBackground(Color.cyan);
		panel.add(TwoScoreYou);
		p1twoslabel.addMouseListener((MouseListener) mouseClick);
		
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
		ThreeScoreYou.add(p1threeslabel);
		//ThreeScoreYou.add(new JLabel("" + Panel.score.scoreThrees));
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
		FourScoreYou.add(p1fourslabel);
		//FourScoreYou.add(new JLabel("" + Panel.score.scoreFours));
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
		FiveScoreYou.add(p1fiveslabel);
		//FiveScoreYou.add(new JLabel("" + Panel.score.scoreFives));
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
		SixScoreYou.add(p1sixeslabel);
		//SixScoreYou.add(new JLabel("" + Panel.score.scoreSixes));
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
		Sum.setBackground(Color.green);
		panel.add(Sum);
		
		JPanel SumYou = new JPanel();
		SumYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumYou.add(p1sumsLabel);
//		new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumYou.setBackground(Color.green);
		panel.add(SumYou);
		

		
		JPanel SumP2 = new JPanel();
		SumP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumP2.setBackground(Color.green);
		panel.add(SumP2);
		
	
		
		JPanel ThreeOAK = new JPanel();
		ThreeOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAK.add(new JLabel("Three Of A Kind"));
		ThreeOAK.setBackground(Color.cyan);
		panel.add(ThreeOAK);
		
		JPanel ThreeOAKcoreYou = new JPanel();
		ThreeOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreYou.add(p1threeOAKLabel);
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
		FourOAKcoreYou.add(p1fourOAKLabel);
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
		FullHousecoreYou.add(p1fullhouseLabel);
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
		SScoreYou.add(p1ssLabel);
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
		LScoreYou.add(p1lsLabel);
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
		ChancecoreYou.add(p1chanceLabel);
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
		YahtzeecoreYou.add(p1yahtzeeLabel);
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
	public static void P1SetScores(int D1, int D2, int D3, int D4, int D5)
	{
		;
		Scoring p1score = new Scoring();
		Scoring p2score = new Scoring();
		int p1sumscore = 0, p2sumsscore=0;

        
		// calculate the scores of the rolls
		p1score.Ones(D1, D2, D3, D4, D5);
		p1score.Twos(D1, D2, D3, D4, D5);
		p1score.Threes(D1, D2, D3, D4, D5);
		p1score.Fours(D1, D2, D3, D4, D5);
		p1score.Fives(D1, D2, D3, D4, D5);
		p1score.Sixes(D1, D2, D3, D4, D5);
		p1score.ThreeOAK(D1, D2, D3, D4, D5);
		p1score.FourOAK(D1, D2, D3, D4, D5);
		p1score.FullHouse(D1, D2, D3, D4, D5);
		p1score.SS(D1, D2, D3, D4, D5);
		p1score.LS(D1, D2, D3, D4, D5);
		p1score.Yahtzee(D1, D2, D3, D4, D5);
		p1score.Chance(D1, D2, D3, D4, D5);
		//putClientProperty("myValue", myValue)
		//getClientProperty("myValue")
		//apply the scores to the labels
		// Check to see if each value is set yet
		if((boolean)p1oneslabel.getClientProperty("scoreNotSet")) {
			p1oneslabel.setText("" + p1score.scoreOnes);
		    p1oneslabel.putClientProperty("myValue",p1score.scoreOnes);
		}
		p1twoslabel.setText("" + p1score.scoreTwos);
		p1threeslabel.setText("" + p1score.scoreThrees);
		p1fourslabel.setText("" + p1score.scoreFours);
		p1fiveslabel.setText("" + p1score.scoreFives);
		p1sixeslabel.setText("" + p1score.scoreSixes);
		p1threeOAKLabel.setText("" + p1score.scoreThreeOAK);
		p1fourOAKLabel.setText("" + p1score.scoreFourOAK);
		p1fullhouseLabel.setText("" + p1score.scoreFH);
		p1ssLabel.setText("" + p1score.scoreSS);
		p1lsLabel.setText("" + p1score.scoreLS);
		p1yahtzeeLabel.setText("" + p1score.scoreYahtzee);
		p1chanceLabel.setText("" + p1score.scoreChance);
//		Font f = p1oneslabel.getFont();
//		// bold
//		p1oneslabel.setFont(f.deriveFont(f.getStyle() ^ Font.BOLD));
//		label.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
//		label.setFont(f.deriveFont(f.getStyle() ^ Font.BOLD));

		//calculate Total of top scores
		// Need to change this.  should return the value from the object instead of the text using GetText()
		p1sumscore=(int)p1oneslabel.getClientProperty("myValue") + p1score.scoreTwos + p1score.scoreThrees + p1score.scoreFours + p1score.scoreFives + p1score.scoreSixes;
		p1sumsLabel.setText("" + p1sumscore);
	
		//System.out.println("" + D1 + "" + D2 + "" + D3 + "" + D4 + "" + D5 + "");*/
	}
	public static void P2SetScores(int D1, int D2, int D3, int D4, int D5)
	{
		;
		Scoring p2score = new Scoring();
		int p2sumscore = 0;

        
		// calculate the scores of the rolls
		p2score.Ones(D1, D2, D3, D4, D5);
		p2score.Twos(D1, D2, D3, D4, D5);
		p2score.Threes(D1, D2, D3, D4, D5);
		p2score.Fours(D1, D2, D3, D4, D5);
		p2score.Fives(D1, D2, D3, D4, D5);
		p2score.Sixes(D1, D2, D3, D4, D5);
		p2score.ThreeOAK(D1, D2, D3, D4, D5);
		p2score.FourOAK(D1, D2, D3, D4, D5);
		p2score.FullHouse(D1, D2, D3, D4, D5);
		p2score.SS(D1, D2, D3, D4, D5);
		p2score.LS(D1, D2, D3, D4, D5);
		p2score.Yahtzee(D1, D2, D3, D4, D5);
		p2score.Chance(D1, D2, D3, D4, D5);
		
		//apply the scores to the labels
		//build in smarts to check for "Locked" around each one
		p2oneslabel.setText("" + p2score.scoreOnes);
		p2twoslabel.setText("" + p2score.scoreTwos);
		p2threeslabel.setText("" + p2score.scoreThrees);
		p2fourslabel.setText("" + p2score.scoreFours);
		p2fiveslabel.setText("" + p2score.scoreFives);
		p2sixeslabel.setText("" + p2score.scoreSixes);
		p2threeOAKLabel.setText("" + p2score.scoreThreeOAK);
		p2fourOAKLabel.setText("" + p2score.scoreFourOAK);
		p2fullhouseLabel.setText("" + p2score.scoreFH);
		p2ssLabel.setText("" + p2score.scoreSS);
		p2lsLabel.setText("" + p2score.scoreLS);
		p2yahtzeeLabel.setText("" + p2score.scoreYahtzee);
		p2chanceLabel.setText("" + p2score.scoreChance);
	

		//calculate Total of top scores
		// Need to change this.  should return the value from the object instead of the text using GetText()
		p2sumscore= p2score.scoreOnes + 
				    p2score.scoreTwos + 
				    p2score.scoreThrees + 
				    p2score.scoreFours + 
				    p2score.scoreFives + 
				    p2score.scoreSixes;
		p2sumsLabel.setText("" + p2sumscore);

		
				
		//System.out.println("" + D1 + "" + D2 + "" + D3 + "" + D4 + "" + D5 + "");*/
	}
}
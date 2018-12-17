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
	public static JLabel p1oneslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1twoslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1threeslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1fourslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1fiveslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1sixeslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1sumsLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1bonuslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1threeOAKLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1fourOAKLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1fullhouseLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1ssLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1lsLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p1yahtzeeLabel= new JLabel("", JLabel.CENTER);
	public static JLabel p1chanceLabel = new JLabel("", JLabel.CENTER);


	public static JLabel p2oneslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2twoslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2threeslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2fourslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2fiveslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2sixeslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2sumsLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2bonuslabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2threeOAKLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2fourOAKLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2fullhouseLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2ssLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2lsLabel = new JLabel("", JLabel.CENTER);
	public static JLabel p2yahtzeeLabel= new JLabel("", JLabel.CENTER);
	public static JLabel p2chanceLabel = new JLabel("", JLabel.CENTER);


	public static void main(String[] args) 
	{

		//declariations
		Scoring score;
		JFrame frame = new JFrame("Yahtzee");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);
		Font labelfont;


		PlayPanel2 PlayPanel = new PlayPanel2();
		//Manage the layout for the frames
		PlayPanel.setLayout(null);
		ScoringPanel Panel = new ScoringPanel(PlayPanel.die6, PlayPanel.die7, PlayPanel.die8, PlayPanel.die9, PlayPanel.die10);
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

		// Label for Player 1 'ones' scores
		JPanel OneScoreYou = new JPanel();
		OneScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreYou.add(p1oneslabel);
		p1oneslabel.setBorder(new LineBorder(Color.BLACK));
		p1oneslabel.setPreferredSize(new Dimension(130, 37));
		p1oneslabel.putClientProperty("myValue",0);
		p1oneslabel.putClientProperty("myName",1);
		OneScoreYou.setBackground(Color.cyan);
		panel.add(OneScoreYou);
		// attach mouse click listener to the jlabel
		Component mouseClick = new MyComponent()  ;
		p1oneslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1oneslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1oneslabel.getFont();
		p1oneslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		// Label for Player 2 'ones' score
		JPanel OneScoreP2 = new JPanel();
		OneScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		OneScoreP2.add(p2oneslabel);
		p2oneslabel.setBorder(new LineBorder(Color.BLACK));
		p2oneslabel.setPreferredSize(new Dimension(50, 25));
		OneScoreP2.setBackground(Color.cyan);
		panel.add(OneScoreP2);
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2oneslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2oneslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2oneslabel.getFont();
		p2oneslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));



		JPanel Twos = new JPanel();
		Twos.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Twos.add(new JLabel("Twos"));
		Twos.setBackground(Color.cyan);
		panel.add(Twos);


		//Label for Player 1 "Twos" score
		JPanel TwoScoreYou = new JPanel();
		TwoScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		TwoScoreYou.add(p1twoslabel);
		//  p1twoslabel.putClientProperty("myName",2);
		p1twoslabel.setBorder(new LineBorder(Color.BLACK));
		p1twoslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1twoslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1twoslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1twoslabel.getFont();
		p1twoslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));
		//TwoScoreYou.add(new JLabel("" + Panel.score.scoreTwos));
		TwoScoreYou.setBackground(Color.cyan);
		panel.add(TwoScoreYou);
		p1twoslabel.addMouseListener((MouseListener) mouseClick);


		JPanel TwoScoreP2 = new JPanel();
		TwoScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		//public static JLabel p2twoslabel = new JLabel();
		TwoScoreP2.add(p2twoslabel);
		p2twoslabel.setBorder(new LineBorder(Color.BLACK));
		p2twoslabel.setPreferredSize(new Dimension(50, 25));
		TwoScoreP2.setBackground(Color.cyan);
		panel.add(TwoScoreP2);
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2twoslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2twoslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2twoslabel.getFont();
		p2twoslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));




		JPanel Threes = new JPanel();
		Threes.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Threes.add(new JLabel("Threes"));
		Threes.setBackground(Color.cyan);
		panel.add(Threes);

		JPanel ThreeScoreYou = new JPanel();
		ThreeScoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreYou.add(p1threeslabel);
		p1threeslabel.setBorder(new LineBorder(Color.BLACK));
		p1threeslabel.setPreferredSize(new Dimension(50, 25));
		//ThreeScoreYou.add(new JLabel("" + Panel.score.scoreThrees));
		ThreeScoreYou.setBackground(Color.cyan);
		panel.add(ThreeScoreYou);
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1threeslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1threeslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1threeslabel.getFont();
		p1threeslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));




		JPanel ThreeScoreP2 = new JPanel();
		ThreeScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeScoreP2.add(p2threeslabel);
		p2threeslabel.setBorder(new LineBorder(Color.BLACK));
		p2threeslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2threeslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2threeslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2threeslabel.getFont();
		p2threeslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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
		p1fourslabel.setBorder(new LineBorder(Color.BLACK));
		p1fourslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1fourslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1fourslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1fourslabel.getFont();
		p1fourslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));
		FourScoreYou.setBackground(Color.cyan);
		panel.add(FourScoreYou);

		JPanel FourScoreP2 = new JPanel();
		FourScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourScoreP2.add(p2fourslabel);
		p2fourslabel.setBorder(new LineBorder(Color.BLACK));
		p2fourslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2fourslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2fourslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2fourslabel.getFont();
		p2fourslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));
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
		p1fiveslabel.setBorder(new LineBorder(Color.BLACK));
		p1fiveslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1fiveslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1fiveslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1fiveslabel.getFont();
		p1fiveslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		//FiveScoreYou.add(new JLabel("" + Panel.score.scoreFives));
		FiveScoreYou.setBackground(Color.cyan);
		panel.add(FiveScoreYou);

		JPanel FiveScoreP2 = new JPanel();
		FiveScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FiveScoreP2.add(p2fiveslabel);
		p2fiveslabel.setBorder(new LineBorder(Color.BLACK));
		p2fiveslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2fiveslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2fiveslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2fiveslabel.getFont();
		p2fiveslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		//  FiveScoreP2.add(new JLabel("" + Panel.score.scoreFives));
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
		p1sixeslabel.setBorder(new LineBorder(Color.BLACK));
		p1sixeslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1sixeslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1sixeslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1sixeslabel.getFont();
		p1sixeslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		//SixScoreYou.add(new JLabel("" + Panel.score.scoreSixes));
		SixScoreYou.setBackground(Color.cyan);
		panel.add(SixScoreYou);

		JPanel SixScoreP2 = new JPanel();
		SixScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SixScoreP2.add(p2sixeslabel);
		p2sixeslabel.setBorder(new LineBorder(Color.BLACK));
		p2sixeslabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2sixeslabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2sixeslabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2sixeslabel.getFont();
		p2sixeslabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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

		//  new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumYou.setBackground(Color.green);
		panel.add(SumYou);



		JPanel SumP2 = new JPanel();
		SumP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SumP2.add(p2sumsLabel);
		//  SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		SumP2.setBackground(Color.green);
		panel.add(SumP2);


		JPanel Bonus = new JPanel();
		Bonus.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		Bonus.add(new JLabel("Bonus"));
		//  SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		Bonus.setBackground(Color.green);
		panel.add(Bonus);

		JPanel BonusYou = new JPanel();
		BonusYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		BonusYou.add(p1bonuslabel);
		//  SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		BonusYou.setBackground(Color.green);
		panel.add(BonusYou);

		JPanel BonusP2 = new JPanel();
		BonusP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		BonusP2.add(p2bonuslabel);
		//  SumP2.add(new JLabel("" + Panel.score.scoreOnes + Panel.score.scoreTwos + Panel.score.scoreThrees + Panel.score.scoreFours + Panel.score.scoreFives + Panel.score.scoreSixes));
		BonusP2.setBackground(Color.green);
		panel.add(BonusP2);


		JPanel ThreeOAK = new JPanel();
		ThreeOAK.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAK.add(new JLabel("Three Of A Kind"));
		ThreeOAK.setBackground(Color.cyan);
		panel.add(ThreeOAK);

		JPanel ThreeOAKcoreYou = new JPanel();
		ThreeOAKcoreYou.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreYou.add(p1threeOAKLabel);
		p1threeOAKLabel.setBorder(new LineBorder(Color.BLACK));
		p1threeOAKLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1threeOAKLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1threeOAKLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1threeOAKLabel.getFont();
		p1threeOAKLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		ThreeOAKcoreYou.setBackground(Color.cyan);
		panel.add(ThreeOAKcoreYou);

		JPanel ThreeOAKcoreP2 = new JPanel();
		ThreeOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ThreeOAKcoreP2.add(p2threeOAKLabel);
		p2threeOAKLabel.setBorder(new LineBorder(Color.BLACK));
		p2threeOAKLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2threeOAKLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2threeOAKLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2threeOAKLabel.getFont();
		p2threeOAKLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		//  ThreeOAKcoreP2.add(new JLabel("" + Panel.score.scoreThreeOAK));
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
		p1fourOAKLabel.setBorder(new LineBorder(Color.BLACK));
		p1fourOAKLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1fourOAKLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1fourOAKLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1fourOAKLabel.getFont();
		p1fourOAKLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		FourOAKcoreYou.setBackground(Color.cyan);
		panel.add(FourOAKcoreYou);



		JPanel FourOAKcoreP2 = new JPanel();
		FourOAKcoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FourOAKcoreP2.add(p2fourOAKLabel);
		p2fourOAKLabel.setBorder(new LineBorder(Color.BLACK));
		p2fourOAKLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2fourOAKLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2fourOAKLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2fourOAKLabel.getFont();
		p2fourOAKLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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
		p1fullhouseLabel.setBorder(new LineBorder(Color.BLACK));
		p1fullhouseLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1fullhouseLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1fullhouseLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1fullhouseLabel.getFont();
		p1fullhouseLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		FullHousecoreYou.setBackground(Color.cyan);
		panel.add(FullHousecoreYou);

		JPanel FullHousecoreP2 = new JPanel();
		FullHousecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		FullHousecoreP2.add(p2fullhouseLabel);
		p2fullhouseLabel.setBorder(new LineBorder(Color.BLACK));
		p2fullhouseLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2fullhouseLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2fullhouseLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2fullhouseLabel.getFont();
		p2fullhouseLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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
		p1ssLabel.setBorder(new LineBorder(Color.BLACK));
		p1ssLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1ssLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1ssLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1ssLabel.getFont();
		p1ssLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		SScoreYou.setBackground(Color.cyan);
		panel.add(SScoreYou);


		JPanel SScoreP2 = new JPanel();
		SScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		SScoreP2.add(p2ssLabel);
		p2ssLabel.setBorder(new LineBorder(Color.BLACK));
		p2ssLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2ssLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2ssLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2ssLabel.getFont();
		p2ssLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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
		p1lsLabel.setBorder(new LineBorder(Color.BLACK));
		p1lsLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1lsLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1lsLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1lsLabel.getFont();
		p1lsLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		LScoreYou.setBackground(Color.cyan);
		panel.add(LScoreYou);

		JPanel LScoreP2 = new JPanel();
		LScoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		LScoreP2.add(p2lsLabel);
		p2lsLabel.setBorder(new LineBorder(Color.BLACK));
		p2lsLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2lsLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2lsLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2lsLabel.getFont();
		p2lsLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

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
		p1chanceLabel.setBorder(new LineBorder(Color.BLACK));
		p1chanceLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1chanceLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1chanceLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1chanceLabel.getFont();
		p1chanceLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		ChancecoreYou.setBackground(Color.cyan);
		panel.add(ChancecoreYou);

		JPanel ChancecoreP2 = new JPanel();
		ChancecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		ChancecoreP2.add(p2chanceLabel);
		p2chanceLabel.setBorder(new LineBorder(Color.BLACK));
		p2chanceLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2chanceLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2chanceLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2chanceLabel.getFont();
		p2chanceLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));


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
		p1yahtzeeLabel.setBorder(new LineBorder(Color.BLACK));
		p1yahtzeeLabel.setPreferredSize(new Dimension(50, 25));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p1yahtzeeLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p1yahtzeeLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p1yahtzeeLabel.getFont();
		p1yahtzeeLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));


		YahtzeecoreYou.setBackground(Color.cyan);
		panel.add(YahtzeecoreYou);

		JPanel YahtzeecoreP2 = new JPanel();
		YahtzeecoreP2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		YahtzeecoreP2.add(p2yahtzeeLabel);
		p2yahtzeeLabel.setBorder(new LineBorder(Color.BLACK));
		p2yahtzeeLabel.setPreferredSize(new Dimension(130, 39));
		// attach mouse click listener to the jlabel
		mouseClick = new MyComponent();
		p2yahtzeeLabel.addMouseListener((MouseListener) mouseClick);
		// Set the value to "ScoreNotSet" for this label
		p2yahtzeeLabel.putClientProperty("scoreNotSet",true);
		// Set the font to non-bold
		labelfont = p2yahtzeeLabel.getFont();
		p2yahtzeeLabel.setFont(labelfont.deriveFont(labelfont.getStyle() & ~Font.BOLD));

		YahtzeecoreP2.setBackground(Color.cyan);
		panel.add(YahtzeecoreP2);



		JPanel primary = new JPanel();
		primary.setBackground(Color.white);
		primary.add(PlayPanel);
		primary.add(panel);

		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);


	}
	public static void P1SetScores(int D1, int D2, int D3, int D4, int D5)
	{
		;
		Scoring p1score = new Scoring();
		//  Scoring p2score = new Scoring();
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
		} else {
			p1sumscore += (int)p1oneslabel.getClientProperty("myValue");
		}


		if((boolean)p1twoslabel.getClientProperty("scoreNotSet")) {
			p1twoslabel.setText("" + p1score.scoreTwos);
			p1twoslabel.putClientProperty("myValue",p1score.scoreTwos);
		} else {
			p1sumscore += (int)p1twoslabel.getClientProperty("myValue");
		}

		if((boolean)p1threeslabel.getClientProperty("scoreNotSet")) {
			p1threeslabel.setText("" + p1score.scoreThrees);
			p1threeslabel.putClientProperty("myValue",p1score.scoreThrees);
		} else {
			p1sumscore += (int)p1threeslabel.getClientProperty("myValue");
		}

		if((boolean)p1fourslabel.getClientProperty("scoreNotSet")) {
			p1fourslabel.setText("" + p1score.scoreFours);
			p1fourslabel.putClientProperty("myValue",p1score.scoreFours);
		} else {
			p1sumscore += (int)p1fourslabel.getClientProperty("myValue");
		}

		if((boolean)p1fiveslabel.getClientProperty("scoreNotSet")) {
			p1fiveslabel.setText("" + p1score.scoreFives);
			p1fiveslabel.putClientProperty("myValue",p1score.scoreFives);
		} else {
			p1sumscore += (int)p1fiveslabel.getClientProperty("myValue");
		}
		//  p1fiveslabel.setText("" + p1score.scoreFives);
		if((boolean)p1sixeslabel.getClientProperty("scoreNotSet")) {
			p1sixeslabel.setText("" + p1score.scoreSixes);
			p1sixeslabel.putClientProperty("myValue",p1score.scoreSixes);
		} else {
			p1sumscore += (int)p1sixeslabel.getClientProperty("myValue");
			//  p1sumscore= (int)p1oneslabel.getClientProperty("myValue") + 
			//     (int)p1twoslabel.getClientProperty("myValue")+
			//     (int)p1threeslabel.getClientProperty("myValue")+
			//     (int)p1fourslabel.getClientProperty("myValue")+
			//     (int)p1fiveslabel.getClientProperty("myValue")+
			//     (int)p1sixeslabel.getClientProperty("myValue");

			if((boolean)p1threeOAKLabel.getClientProperty("scoreNotSet")) {
				p1threeOAKLabel.setText("" + p1score.scoreThreeOAK);
				p1threeOAKLabel.putClientProperty("myValue",p1score.scoreThreeOAK);
			}

			if((boolean)p1fourOAKLabel.getClientProperty("scoreNotSet")) {
				p1fourOAKLabel.setText("" + p1score.scoreFourOAK);
				p1fourOAKLabel.putClientProperty("myValue",p1score.scoreFourOAK);
			}

			if((boolean)p1fullhouseLabel.getClientProperty("scoreNotSet")) {
				p1fullhouseLabel.setText("" + p1score.scoreFH);
				p1fullhouseLabel.putClientProperty("myValue",p1score.scoreFH);
			}

			if((boolean)p1ssLabel.getClientProperty("scoreNotSet")) {
				p1ssLabel.setText("" + p1score.scoreSS);
				p1ssLabel.putClientProperty("myValue",p1score.scoreSS);
			}

			if((boolean)p1lsLabel.getClientProperty("scoreNotSet")) {
				p1lsLabel.setText("" + p1score.scoreLS);
				p1lsLabel.putClientProperty("myValue",p1score.scoreLS);
			}


			if((boolean)p1yahtzeeLabel.getClientProperty("scoreNotSet")) {
				p1yahtzeeLabel.setText("" + p1score.scoreYahtzee);
				p1yahtzeeLabel.putClientProperty("myValue",p1score.scoreYahtzee);
			}

			if((boolean)p1chanceLabel.getClientProperty("scoreNotSet")) {
				p1chanceLabel.setText("" + p1score.scoreYahtzee);
				p1chanceLabel.putClientProperty("myValue",p1score.scoreYahtzee);

				p1sumsLabel.setText("" + p1sumscore);}}

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
		if((boolean)p2oneslabel.getClientProperty("scoreNotSet")) {
			p2oneslabel.setText("" + p2score.scoreOnes);
			p2oneslabel.putClientProperty("myValue",p2score.scoreOnes);
		}  else {
			p2sumscore += (int)p2oneslabel.getClientProperty("myValue");
		}
		//  p2oneslabel.setText("" + p2score.scoreOnes);
		if((boolean)p2twoslabel.getClientProperty("scoreNotSet")) {
			p2twoslabel.setText("" + p2score.scoreTwos);
			p2twoslabel.putClientProperty("myValue",p2score.scoreTwos);
		}  else {
			p2sumscore += (int)p2twoslabel.getClientProperty("myValue");
		}

		if((boolean)p2threeslabel.getClientProperty("scoreNotSet")) {
			p2threeslabel.setText("" + p2score.scoreThrees);
			p2threeslabel.putClientProperty("myValue",p2score.scoreThrees);
		} else {
			p2sumscore += (int)p2threeslabel.getClientProperty("myValue");
		}

		if((boolean)p2fourslabel.getClientProperty("scoreNotSet")) {
			p2fourslabel.setText("" + p2score.scoreFours);
			p2fourslabel.putClientProperty("myValue",p2score.scoreFours);
		} else {
			p2sumscore += (int)p2fourslabel.getClientProperty("myValue");
		}


		if((boolean)p2fiveslabel.getClientProperty("scoreNotSet")) {
			p2fiveslabel.setText("" + p2score.scoreFives);
			p2fiveslabel.putClientProperty("myValue",p2score.scoreFives);
		} else {
			p2sumscore += (int)p2fiveslabel.getClientProperty("myValue");
		}

		if((boolean)p2sixeslabel.getClientProperty("scoreNotSet")) {
			p2sixeslabel.setText("" + p2score.scoreSixes);
			p2sixeslabel.putClientProperty("myValue",p2score.scoreSixes);
		} else {
			p2sumscore += (int)p2sixeslabel.getClientProperty("myValue");
		}

		if((boolean)p2threeOAKLabel.getClientProperty("scoreNotSet")) {
			p2threeOAKLabel.setText("" + p2score.scoreThreeOAK);
			p2threeOAKLabel.putClientProperty("myValue",p2score.scoreThreeOAK);
		}

		if((boolean)p2fourOAKLabel.getClientProperty("scoreNotSet")) {
			p2fourOAKLabel.setText("" + p2score.scoreFourOAK);
			p2fourOAKLabel.putClientProperty("myValue",p2score.scoreFourOAK);
		}

		if((boolean)p2fullhouseLabel.getClientProperty("scoreNotSet")) {
			p2fullhouseLabel.setText("" + p2score.scoreFH);
			p2fullhouseLabel.putClientProperty("myValue",p2score.scoreFH);
		}

		if((boolean)p2ssLabel.getClientProperty("scoreNotSet")) {
			p2ssLabel.setText("" + p2score.scoreSS);
			p2ssLabel.putClientProperty("myValue",p2score.scoreSS);
		}

		if((boolean)p2lsLabel.getClientProperty("scoreNotSet")) {
			p2lsLabel.setText("" + p2score.scoreLS);
			p2lsLabel.putClientProperty("myValue",p2score.scoreLS);
		}


		if((boolean)p2yahtzeeLabel.getClientProperty("scoreNotSet")) {
			p2yahtzeeLabel.setText("" + p2score.scoreYahtzee);
			p2yahtzeeLabel.putClientProperty("myValue",p2score.scoreYahtzee);
		}

		if((boolean)p2chanceLabel.getClientProperty("scoreNotSet")) {
			p2chanceLabel.setText("" + p2score.scoreYahtzee);
			p2chanceLabel.putClientProperty("myValue",p2score.scoreYahtzee);
		} 
		/*  p2oneslabel.setText("" + p2score.scoreOnes);
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
		 */

		//calculate Total of top scores
		// Need to change this.  should return the value from the object instead of the text using GetText()
		//  p2sumscore= p2score.scoreOnes + 
		//        p2score.scoreTwos + 
		//        p2score.scoreThrees + 
		//        p2score.scoreFours + 
		//        p2score.scoreFives + 
		//        p2score.scoreSixes;


		p2sumsLabel.setText("" + p2sumscore);



		//System.out.println("" + D1 + "" + D2 + "" + D3 + "" + D4 + "" + D5 + "");*/
	}
}

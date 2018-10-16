package Yahtzee;

public class Scoring 
{
	int scoreOnes, scoreTwos, scoreThrees, scoreFours, scoreFives, scoreSixes;
	int scoreThreeOAK, scoreFourOAK, scoreFH, scoreSS, scoreLS, scoreChance, scoreYahtzee;
	public void Ones(int D1, int D2, int D3, int D4, int D5)
	{
		scoreOnes = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 1);
		if (num.count >= 1)
		{
		scoreOnes = (num.count * 1);	
		}
	}
	public void Twos(int D1, int D2, int D3, int D4, int D5)
	{
		scoreTwos = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 2);
		if (num.count >= 1)
		{
		scoreTwos = (num.count * 2);
		}
	}
	public void Threes(int D1, int D2, int D3, int D4, int D5)
	{
		scoreThrees = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 3);
		if (num.count >= 1)
		{
		scoreThrees = (num.count * 3);
		}
	}
	public void Fours(int D1, int D2, int D3, int D4, int D5)
	{
		scoreFours = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 4);
		if (num.count >= 1)
		{
		scoreFours = (num.count * 4);
		}
	}
	public void Fives(int D1, int D2, int D3, int D4, int D5)
	{
		scoreFives = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 5);
		if (num.count >= 1)
		{
		scoreFives = (num.count * 5);
		}
	}
	public void Sixes(int D1, int D2, int D3, int D4, int D5)
	{
		scoreSixes = 0;
		NumCount num;
		num = new NumCount(D1, D2, D3, D4, D5, 6);
		if (num.count >= 1)
		{
			scoreSixes = (num.count * 6);
		}
	}
	public void ThreeOAK(int D1, int D2, int D3, int D4, int D5)
	{
		scoreThreeOAK = 0;
		KindCheck kind;
		kind = new KindCheck(D1, D2, D3, D4, D5, 3);
		if (kind.kind == 1)
		{
			scoreThreeOAK = (D1 + D2 + D3 + D4 + D5);
		}
	}
	public void FourOAK(int D1, int D2, int D3, int D4, int D5)
	{
		scoreFourOAK = 0;
		KindCheck kind;
		kind = new KindCheck(D1, D2, D3, D4, D5, 4);
		if (kind.kind ==1)
		{
			scoreThreeOAK = (D1 + D2 + D3 + D4 + D5);
		}
	}
	public void FullHouse(int D1, int D2, int D3, int D4, int D5)
	{
		scoreFH = 0;
		FullHouseCheck FH;
		FH = new FullHouseCheck(D1, D2, D3, D4, D5);
		if (FH.FullHouse = true)
		{
			scoreFH = 25;
		}
	}
	public void SS(int D1, int D2, int D3, int D4, int D5)
	{
		scoreSS = 0;
		SmallStraightCheck SS;
		SS = new SmallStraightCheck(D1, D2, D3, D4, D5);
		if (SS.SmallStraight = true)
		{
			scoreSS = 30;
		}
	}
	public void LS(int D1, int D2, int D3, int D4, int D5)
	{
		scoreLS = 0;
		LargeStraightCheck LS;
		LS = new LargeStraightCheck(D1, D2, D3, D4, D5);
		if (LS.LargeStraight = true)
		{
			scoreLS = 40;
		}	
	}
	public void Yahtzee(int D1, int D2, int D3, int D4, int D5)
	{
		scoreYahtzee = 0;
		KindCheck kind;
		kind = new KindCheck(D1, D2, D3, D4, D5, 5);
		if (kind.kind == 1)
		{
			scoreYahtzee = 50;
		}
	}
}

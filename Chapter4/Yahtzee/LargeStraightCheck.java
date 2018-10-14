package Yahtzee;

public class LargeStraightCheck 
{
	private NumCount num1, num2, num3, num4, num5, num6;
	int Value1, Value2, Value3, Value4, Value5, Value6;
	boolean LargeStraight;
	
	public LargeStraightCheck(int D1, int D2, int D3, int D4, int D5)
	{
		
		LargeStraight = false;
		num1 = new NumCount(D1, D2, D3, D4, D5, Value1);
		Value1 = 1;
		num2 = new NumCount(D1, D2, D3, D4, D5, Value2);
		Value2 = 2;
		num3 = new NumCount(D1, D2, D3, D4, D5, Value3);
		Value3 = 3;
		num4 = new NumCount(D1, D2, D3, D4, D5, Value4);
		Value4 = 4;
		num5 = new NumCount(D1, D2, D3, D4, D5, Value5);
		Value5 = 5;
		num6 = new NumCount(D1, D2, D3, D4, D5, Value6);
		Value5 = 6;
		if ((num1.count >= 1) && (num2.count >= 1) && (num3.count >= 1) && (num4.count >= 1) && num5.count >=1)
		{
			LargeStraight = true;
		}
		if ((num2.count >= 1) && (num3.count >= 1) && (num4.count >= 1) && (num5.count >= 1) && num6.count >=1)
		{
			LargeStraight = true;
		}
	}
}

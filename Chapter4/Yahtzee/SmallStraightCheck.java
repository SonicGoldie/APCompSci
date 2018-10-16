package Yahtzee;

public class SmallStraightCheck 
{
	private NumCount num1, num2, num3, num4, num5, num6;
	boolean SmallStraight;
	
	public SmallStraightCheck(int D1, int D2, int D3, int D4, int D5)
	{
		
		SmallStraight = false;
		num1 = new NumCount(D1, D2, D3, D4, D5, 1);
		num2 = new NumCount(D1, D2, D3, D4, D5, 2);
		num3 = new NumCount(D1, D2, D3, D4, D5, 3);
		num4 = new NumCount(D1, D2, D3, D4, D5, 4);
		num5 = new NumCount(D1, D2, D3, D4, D5, 5);
		num6 = new NumCount(D1, D2, D3, D4, D5, 6);
		//System.out.println("" + num1.count + "" + num2.count + "" + num3.count + "" + num4.count + "" + num5.count + "" + num6.count);
		if ((num1.count >= 1) && (num2.count >= 1) && (num3.count >= 1) && (num4.count >= 1) )
		{
			
			SmallStraight = true;
		}
		if ((num2.count >= 1) && (num3.count >= 1) && (num4.count >= 1) && (num5.count >=1) )
		{
			SmallStraight = true;
		}
		if ((num3.count >= 1) && (num4.count >= 1) && (num5.count >= 1) && (num6.count >= 1))
		{
			SmallStraight = true;
		}
	}
}

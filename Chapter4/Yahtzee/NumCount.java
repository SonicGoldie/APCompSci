package Yahtzee;

public class NumCount 
{
	public int count;
	
	public NumCount(int D1, int D2, int D3, int D4, int D5, int Value)
	{
		count = 0;
		if (D1 == Value)
		{
			count ++;
		}
		if (D2 == Value)
		{
			count ++;
		}
		if (D3 == Value)
		{
			count ++;
		}
		if (D4 == Value)
		{
			count ++;
		}
		if (D5 == Value)
		{
			count ++;
		}
		
		
	}
	public int getCount()
	{
		return count;
	}
}

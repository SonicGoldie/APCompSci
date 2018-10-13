package Yahtzee;

public class KindCheck 
{
	boolean kind;
	private NumCount num;
	
	public KindCheck(int D1, int D2, int D3, int D4, int D5, int Value)
	{
		kind = false;
		num = new NumCount(D1, D2, D3, D4, D5, 1);
		kind = false;
		if (num.count == Value)
		{
			kind = true;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 2);
		if (num.count == Value)
		{
			kind = true;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 3);
		if (num.count == Value)
		{
			kind = true;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 4);
		if (num.count == Value)
		{
			kind = true;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 5);
		if (num.count == Value)
		{
			kind = true;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 6);
		if (num.count == Value)
		{
			kind = true;
		}				
	}
	public boolean getKind()
	{
		return kind;
	}
}

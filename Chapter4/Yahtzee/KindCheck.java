package Yahtzee;

public class KindCheck 
{
	int kind;
	private NumCount num;
	
	public KindCheck(int D1, int D2, int D3, int D4, int D5, int Value)
	{
		kind = 0;
		num = new NumCount(D1, D2, D3, D4, D5, 1);
		if (num.count >= Value)
		{
			kind++;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 2);
		if (num.count >= Value)
		{
			kind++;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 3);
		if (num.count >= Value)
		{
			kind++;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 4);
		if (num.count >= Value)
		{
			kind++;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 5);
		if (num.count >= Value)
		{
			kind++;
		}
		num = new NumCount(D1, D2, D3, D4, D5, 6);
		if (num.count >= Value)
		{
			kind++;
		}				
	}
	public int getKind()
	{
		return kind;
	}
}
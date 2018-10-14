package Yahtzee;

public class FullHouseCheck 
{
	private KindCheck kind2, kind3;
	boolean FullHouse;
	
	public FullHouseCheck(int D1, int D2, int D3, int D4, int D5)
	{
		FullHouse = false;
		kind2 = new KindCheck(D1, D2, D3, D4, D5, 2);
		kind3 = new KindCheck(D1, D2, D3, D4, D5, 3);
		if (kind2.kind == 2 && kind3.kind == 1)
		{
			FullHouse = true;
		}
		
		
		
		
	}
}

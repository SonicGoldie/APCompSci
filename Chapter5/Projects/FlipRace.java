package Projects;

public class FlipRace {

	public static void main(String[] args) 
	{
		Coin6 Coin1 = new Coin6();
		Coin6 Coin2 = new Coin6();
		int count = 1;
		int Headcount1 = 0;
		int Headcount2 = 0;
		/*myCoin.flip();
		
		System.out.println(myCoin);
		if (myCoin.isHeads())
			System.out.println("You win.");
		else
			System.out.println("Better luck next time.");*/
		while (Headcount1 <= 2 && Headcount2 <= 2)
		{
			
			Coin1.flip();
			Coin2.flip();
			System.out.println("Turn Number: " + count);
			System.out.println("Coin 1: " + Coin1);
			System.out.println("Coin 2: " + Coin2);
			if (Coin1.isHeads())
			{
				Headcount1++;
			}
			if (Coin2.isHeads())
			{
				Headcount2++;
			}
			//System.out.println("Coin 1 Count: " + Headcount1);
			//System.out.println("Coin 2 Count: " + Headcount2);
			count++;
		}
		
		
	}

}

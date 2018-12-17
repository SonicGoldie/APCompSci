package Projects;

public class CoinCounter {

	public static void main(String[] args) 
	{
		int heads = 0, tails = 0;
		Coin6 coin = new Coin6();
		for (int i = 0; i < 100; i++)
		{
			coin.flip();
			if (coin.isHeads())
				heads++;
			else
				tails++;
		}
		System.out.println("You flipped 100 coins.");
		System.out.println("You flipped " + heads + " heads.");
		System.out.println("You flipped " + tails + " tails.");
	}

}

package Projects;

public class BoxCars 
{
	public static void main(String [] args)
	{
		PairOfDice6 Dice = new PairOfDice6();
		int boxcars = 0;
		final int numrolls = 1000, boxcarvals = 12;
		
		for (int i = 0; i < numrolls; i++)
		{
			if(Dice.roll() == boxcarvals)
			{
				boxcars++;
			}
		}
		System.out.println("Rolled " + numrolls + " pair of dice with " + boxcars + " boxcars");
		
	}
}

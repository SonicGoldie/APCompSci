package Projects;

import java.util.Random;
import java.util.Scanner;

public class HILo {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int Num;
		int count;
		String another = "y";
		while (another .equalsIgnoreCase("y"))
		{
			int guess = 0;
			count = 1;
			Num = rand.nextInt(99)+1;
			System.out.println("Please guess a number bewteen 1 and 100: ");
			while (guess != Num)
			{
				guess = scan.nextInt();
				if (guess > Num)
				{
					System.out.println("Too High, Try again");
					count++;
				}
				if (guess < Num)
				{
					System.out.println("Too low, Try again");
					count++;
				}
				if (guess == Num)
				{
					System.out.println("Congrats, You won!");
					if (count == 1)
					{
						System.out.println("It took you one try!");
					}
					if (count > 1)
					{
						System.out.println("It took you " + count + " tries.");
					}
					System.out.println("Would you like to play again? (y/n)");
					scan.nextLine();
					another = scan.nextLine();
				}
			}
		}
	}

}

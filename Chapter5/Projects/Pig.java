package Projects;

import java.util.Scanner;

public class Pig {

	public static void main(String[] args) 
	{
		boolean player = true;
		String roll = "n", another = "y";
		int playerScore = 0, comScore = 0, playerSum = 0, comSum = 0;
		PairOfDiceChapter5 pair = new PairOfDiceChapter5();
		Scanner scan = new Scanner(System.in);
		System.out.println("We are going to play a game of pig!");
		System.out.println("The goal of this game is to score 100 before the computer does.");
		System.out.println("To acheive this you must roll 2 die over and over again to score points.");
		System.out.println("You may cash out at any time, thus turning the die over to the computer");
		System.out.println("If you do not cash out and roll a 1, your score will be reverted to the last time you cashed out");
		System.out.println("If you roll 2 ones, you lose all of your points.");
		System.out.println("Let us begin...");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You as the player may begin, please roll.");
		while(another.equalsIgnoreCase("y"))
		{
		while(playerScore < 100 && comScore < 100 || playerSum > 100 && comSum > 100)
		{
			while (player == true)
			{
				System.out.println("You will now roll");
				playerSum = 0;
				System.out.println("Do you want to roll? (y/n)");
				roll = scan.nextLine();
			
				while(roll.equalsIgnoreCase("y"))
				{
					pair.roll();
					System.out.println("You have rolled a " + pair.getDie1() + " and a " + pair.getDie2());
					
					
					if (pair.getDie1() == 1 && pair.getDie2() == 1)
					{
						System.out.println("You have rolled 2 ones, your score will now be set to 0");
						playerScore = 0;
						playerSum = 0;
						roll = "n";
						
					}
					else if (pair.getDie1() == 1 || pair.getDie2() == 1)
					{
						System.out.println("You have rolled a 1, your score this round will be 0");
						playerSum = 0;
						roll = "n";
					}
					else
					{
						playerSum += pair.getDie1() + pair.getDie2();
						System.out.println("Your sum so far is: " + playerSum);
						System.out.println("Would you like to roll again? (y/n)");
						roll = scan.nextLine();
					}
					if(roll.equalsIgnoreCase("n"))
					{
						break;
					}
				}
				player = false;
				playerScore += playerSum;
				System.out.println("Your score is " + playerScore);
				System.out.println("The computer will now roll");
				
			}
			comSum = 0;
			while(player == false)
			{
				while(comSum < 20)
				{
				pair.roll();
				System.out.println("The computer rolled a " + pair.getDie1() + " and a " + pair.getDie2());
				
				if (pair.getDie1() == 1 && pair .getDie2() == 1)
				{
					System.out.println("The computer has rolled 2 ones, the Computers score is now 0");
					comScore = 0;
					break;
					
				}
				else if(pair.getDie1() == 1 || pair.getDie2() ==1)
				{
					System.out.println("The Computer Rolled a 1");
					System.out.println("It is now your turn");
					comSum = 0;
					break;
				}
				else
				{
					comSum += pair.getDie1() + pair.getDie2();
					System.out.println("The Computer's sum is " + comSum);
					System.out.println("The Computer will roll again.");
					
				}
				}
				player = true;
			}
			comScore += comSum;
			System.out.println("The Computer score is " + comScore);
			
				
		}
		if (playerScore >= 100)
		{
			System.out.println("Congratulations, you won!!");
		}
		if (comScore >= 100)
		{
			System.out.println("You lost, I am dissapointed");
		}

		System.out.println("Would you like to play again?");
		another = scan.next();
		}
		
	}

}

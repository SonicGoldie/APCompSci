package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String another = "y";
		Random rand = new Random();
		int choice, player, wins, losses, ties;
		wins = 0;
		losses = 0;
		ties = 0;
		System.out.println("We are going to play a game of Rock-Paper-Scissors-Shoot");
		System.out.println("");
		
		while (another.equalsIgnoreCase("y"))
		{
			choice = rand.nextInt(3)+1;
			System.out.println("I have chosen my choice, please make yours.");
			System.out.println("(1 for Rock, 2 for Paper, 3 for Scissors)");
			player = scan.nextInt();
			scan.nextLine();
			if (player == 1)
			{
				if (choice == 1)
				{
					System.out.println("Your Choice: Rock");
					System.out.println("Computer's Choice: Rock");
					System.out.println("You have tied.");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					ties++;
				}
				if (choice == 2)
				{
					System.out.println("Your Choice: Rock");
					System.out.println("Computer's Choice: Paper");
					System.out.println("I am sorry, you have lost :(");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					losses++;
				}
				if (choice == 3)
				{
					System.out.println("Your Choice: Rock");
					System.out.println("Computer's Choice: Scissors");
					System.out.println("You have won!!!");
					System.out.println("Would you like to go again? (y/n)");
					another = scan.nextLine();
					wins++;
					
				}
			}
			if (player == 2)
			{
				if (choice == 1)
				{
					System.out.println("Your Choice: Paper");
					System.out.println("Computer's Choice: Rock");
					System.out.println("You have won!!!");
					System.out.println("Would you like to go again? (y/n)");
					another = scan.nextLine();
					wins++;
				}
				if (choice == 2)
				{
					System.out.println("Your Choice: Paper");
					System.out.println("Computer's Choice: Paper");
					System.out.println("You have tied.");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					ties++;
				}
				if (choice == 3)
				{
					System.out.println("Your Choice: Paper");
					System.out.println("Computer's Choice: Scissors");
					System.out.println("I am sorry, you have lost :(");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					losses++;
				}
			}
			if (player == 3)
			{
				if (choice == 1)
				{
					System.out.println("Your Choice: Scissors");
					System.out.println("Computer's Choice: Rock");
					System.out.println("I am sorry, you have lost :(");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					losses++;
				}
				if (choice == 2)
				{
					System.out.println("Your Choice: Scissors");
					System.out.println("Computer's Choice: Paper");
					System.out.println("You have won!!!");
					System.out.println("Would you like to go again? (y/n)");
					another = scan.nextLine();
					wins++;
				}
				if (choice == 3)
				{
					System.out.println("Your Choice: Scissors");
					System.out.println("Computer's Choice: Scissors");
					System.out.println("You have tied.");
					System.out.println("Would you like to try again? (y/n)");
					another = scan.nextLine();
					ties++;
				}
			}
		}
		System.out.println("You have ended your game.");
		System.out.println("Your score was...");
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Ties: " + ties);
		System.out.println("Thanks for playing!");
		
	}

}

package Labs;
//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;
	public class GuessingGame
	{
		public static void main(String[] args)
		{
			int numToGuess; //Number the user tries to guess
			int guess; //The user's guess
			int count = 1;
			Scanner scan = new Scanner(System.in);
			Random generator = new Random();
			//randomly generate the number to guess
			numToGuess = generator.nextInt(9)+1;
			//print message asking user to enter a guess
			System.out.println("Please Guess a Number.");
			//read in guess
			guess = scan.nextInt();
			while (guess != numToGuess) //keep going as long as the guess is wrong	
			{
				if(numToGuess > guess)
				{
					System.out.println("That number is too low, guess again");
					count++;
				}
				if(numToGuess < guess)
				{
					System.out.println("That number is too high, guess again");
					count++;
				}
				//get another guess from the user
				guess = scan.nextInt();
			}
			//print message saying guess is right
			System.out.println("You have guessed correctly! It took you " +count+ " times.");
		}
	}
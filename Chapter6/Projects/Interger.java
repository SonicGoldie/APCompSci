package Projects;

import java.util.Scanner;

public class Interger {

	public static void main(String[] args) 
	{
		int counter = 2;
		int userInput, CONSTANT;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number (Below 2,147,483,647 Above 2)");
		System.out.println("Enter 0 to end");
		userInput = scan.nextInt();
		while (userInput != 0)
		{
			while (userInput < 2)
			{
				System.out.println("Please enter a number (Above 2)");
				userInput = scan.nextInt();
			}
			
			CONSTANT = userInput;
			counter = 2;
			while (counter < CONSTANT)
			{
				userInput += counter;
				counter = counter + 2;
			}
			System.out.println(userInput);
			System.out.println("Please enter another (0 to end)");
			userInput = scan.nextInt();
			
		}




	}
}


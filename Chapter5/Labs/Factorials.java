package Labs;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) 
	{
		int user;
		int count = 0;
		int factorial = 1;
		int factorialSum = 1;
		String another = "y";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a non-negative integer.");
		user = scan.nextInt();
		
		while (another.equalsIgnoreCase("y"))
		{
			if (user >= 0)
			{
				if (user == 0)
				{
					System.out.println("The Factorial of 0 is 1");
				}
				else
				{
					while (user > count)
					{
						factorialSum *= factorial;
						factorial++;
						count++;
					}
					
				}
				System.out.println("The Factorial of " + user + " is " + factorialSum);
			}
			else
			{
				System.out.println("Please enter another interger");
				user = scan.nextInt();
				
			}
			System.out.println("Would you like to scan another? (y/n)");
			scan.next();
			another = scan.nextLine();
		}
	}
}

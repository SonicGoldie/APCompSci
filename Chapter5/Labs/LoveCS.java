package Labs;

import java.util.Scanner;

//****************************************************************
//LoveCS.java
//
//Use a while loop to print many messages declaring your
//passion for computer science
//****************************************************************
public class LoveCS
{
	public static void main(String[] args)
	{
		int Limit;
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		System.out.println("How many times would you like to say that you love Computer Science?");
		Limit = scan.nextInt();
		while (count <= Limit)
		{
				sum += count;
				System.out.println( count + "I love Computer Science!!");
				count++;
		}
		if (sum <= Long.MAX_VALUE)
		{
			System.out.println("Printed this message " + (count-1) + " times.");
			System.out.println("The sum of the numbers from 1 to " + (count-1) + " is " +sum );
		}
		else
		{
			System.out.println("You love Computer Science just a bit too much");
		}
	}
}
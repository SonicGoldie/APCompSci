package Exercises;

import java.util.Scanner;

public class SixFourteen {

	public static void main(String[] args) 
	{
		int amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times would you like to print alarm?");
		amount = scan.nextInt();
		alarm(amount);
	}
	public static void alarm(int number)
	{
	 if (number < 1)
	 System.out.println("ERROR: Number is less than 1.");
	 else
	 for (int count = 1; count <= number; count++)
	 System.out.println("Alarm!");
	}

}

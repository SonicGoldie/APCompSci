package Exercises;

import java.util.Scanner;

public class SixNine {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int max, number;
		System.out.print("Enter an integer: ");
		max = scan.nextInt();
		for (int count = 2; count <= 10; count++)
		{
		 System.out.print ("Enter another integer: ");
		 number = scan.nextInt();
		 if (number > max)
		 max = number;
		}
		System.out.println("The highest value is :" + max);
	}

}

package Exercises;

import java.util.Scanner;

public class SixSix {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number;
		do
		{
			System.out.println("Please enter an even number");
			number = input.nextInt();
		}
		while (number%2 != 0);

	}

}

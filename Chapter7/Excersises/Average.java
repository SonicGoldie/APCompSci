package Excersises;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		float first = 0, second = 0, temp = 0;
		float out = 0;
		String another = "y";
		String again = "y";
		while(again.equalsIgnoreCase("y"))
		{
			System.out.println("Please input your first integer");
			first = scan.nextFloat();
			scan.nextLine();
			temp = first;
			while(another.equalsIgnoreCase("y"))
			{
				System.out.println("Please input your next integer");
				second = scan.nextFloat();
				scan.nextLine();
				temp += second;
				System.out.println("Would you like to input another integer? (y/n)");
				another = scan.nextLine();
			}
			out = temp/2;
			System.out.println("Your average is "+ out);
			System.out.println("Do you want to do this again?(y/n)");
			again = scan.nextLine();	
		}
		System.out.println("Thank you, have a nice day");
	}

}

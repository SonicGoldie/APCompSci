package Projects;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		
		
		
			System.out.println("Please Enter a Year (Type 0 to quit): ");
			year = scan.nextInt();
			while (year != 0)
			{
			if (year >= 1582)
			{
				if (year % 4 == 0 && year%100 != 0)
					System.out.println("This is a Leap Year");
				else if (year % 100 == 0 && year % 400 == 0)
					System.out.println("This is a Leap Year");
				else if (year % 4 != 0)
					System.out.println("This is not a Leap Year");
				else
					System.out.println("This is not a Leap Year");
				
			}
			else
			{
				System.out.println("This year is invalid");
				
			}
			System.out.println();
			System.out.println("Please Enter a Year (Type 0 to quit): ");
			year = scan.nextInt();
			}
			
			
			
		}
		
		
	}




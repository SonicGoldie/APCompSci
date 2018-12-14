package Projects;

import java.util.*;
public class IntList
{
	public static void main(String[]args)
	{
		final int FINAL=51;
		int[] array = new int[FINAL];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++)
		{ 
			System.out.println("Enter a number for location "+i+":");
			int n = scan.nextInt(); 
			if (n < 0 || n > 50) 
			{ 
				break;
			}
			else
				array[n]++; 
		}
		for (int i = 0; i < array.length; i++)
		{ 
			if (array[i] > 0) 
			{ 

				System.out.println(i + ": " + array[i]);
			}
		}

	}
}
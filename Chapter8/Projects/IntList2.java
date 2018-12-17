package Projects;

import java.util.Scanner;
public class IntList2
{
	public static void main(String[]args)
	{
		final int FINAL=51;
		int[] array = new int[FINAL];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < FINAL; i++)
		{
			array[i] = -50;
			
		}

		for (int i = 0; i < array.length; i++)
		{ 
			System.out.println("Enter a number for location "+i+":");
			array[i] = scan.nextInt(); 
			if (array[i] < -25 || array[i] > 25) 
			{ 
				break;
			} 
		}
		for (int i = 0; i < array.length; i++)
		{ 
			if (array[i] > -25) 
			{ 

				System.out.println(i + ": " + array[i]);
			}
		}

	}
}
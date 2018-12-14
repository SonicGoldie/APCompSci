package Projects;

import java.io.*;
import java.util.Scanner;
public class IntChart
{
	public static void main(java.lang.String[] args)
			throws IOException
	{
		Scanner scan = new Scanner (System.in);
		final int min = 1;
		final int max = 10;
		final int limit = 10;
		int[] a = new int[max];

		for (int b = 0; b < a.length; b++)
		{
			a[b] = 0;
		}

		System.out.println("Enter Number between 1 and 100: \n (Or press 0 to stop)");
		int number = scan.nextInt();

		while (number >= min && number <= (limit*max) && number != 0)
		{
			a[(number-1)/limit] = a[(number - 1 ) / limit] + 1;
			System.out.print("Please enter a value:");
			number = scan.nextInt();
		}

		System.out.println("\n__Histogram__");
		for (int y = 0; y < a.length; y++)
		{
		    System.out.print("   " + (y * limit + 1) + " - " + (y + 1) * limit + "\t");
		    for (int z = 0; z < a[y]; z++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
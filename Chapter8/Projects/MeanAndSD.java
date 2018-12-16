package Projects;

import java.util.Scanner;

public class MeanAndSD {

	static double[] input = new double[51];
	static int[] SD = new int[51];
	static double size = 0;
	static double total = 0;
	static double sdTemp = 0;
	static double  end = 0;
	static double mean = 0;
	static double SDev = 0;
	int user = 0;
	static double temp = 0;

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 49; i++)
		{
			System.out.println("Please enter a number (0 to 50)");
			temp = scan.nextInt();
			if (temp< 50 && temp> 0)
			{
				input[i] = temp;
			}
			else
				break;
		}
		System.out.println("Your numbers were: ");
		for (int i = 0; i < input.length; i++)
		{
			int check = 0;
			if (input[i] > 0 && check < 5)
			{
				System.out.print("" + input[i] + ", ");
				check++;
			}
			else
			{
				System.out.println("");
				check = 0;
				i--;
			}
		}
		System.out.println("Mean: " +getMean());
		System.out.println("Standard Deviation: " + getSD());

	}

	private static double getMean() 
	{
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] != 0)
			{
				total += input[i];
				size++;
			}

		}
		mean = (total / size);
		return mean;
	}
	private static double getSD()
	{
		size = 0;
		total = 0;
		mean = 0;
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] != 0)
			{
				total += input[i];
				size++;
			}
		}
		mean = (total / size);
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] != 0)
			{
				input[i] = (input[i] - mean) * (input[i] - mean);
			}
		}
		for (int i = 0; i < input.length; i++)
		{
			sdTemp += input[i];
		}
		System.out.println(sdTemp);
		System.out.println(size);
		SDev = (sdTemp * (1/size));
		System.out.println((sdTemp / size));
		SDev = Math.sqrt(SDev);


		return SDev;
	}

}

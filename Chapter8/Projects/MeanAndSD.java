package Projects;

import java.util.Scanner;

public class MeanAndSD {

	static int[] input = new int[51];
	int size = 0, total = 0, end = 0;
	int user = 0;
	static int temp;

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
		
	}

	private int getMean(int user[]) 
	{
		for (int i = 0; i < input.length; i++)
		{
			user[i] = input[i];
		}
		for (int i = 0; i < user.length; i++)
		{
			if (user[i] != 0)
			{
				total += user[i];
				size++;
			}

		}
		end = (total / size);
		return end;
	}
	private int getSD(int user[])
	{
		for (int i = 0; i < input.length; i++)
		{
			
		}
		return end;
	}

}

package Exercises;

public class SixFifteen 
{
	public static void main(String [] args)
	{
		System.out.println(sum100());
	}
	public static int sum100()
	{
	 int sum = 0;
	 for (int count = 1; count <= 100; count++)
	 sum += count;
	 return sum;
	}
}

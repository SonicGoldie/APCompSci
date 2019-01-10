package Exercises;

public class SixSixteen 
{

	public static void main(String[] args) 
	{
		System.out.println(sumRange(7,77));
	}
	public static int sumRange(int begin, int end)
	{
	 int total = 0;
	 if (end < begin)
	 System.out.println("ERROR: Invalid Range");
	 else
	 for (int num = begin; num <= end; num++)
	 total += num;
	 return total;
	}

}

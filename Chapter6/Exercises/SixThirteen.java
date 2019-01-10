package Exercises;

public class SixThirteen {

	public static void main(String[] args) 
	{
		powersOfTwo();
	}
	public static void powersOfTwo()
	{
	 int num = 2;
	 for (int power = 1; power <= 10; power++)
	 {
	 num *= 2;
	 System.out.println(num);
	 }
	}

}

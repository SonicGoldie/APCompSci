package Exercises;

public class SixSeventeen {

	public static void main(String[] args) 
	{
		System.out.println(countA("The Overwatch Team meets in Slata's Room during Enhancement"));
	}
	public static int countA(String text)
	{
		int counter = 0;
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) == 'A' || text.charAt(i) == 'a')
				counter++;
		return counter;
	}
}

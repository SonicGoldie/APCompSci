package Exercises;

public class SixTen 
{
	public static void main(String [] args)
	{
		String name = "Slata";
		int count = 0;
		for (int index = 0; index < name.length(); index++)
			if (name.charAt(index) == 'a')
				count++;
		System.out.println("The character \'a\' appears "
				+ count + " time(s)");
	}
}

package Exercises;

public class SixTwelve 
{
	public static void main(String [] args)
	{
		String word = "supercalifragilisticexpialidocious";
		for (int index = 0; index < word.length(); index +=2)
			 System.out.println(word.charAt(index));
	}
}

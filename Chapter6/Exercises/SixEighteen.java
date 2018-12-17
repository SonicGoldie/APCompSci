package Exercises;

public class SixEighteen {

	public static void main(String[] args) 
	{
		System.out.println(reverse("supercalifragilisticexpialidocious"));
	}
	public static String reverse(String str)
	{
		String output = "";
		for (int i = str.length()-1; i >= 0; i--)
			output += str.charAt(i);
		return output;
	}

}

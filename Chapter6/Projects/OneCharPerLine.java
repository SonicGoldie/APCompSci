package Projects;

import java.util.Scanner;

public class OneCharPerLine {

	public static void main(String[] args) 
	{
		String Input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		Input = scan.nextLine();
		for(int i = 0; Input.length() > i; i++)
		{
			System.out.println(Input.charAt(i));
		}
	}

}

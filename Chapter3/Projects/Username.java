package Projects;

import java.util.Random;
import java.util.Scanner;

public class Username {

	public static void main(String[] args) 
	{
		String FFname;
		String LLname;
		// TODO Auto-generated method stub
		int randnum;
		Scanner scan = new Scanner(System.in);
		System.out.println("First Name: ");
		String fname = scan.nextLine();
		System.out.println("Last Name: ");
		String lname = scan.nextLine();
		Random generator = new Random();
		FFname = fname.substring(0, 1);
		LLname = lname.substring(0, 5);
		randnum = generator.nextInt(89) + 10;
		
		
		System.out.println("Suggested Username: " + FFname + LLname + randnum );
		
	}

}

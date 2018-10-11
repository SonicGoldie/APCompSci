package Projects;

import java.util.Scanner;

public class Intergers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double Average;
		int Number1, Number2, Number3;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give me a number");
		Number1 = read.nextInt();
		
		System.out.println("Give me another number");
		Number2 = read.nextInt();
		
		System.out.println("Give me ONE more number");
		Number3 = read.nextInt();
		
		Average = (Number1 + Number2 + Number3) / 3;
		
		System.out.println("Average: " + Average);
	}

}

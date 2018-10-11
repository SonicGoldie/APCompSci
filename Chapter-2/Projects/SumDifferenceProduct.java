package Projects;

import java.util.Scanner;

public class SumDifferenceProduct {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double Number1, Number2, Sum, Difference, Product; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number with a decimal plz");
		Number1 = scan.nextDouble();
		
		System.out.println("Give me anothe number plz");
		Number2 = scan.nextDouble();
		
		System.out.println("Sum: " + (Number1 + Number2));
		System.out.println("Difference: " + (Number1 - Number2));
		System.out.println("Product: " + (Number1 * Number2));
	}

}

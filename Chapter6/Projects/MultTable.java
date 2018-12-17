package Projects;

import java.util.Scanner;
public class MultTable {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int max = 12;   
		for (int i = 1; i <= max; i++){
			for (int j = 1; j <= max; j++){
				System.out.print (i*j + "   ");
			}
			System.out.println ();
		}   
	}
}

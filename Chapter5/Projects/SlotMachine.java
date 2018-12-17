package Projects;
import java.util.Scanner;
import java.util.Random;


public class SlotMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args)  
	{
		String answer = "y";
		int num1;
		int num2;
		int num3;
		
		Random generator = new Random(); // random generator
		Scanner scan = new Scanner (System.in); // scanner class
		
		System.out.println("Would you like to play the slot machine?(y/n): ");
		answer = scan.nextLine();
		
		while(answer.equalsIgnoreCase("y"))
		{
			num1 = generator.nextInt(10); // generates a random number
		    num2 = generator.nextInt(10);
		    num3 = generator.nextInt(10);
		
		    System.out.println("The three numbers of the slot machine are: " + num1+num2+num3);
		   
		    if(num1 == num2 && num2 == num3)
		       {
		    	System.out.println("JACKPOT! All three of the same");
		       }
		    
		    else if(num1 == num2 || num1 == num3 || num2 == num3 ) 
		       {
		    	System.out.println("Close, you got two of the same!!");
		       }
		    else
		       {
		    	System.out.println("Not a winner");
		       }
		    
		    System.out.print("Try again?(y/n): ");
		    answer = scan.nextLine();
		    System.out.println();
		}
		
		
		System.out.println("Bye!!");
		
	}

}


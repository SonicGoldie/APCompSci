package Projects;

import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What school do you go to?");
		String college = scan.nextLine();
		
		System.out.println("What is your pets name?");
		String petname = scan.nextLine(); 
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years \nold. I'm enjoying my time at " + college + ", though \nI miss my pet " + petname + " very much!");
	}

}

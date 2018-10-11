package SnowmanMaker;

import java.io.IOException;
import java.util.Scanner;


public class SnowmanQuestions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = scan.next();
		System.out.println("Your name is " + name + ", hello");
		
		try {
			Process p = Runtime.getRuntime().exec("D:\\Games\\Retroarch\\retroarch.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	

}

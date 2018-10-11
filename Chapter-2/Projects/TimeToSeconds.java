package Projects;

import java.util.Scanner;

public class TimeToSeconds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Hours:");
        int Hours = scan.nextInt();
        
        System.out.println("Enter Minutes:");
        int Minutes = scan.nextInt();
        
        System.out.println("Enter Seconds:");
        int Seconds = scan.nextInt();

        System.out.println("Total Seconds" + ((Hours * 3600) + (Minutes * 60) + Seconds) );

    }
}
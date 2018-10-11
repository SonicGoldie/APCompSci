package Projects;

import java.util.Scanner;

public class CoinsInAJar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number of quarters:");
        int Quarters = scan.nextInt();

        System.out.println("Enter the Number of dimes:");
        int Dimes = scan.nextInt();

        System.out.println("Enter the Number of nickles:");
        int Nickles = scan.nextInt();

        System.out.println("Enter the Number of pennies:");
        int Pennies = scan.nextInt();

        double money = (Quarters * 0.25) + (Dimes * 0.1) + (Nickles * 0.05) + (Pennies * 0.01);

        System.out.println("That is $" + money);
    }
}
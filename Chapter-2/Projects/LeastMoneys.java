package Projects;

import java.util.Scanner;

public class LeastMoneys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much money?");
        double totalMoney = scan.nextDouble();

        int Hundred = 0;
        int Fifty = 0;
        int Ten = 0;
        int Five = 0;
        int One = 0;
        int Quarter = 0;
        int Dime = 0;
        int Nickle = 0;
        int Pennie = 0;

        while (totalMoney - 100 > 0) {
            totalMoney -= 100;
            Hundred++;
        }

        while (totalMoney - 50 > 0) {
            totalMoney -= 50;
            Fifty++;
        }

        while (totalMoney - 10 > 0) {
            totalMoney -= 10;
            Ten++;
        }

        while (totalMoney - 5 > 0) {
            totalMoney -= 5;
            Five++;
        }

        while (totalMoney - 1 > 0) {
            totalMoney -= 1;
            One++;
        }

        while (totalMoney - 0.25 > 0) {
            totalMoney -= 0.25;
            Quarter++;
        }

        while (totalMoney - 0.10 > 0) {
            totalMoney -= 0.10;
            Dime++;
        }

        while (totalMoney - 0.05 > 0) {
            totalMoney -= 0.05;
            Nickle++;
        }

        while (totalMoney - 0.01 > 0) {
            totalMoney -= 0.01;
            Pennie++;
        }

        if (Hundred > 0) {
            System.out.println("Hundreds: " + Hundred);
        }

        if (Fifty > 0) {
            System.out.println("Fifties: " + Fifty);
        }

        if (Ten > 0) {
            System.out.println("Tens: " + Ten);
        }

        if (Five > 0) {
            System.out.println("Fives: " + Five);
        }

        if (One > 0) {
            System.out.println("Ones: " + One);
        }

        if (Quarter > 0) {
            System.out.println("Quarters: " + Quarter);
        }

        if (Dime > 0) {
            System.out.println("Dimes: " + Dime);
        }

        if (Nickle > 0) {
            System.out.println("Nickles: " + Nickle);
        }

        if (Pennie > 0) {
            System.out.println("Pennies: " + Pennie);
        }
    }
}
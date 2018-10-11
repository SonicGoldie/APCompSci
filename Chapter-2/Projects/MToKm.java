package Projects;

import java.util.Scanner;

public class MToKm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Miles: ");
        double Miles = scan.nextDouble();

        double Kilometers = (Miles * 1.60935);

        System.out.println("Kilometers: :" + Kilometers + " km");
    }
}
package Projects;

import java.util.Scanner;

public class FracToDeci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        float numerator = scan.nextInt();

        System.out.println("Enter the denominator: ");
        float denominator = scan.nextInt();

        System.out.println(numerator / denominator);
    }
}
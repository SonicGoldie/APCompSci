package Projects;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit Temperature:");
        double FahrenheitTemp = scan.nextDouble();

        double CelsiusTemp = (FahrenheitTemp - 32.0) * (5.0 / 9.0);

        System.out.println("Celsius Temperature:" + CelsiusTemp + " C");
    }
}
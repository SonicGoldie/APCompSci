package Projects;

import java.util.Scanner;

public class TimedTrip {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Speed in MPH:");
        double Speed = scan.nextDouble();

        System.out.println("Enter the Distance you traveled:");
        double Distance = scan.nextDouble();

        double Time = Distance / Speed;

        System.out.println("It took you " + Time + " hours to get from point A to point B.");
    }
}

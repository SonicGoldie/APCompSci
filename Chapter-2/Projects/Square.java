package Projects;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = scan.nextInt();

        System.out.println("Area: " + (side * side));
        System.out.println("Perimeter: " + (side * 4));
    }
}
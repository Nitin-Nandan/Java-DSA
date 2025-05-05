package Operator_and_Expressions;

// Calcuate Area and Volume of Cuboid. Dimensions are user input.

import java.util.Scanner;

public class Cuboid {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter length, breadth & height: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float h = sc.nextFloat();

        float totalArea = 2 * (l * b + h * b + h * l);
        float volume = l * b * h;

        System.out.println("Area: " + totalArea + "\nVolume: " + volume);
        sc.close();
    }
}

package Operator_and_Expressions;

// Finding roots of a quadratic equations whose coefficients are user inputs.

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nForm of Quadratic Equation: ax^2 + bx + c");
        System.out.print("Enter values of a, b, c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float r1 = (-b + (float) Math.sqrt(b*b - 4*a*c)) / (2*a);
        float r2 = (-b - (float) Math.sqrt(b*b - 4*a*c)) / (2*a);
    
        System.out.println("Roots: " + r1 + " and " + r2);
        sc.close();
    }
}

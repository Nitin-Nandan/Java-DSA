// Calculate area of triangle using two formulas: 1/2 x base x height and Heron's Formula.
// Take sides from user.

import java.util.Scanner;

public class Calculate_Area {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AREA USING BASE HEIGHT FORMULA -");
        System.out.print("Enter base and height respectively: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float area = base * height / 2;
        System.out.println("Area: " + area);

        System.out.println("\nAREA USING HERON'S FORMULA -");
        System.out.print("Enter all sides of Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float s = (a + b + c) / 2f;
        area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        sc.close();
    }
}
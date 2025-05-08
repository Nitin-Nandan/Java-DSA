package Conditional_Statements;

// Find radix of a number given as string.
// If number = 1010101010 => radix = 2

import java.util.Scanner;

public class Radix {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nValid Numbers: Binary, Octal, Decimal & Hexadecimal");
        System.out.print("Enter a valid number: ");
        String num = sc.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Binary | Radix = 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal | Radix = 8");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal | Radix = 10");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal | Radix = 16");
        } else {
            System.out.println("Please enter a valid number");
        }

        sc.close();
    }
}

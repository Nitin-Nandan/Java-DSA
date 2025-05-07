package Conditional_Statements;

// Check if a user entered number is odd or even.

import java.util.Scanner;

public class Odd_Even {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is EVEN.");
        } else {
            System.out.println(num + " is ODD.");
        }
        sc.close();
    }
}

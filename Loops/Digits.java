//package Loops;

// Display digits of a user-entered number and number of digits.

import java.util.Scanner;

public class Digits {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num, sum = 0;
        System.out.println("Digits -");
        while (tempNum > 0) {
            System.out.println(tempNum % 10);
            sum += 1;
            tempNum = tempNum / 10;
        }
        System.out.println("Number of digits: " + sum);
        sc.close();
    }
}

// Print fibonacci sequence till the user-entered terms.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms of Fibonacci sequence : ");
        int terms = sc.nextInt();
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Sequence till term " + terms);
        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + "    ");
            int temp = num2;
            num2 = num2 + num1;
            num1 = temp;
        }
        sc.close();
    }
}

// Check if a user-entered number is Armstrong number or not.
// If the sum of cube of digits of a number is equal to the number itself.

import java.util.Scanner;

public class Armstrong {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        int tempNum = num, sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            sum += (digit * digit * digit);
            tempNum = tempNum / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}

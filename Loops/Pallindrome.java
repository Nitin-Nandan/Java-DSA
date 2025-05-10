// Reverse a user-entered number. Then check if it's a pallindrome.

import java.util.Scanner;

public class Pallindrome {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        int tempNum = num, revNum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            revNum = revNum * 10 + digit;
            tempNum = tempNum / 10;
        }

        System.out.println("The reverse of " + num + " is : " + revNum);

        if (num == revNum) {
            System.out.println(num + " is a pallindrome.");
        } else {
            System.out.println(num + " is NOT a pallindrome.");
        }
        sc.close();
    }
}

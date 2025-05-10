// Display user-entered numbers in words.
// Example: 4906 - Four Nine Zero Six

import java.util.Scanner;

public class Number_in_Words {

    static void displayWords(String number) {
        switch (number) {
            case "0":
                System.out.print("Zero ");
                break;
            case "1":
                System.out.print("One ");
                break;
            case "2":
                System.out.print("Two ");
                break;
            case "3":
                System.out.print("Three ");
                break;
            case "4":
                System.out.print("Four ");
                break;
            case "5":
                System.out.print("Five ");
                break;
            case "6":
                System.out.print("Six ");
                break;
            case "7":
                System.out.print("Seven ");
                break;
            case "8":
                System.out.print("Eight ");
                break;
            case "9":
                System.out.print("Nine ");
                break;
            default:
                System.out.print("Nil ");
                break;

        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        long num = sc.nextLong();
        String stringNum = String.valueOf(num);
        String digits[] = stringNum.split("");

        for (int i = 0; i < digits.length; i++) {
            displayWords(digits[i]);
        }

        sc.close();
    }
}

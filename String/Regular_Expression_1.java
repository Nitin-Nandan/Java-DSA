package String;

// Find if user-entered string is Binary.
// Find if user-entered string is hexa decimal.
// Find if user-entered date string is of the form (dd/mm/yyyy).

import java.util.Scanner;

public class Regular_Expression_1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter binary number: ");
        String binary = sc.nextLine();
        System.out.print("Enter hexa-decimal number: ");
        String hex = sc.nextLine();
        System.out.print("Enter date as dd/mm/yyyy: ");
        String date = sc.nextLine();
        
        System.out.println("");

        if (binary.matches("[01]+")) {
            System.out.println(binary + " is a binary number.");
        } else {
            System.out.println(binary + " is NOT a binary number.");
        }

        if (hex.matches("[0-9a-fA-F]+")) {
            System.out.println(hex + " is a hexa-decimal number.");
        } else {
            System.out.println(hex + " is NOT a hexa-decimal number.");
        }

        if (date.matches("[0123][0-9]/[01][0-9]/\\d{4}")) {
            System.out.println(date + " is a valid date.");
        } else {
            System.out.println(date + " is NOT a valid date.");
        }

        sc.close();
    }
}

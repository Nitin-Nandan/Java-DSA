package Conditional_Statements;

// Classify a person as young aor not young using user entered age.
// 18-59: Young ; Else not young

import java.util.Scanner;

public class Age {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid age: ");
        int age = sc.nextInt();

        if (age >= 18 && age < 60) {
            System.out.println("YOUNG");
        } else if ((age < 18 && age > 0) || age >= 60) {
            System.out.println("NOT YOUNG");
        } else {
            System.out.println("Please enter a valid age.");
        }

        sc.close();
    }
}

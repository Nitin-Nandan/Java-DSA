package Conditional_Statements;

// Find grade according to average of three subject marks, which is user-entered.
// avg>=70 : A, 60<= avg <70 : B, 50<= avg < 60 : C, 40<= avg < 50: D, avg<40 : F

import java.util.Scanner;

public class Grade {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Marks: 100");
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int mat = sc.nextInt();
        float avg = (phy + chem + mat) / 3f;

        if (avg >= 70 && avg <= 100) {
            System.out.println("Grade: A");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade: B");
        }
        else if (avg >= 50 && avg < 60) {
            System.out.println("Grade: C");
        }
        else if (avg >= 40 && avg < 50) {
            System.out.println("Grade: D");
        }
        else if (avg < 40) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Please enter valid Marks.");
        }

        sc.close();
    }
}

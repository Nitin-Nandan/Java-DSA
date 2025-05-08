package Conditional_Statements;

// Create a Simple Menu Program without GUI to perform ADD, SUB, MUL, DIV

import java.util.Scanner;

public class Menu {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :\nADD\nSUB\nMUL\nDIV");
        System.out.print("Enter two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        sc.nextLine(); // Clear input buffer.
        System.out.print("Enter menu option in words: ");
        String option = sc.nextLine();
        option = option.toUpperCase();

        switch (option) {
            case "ADD":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "SUB":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "MUL":
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case "DIV":
                if (num2 == 0) {
                    System.out.println("Divide by 0");
                    break;
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                }
            default:
                System.out.println("Please enter a valid Menu option.");
                break;
        }
        sc.close();
    }
}

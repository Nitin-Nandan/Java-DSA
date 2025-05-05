package Operator_and_Expressions;

// Swapping two numbers using XOR.

public class Swapping {
    public static void main(String arg[]) {
        int a = 9, b = 12;
        System.out.println("\nBefore swapping: a=" + a + ", b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping: a=" + a + ", b=" + b);
    }
}

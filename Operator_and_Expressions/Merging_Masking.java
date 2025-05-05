package Operator_and_Expressions;

// Storing two 4-bits number in a singe byte variable.

public class Merging_Masking {
    public static void main(String arg[]) {
        byte a = 9, b = 10, c;
        c = (byte) (a << 4); // implicit type conversion to int by Left Shift
        c = (byte) (c | b); // implicit type conversion to int by OR
        System.out.println("\nBoth numbers using byte variable are:");
        System.out.println("a = " + ((c & 0b11110000) >> 4) + " and b = " + (c & 0b00001111));
    }
}

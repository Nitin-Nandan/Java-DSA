package Arrays;

// Demonstrate insertion and deletion operation on an array.

import java.util.Scanner;

public class Insert_Delete {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int capacity = 6;
        System.out.println("Original Array :");
        for (int x : A) {
            System.out.print(x + "  ");
        }

        System.out.println("Inserting 3 at index 2 ....");
        if (capacity == A.length) {
            System.out.println("Array is full.");
        } else {
            for (int i = capacity; i > 2; i--) {
                A[i] = A[i - 1];
            }
            A[2] = 3;
            capacity++;
        }
        System.out.println("Inserted :");
        for (int x : A) {
            System.out.print(x + "  ");
        }

        System.out.println("Deleting 9 from index 1 ...");
        if (capacity == 0) {
            System.out.println("Array is empty.");
        } else {
            for (int i = 1; i < capacity; i++) {
                A[i] = A[i + 1];
            }
            capacity--;
        }
        System.out.println("Deleted :");
        for (int x : A) {
            System.out.print(x + "  ");
        }
        sc.close();
    }
}

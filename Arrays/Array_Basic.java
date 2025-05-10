package Arrays;

// Do the following operations on an array:
// Find sum, search an element, find maximum element, find second largest element.

import java.util.Scanner;

public class Array_Basic {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum : " + sum);

        System.out.print("Enter element to search : ");
        int toSearch = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (toSearch == arr[i]) {
                System.out.println(toSearch + " found at index " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println(toSearch + " not found.");
        }

        int largest = arr[0];
        for (int x : arr) {
            if (x > largest) {
                largest = x;
            }
        }
        System.out.println("Maximum element : " + largest);

        int secondLargest = arr[0];
        for (int x : arr) {
            if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }
        System.out.println("Second largest element : " + secondLargest);

        sc.close();
    }
}

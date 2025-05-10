package Arrays;

// Demonstrate rotation of an array.
// Rotate left: Shift all elements to left by one place.
// Rotate right: Shift all elements to right by one place.

public class Array_Rotation {
    public static void main(String arg[]) {
        int arr[] = { 5, 9, 6, 10, 12, 7, 3, 5, 4, 2 };
        int leftShift[] = arr.clone();
        int rightShift[] = arr.clone();

        System.out.println("Original Array : ");
        for (int x : arr) {
            System.out.print(x + "  ");
        }

        // For rotate left
        int temp = leftShift[0];
        for (int i = 0; i < leftShift.length - 1; i++) {
            leftShift[i] = leftShift[i + 1];
        }
        leftShift[leftShift.length - 1] = temp;
        System.out.println("\nRotate left : ");
        for (int x : leftShift) {
            System.out.print(x + "  ");
        }

        // For rotate right
        temp = rightShift[rightShift.length - 1];
        for (int i = rightShift.length - 1; i > 0; i--) {
            rightShift[i] = rightShift[i - 1];
        }
        rightShift[0] = temp;
        System.out.println("\nRotate right : ");
        for (int x : rightShift) {
            System.out.print(x + "  ");
        }

    }
}

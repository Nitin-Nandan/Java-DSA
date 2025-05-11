package Methods;

// Demonstrate variable arguments.

public class Max_and_Sum {

    static void max_sum(int... x) {
        int sum = 0, max = x[0];
        for (int a : x) {
            if (a > max) {
                max = a;
            }
            sum += a;
        }
        System.out.println("Max element : " + max);
        System.out.println("Sum of elements : " + sum);
    }

    public static void main(String arg[]) {
        max_sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        max_sum(46, 49, 23, 45, 89, 92);
    }
}

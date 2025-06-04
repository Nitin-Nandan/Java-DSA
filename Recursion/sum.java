public class sum {
    static void sumOfNumbers(int num, int sum) {
        if(num == 0) {
            System.out.println("Sum: " + sum);
            return;
        }
        sum = sum + num;
        sumOfNumbers(num - 1, sum);
    }

    static void giveSum(int i, int n, int sum) {
        if(i>n) {
            System.out.println("Sum: " + sum);
            return;
        }

        sum += i;
        giveSum(i+1, n, sum);
    }

    static int calculateSum(int i, int n, int sum) {
        if(i>n) {
            return 0;
        }
        sum = calculateSum(i+1, n, sum);
        sum += i;
        return sum;
    }

    public static void main(String arg[]) {
        int sum = 0;
        sumOfNumbers(5, sum);
        giveSum(1, 100, sum);
        System.out.println(calculateSum(1, 5, sum));
    }
}

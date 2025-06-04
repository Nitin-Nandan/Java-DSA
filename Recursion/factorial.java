public class factorial {
    static void printFactorial(int num, int factorial) {
        if(num == 0) {
            System.out.println(factorial);
            return;
        }
        factorial *= num;
        printFactorial(num-1, factorial);
    }

    static int giveFactorial(int num, int factorial) {
        if(num == 0) {
            return 1;
        }
        factorial = giveFactorial(num-1, factorial);
        factorial *= num;
        return factorial;
    }
    
    public static void main(String arg[]) {
        int factorial = 1;
        printFactorial(5, factorial);
        if(giveFactorial(5, factorial) == -1) {
            System.out.println("An error occured, try again later.");
        } else {
            System.out.println(giveFactorial(5, factorial));
        }
    }
}

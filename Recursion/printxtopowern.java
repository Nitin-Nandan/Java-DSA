public class printxtopowern {
    static void printStack(int x, int n, int product) {
        if(x == 0) {
            System.out.println(x);
            return;
        }
        if(n == 0) {
            System.out.println(product);
            return;
        }
        product *= x;
        printStack(x, n-1, product);
    }

    static int givePower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int xPow1 = givePower(x, n-1);
        int xPow = x * xPow1;
        return xPow;
    }
    
    public static void main(String arg[]) {
        int product = 1;
        printStack(3, 2, product);
        System.out.println(givePower(2, 2));
    }
}

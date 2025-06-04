public class demo {
    
    static void printNumber(int num) {
        if(num == 0)
            return;

        System.out.println(num);
        printNumber(num - 1);
        //System.out.println(num);
    }
    public static void main(String arg[]) {
        printNumber(5);
    }
}
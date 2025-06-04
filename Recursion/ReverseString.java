public class ReverseString {
    public static void printReverse(String str) {
        if(str == null || str.length() == 0) {
            return;
        }

        // Print last character
        System.out.print(str.charAt(str.length() - 1));

        // Reversing every character except last
        printReverse(str.substring(0, str.length() - 1));
    }
    
    public static void main(String arg[]) {
        printReverse("HELLO");
    }
}

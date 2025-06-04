import java.util.Stack;

public class StackUsingCollectionFramework {
    public static void main(String arg[]) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        while(myStack.isEmpty() == false) {
            System.out.println(myStack.peek());
            myStack.pop();
        }
    }
}

import java.util.*;

public class StackUsingArrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    
    public static void main(String arg[]) {
        Stack myStack = new Stack();
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

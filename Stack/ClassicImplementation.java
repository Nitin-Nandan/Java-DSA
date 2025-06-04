class Stack {
    public Node head;

    public class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }
}

public class ClassicImplementation {
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
import java.util.*;
public class ReverseALinkedList {

    public static void reverseIterate() {
        
    }
    public static void main(String arg[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("this");
        list.add("is");
        list.add("a");
        list.add("list");

        Collections.reverse(list);

        list.forEach(value -> System.out.print(value + " -> "));
        System.out.println("NULL");
    }
}

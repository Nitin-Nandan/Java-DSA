package CollectionFramework;

import java.util.*;

public class LinkedList_Question_1 {
    public static void main(String arg[]) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Zara");
        myLinkedList.add("Nitin");
        myLinkedList.add("Ajay");

        myLinkedList.addFirst("Shivali");
        myLinkedList.addLast("Shreyas");

        System.out.println("Final list: " + myLinkedList);
    }
}

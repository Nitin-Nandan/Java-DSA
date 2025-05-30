package CollectionFramework;

import java.util.*;

public class LinkedList_Question_2 {
    public static void main(String arg[]) {
        LinkedList<Integer> myLinkedList = new LinkedList<>(List.of(10, 20, 30, 40));
        System.out.println("Reverse list : " + reverseLinkedList(myLinkedList));
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        ListIterator<Integer> it1 = list.listIterator(list.size());
        while(it1.hasPrevious()) {
            reverseList.add(it1.previous());
        }
        return reverseList;
    }
}

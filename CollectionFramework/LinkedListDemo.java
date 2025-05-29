package CollectionFramework;

import java.util.*;

public class LinkedListDemo {
    public static void main(String arg[]) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        ll1.add(10);
        ll1.add(0, 5);
        ll1.addAll(ll2);
        if(ll1.containsAll(ll2)){
            System.out.println("Linked list 2 is part of linked list 1.");
        }
        else {
            System.out.println("Linked list 2 is NOT part of linked list 1");
        }
        for(ListIterator<Integer> l1 = ll1.listIterator(ll1.indexOf(60)); l1.hasNext(); ) {
            System.out.print(l1.next() + "  ");
        }
    }
}

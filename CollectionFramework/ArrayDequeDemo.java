package CollectionFramework;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String arg[]) {
        ArrayDeque<Integer> d = new ArrayDeque<>(List.of(10, 20, 30, 40, 50));
        d.offerFirst(5);
        d.offerLast(55);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d);
    }
}

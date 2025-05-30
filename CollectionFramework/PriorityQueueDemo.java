package CollectionFramework;

import java.util.*;

class MyComp implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2) 
            return 1;
        if(o1 > o2)
            return -1;
        return 0;
    }
}

public class PriorityQueueDemo {
    public static void main(String arg[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
    }
}

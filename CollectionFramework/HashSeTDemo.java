package CollectionFramework;

import java.util.*;

public class HashSeTDemo {
    public static void main(String arg[]) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
        System.out.println(hs.size());
    }
}

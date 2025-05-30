package CollectionFramework;

import java.util.*;
import java.util.Map.*;

public class TreeMapDemo {
    public static void main(String arg[]) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        tm.put(6, "G");
        tm.put(4, "E");
        tm.put(5, "F");

        System.out.println(tm.ceilingEntry(5).getValue());
        
        Entry<Integer, String> e = tm.firstEntry();
        
        System.out.println(e.getValue());

        System.out.println(tm);

        for(int i=0; i<=tm.lastKey(); i++) {
            System.out.print(tm.get(i) + "  ");
        }
    }
}

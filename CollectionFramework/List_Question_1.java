package CollectionFramework;

import java.util.*;

public class List_Question_1 {
    public static void main(String arg[]) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("ArrayList without even numbers are:\n" + removeEvenNumbers(myList));
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) { // Front traversal will create index shifting issue.
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }
}

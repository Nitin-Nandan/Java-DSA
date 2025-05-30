package CollectionFramework;

import java.util.*;

public class List_Question_3 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(List.of(4, 2, 2, 3, 4, 1, 5, 1));
        ArrayList<Integer> result = removeDuplicatesAndSort(input);
        System.out.println("Unique elements in insertion order: " + result);
    }

    public static ArrayList<Integer> removeDuplicatesAndSort(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(Integer x: list) {
            if(uniqueList.contains(x) == false) {
                uniqueList.add(x);
            }
        }
        return uniqueList;
    }
}

package CollectionFramework;

import java.util.*;

public class List_Question_2 {
    public static void main(String arg[]) {
        ArrayList<String> myList = new ArrayList<>(List.of("madam", "car", "racecar", "apple", "noon"));
        System.out.println("List of Pallindromes : " + checkPallindrome(myList));
    }

    public static ArrayList<String> checkPallindrome(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for(String word : list) {
            String rev = new StringBuilder(word).reverse().toString();
            if(word.equals(rev)) {
                newList.add(word);
            }
        }
        return newList;
    }
}

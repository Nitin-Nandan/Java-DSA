// Write a Java method that takes a list of words (strings) and returns a new list containing the unique words in the order they first appeared.

import java.util.*;

public class UniqueWords {

    public static List<String> getUniqueWords(List<String> words) {
        /* Old solution: inefficient for large lists
        List<String> uniqueList = new ArrayList<>();
        for(String word: words) {
            if(uniqueList.contains(word) == false) {
                uniqueList.add(word);
            }
        }
        return uniqueList;
        */

        // Optimized solution: Use LinkedHashSet, maintains order of insertion and avoids duplicates.
        LinkedHashSet<String> uniqueList = new LinkedHashSet<>(words);
        return new ArrayList<>(uniqueList);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        List<String> result = getUniqueWords(input);
        System.out.println(result);
    }
}

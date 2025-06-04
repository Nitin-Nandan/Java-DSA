import java.util.*;

public class TopKFrequentWords {

    public static List<String> topKFrequent(List<String> words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word: words) { // Count frequencies
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        
        return null;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("i", "love", "leetcode", "i", "love", "coding");
        int k = 2;
        List<String> result = topKFrequent(words, k);
        System.out.println(result); // Expected Output: ["i", "love"]
    }
}

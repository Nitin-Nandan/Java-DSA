package CollectionFramework;

import java.util.*;

public class LinkedList_Question_3 {
    public static void main(String[] args) {
        LinkedList<Integer> input1 = new LinkedList<>(List.of(1, 2, 3, 2, 1));
        LinkedList<Integer> input2 = new LinkedList<>(List.of(1, 2, 3, 4));

        System.out.println("Is input1 palindrome? " + isPalindrome(input1));  // true
        System.out.println("Is input2 palindrome? " + isPalindrome(input2));  // false
    }

    public static boolean isPalindrome(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for(Integer x: list) {
            reverseList.addFirst(x);
        }
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) != reverseList.get(i)) { // Objects.equals(list.get(i), reverseList.get(i)) == false is a better if condition for handling null values.
                return false;
            }
        }
        return true;
    }
}

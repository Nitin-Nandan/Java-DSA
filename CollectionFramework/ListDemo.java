package CollectionFramework;

import java.util.*;

public class ListDemo {
    public static void main(String arg[]) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        ArrayList<Integer> al3 = new ArrayList<>(List.of(6, 7, 8, 9));

        al1.add(10); // Add element in the end.
        al1.add(0, 5); // Add element at specified index.
        
        al1.addAll(al2); // Add another colllection at the end.
        al1.addAll(1, al3); // Add another collection at the specified index.

        //al1.clear(); // Empties the list.

        System.out.println(al1.contains(50)); // Check for presence of an object.
        System.out.println(al1.containsAll(al2)); // Check for presence of another List.

        al1.add(5, 70);
        System.out.println(al1.indexOf(70)); // Index of the objects first apperance.

        al1.remove(al1.indexOf(70)); // Removes element from specified index.

        al1.set(4, 100); // Replace old element at index with new element.

        System.out.println(al1.size()); // Current size of list.

        System.out.println(al1);

        System.out.println("\nUsing for loop:");

        for(int i=0; i<al1.size(); i++) { // Displaying elements one-by-one using for loop.
            System.out.print(al1.get(i) + "  ");
        }

        System.out.println("\n\nUsing for-each loop:");

        for(var x: al1){ // Displaying elements one-by-one using for-each loop.
            System.out.print(x + "  ");
        }

        System.out.println("\n\nUsing iterator:");

        Iterator<Integer> it = al1.iterator(); // it is now holding reference of first element.
        while(it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

        System.out.println("\n\nBackward access using ListIterator:");

        ListIterator<Integer> lit = al1.listIterator(al1.size() - 1); // it is now holding reference of last element.
        while(lit.hasPrevious()) {
            System.out.print(lit.previous() + "  ");
        }

        System.out.println("\n\nAccess using ListIterator from element 70:");

        ListIterator<Integer> lit2 = al1.listIterator(al1.indexOf(70));
        while(lit2.hasNext()) {
            System.out.print(lit2.next() + "  ");
        }

        System.out.println("\n\n");

        al1.forEach(num -> {
            System.out.print(num + "  ");
        });
    }
}

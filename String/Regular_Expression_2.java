package String;

// Remove special characters from a String.
// Remove extra spaces from String.
// Find number of words in a String.

public class Regular_Expression_2 {
    public static void main(String arg[]) {
        String str1 = "a!b@c#1$2%3";
        str1 = str1.replaceAll("\\W", "");
        System.out.println(str1);

        String str2 = "   abc       de      fgh        ijk   ";
        str2 = str2.replaceAll("\\s+", " ").trim();
        System.out.println(str2);

        String words[] = str2.split("\\s");
        System.out.println("No. of Words: " + words.length);
    }
}

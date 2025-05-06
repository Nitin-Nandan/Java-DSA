package String;

// Check if user entered email is on gmail. Then find username and domain name from email.

import java.util.Scanner;

public class String_Methods {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter e-mail: ");
        String email = sc.nextLine();
        
        if (email.matches("\\w*@gmail.[a-z]*")) {
            System.out.println(email + " is a G-Mail.");

            int indexOfAt = email.indexOf("@");
            String username = email.substring(0, indexOfAt);
            String domain = email.substring(indexOfAt+1);

            System.out.println("Username: " + username);
            System.out.println("Domain-name: " + domain);

        } else {
            System.out.println(email + " is NOT a G-Mail.");
        }
        sc.close();
    }
}

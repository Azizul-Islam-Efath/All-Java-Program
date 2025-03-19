package Projects;

import java.util.*;

public class String_Palindrom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1;

        System.out.println("ENTER A STRING : ");
        s1 = input.next();

        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if (s1.equals(s2)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");

        }

    }
}

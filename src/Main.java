import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // HashSet is using hashCode() to create an index for the item in the set.
        // Therefore, the items in the HashSet are unordered, with no duplicates.

        HashSet<String> words = new HashSet<>();
        words.add("hello");
        words.add("hello");
        words.add("bye");
        words.add("dogs");
        words.add("cats");
        words.add("ice");

        System.out.println(words.contains("hello"));   // HashSet finds the item very fast.

        for (String item : words) {
            System.out.println(item);
        }

        /*
        Person p1 = new Person("email@email.com", "G", new Position(0,1));
        Person p2 = new Person("email@email.com", "G", new Position(0,0));

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        */
    }
}
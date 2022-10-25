import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("email@email.com", "G", new Position(0,1));
        Person p2 = new Person("email@email.com", "G", new Position(0,0));

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
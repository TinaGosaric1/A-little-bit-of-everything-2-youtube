import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Item<Person> item1 = new Item<>();
        Person p1 = new Person("email@email.com", "G");
        item1.setX(p1);

        Person p2 = item1.getX();
    }
}
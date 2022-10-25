import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pair<Person, Person> pair1 = new Pair<>();
        Person p1 = new Person("email@email.com", "G");
        pair1.setX(p1);
        pair1.setY(p1);

        Person p2 = pair1.getX();

        Pair<Integer, String> pair2 = new Pair<>();
        pair2.setX(12);
        pair2.setY("My beautiful string.");

        ArrayList<Pair<Integer, String>> pairs = new ArrayList<>();
        pairs.add(pair2);
    }
}
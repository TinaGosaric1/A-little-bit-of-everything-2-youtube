import java.util.Objects;

public class Person {
    String email;
    String lastName;
    Position position;

    public Person(String email, String lastName, Position position) {
        this.email = email;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email) && Objects.equals(lastName, person.lastName) && Objects.equals(position, person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, lastName, position);
    }
}

import java.util.Objects;

public class Person {
    String email;
    String lastName;

    public Person(String email, String lastName) {
        this.email = email;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, lastName);
    }
}

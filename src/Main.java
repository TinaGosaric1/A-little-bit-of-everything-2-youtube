import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb"); // Inserts the element at the front of this list.
        names.push("Sue");
        names.push("Sally");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
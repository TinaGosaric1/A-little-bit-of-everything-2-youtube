import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //making stack from linked list
        try {
            Scanner scanner = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb"); // Inserts the element at the front of this list.
        names.push("Sue");
        names.push("Sally");
        String firstName = names.pop();       //Removes and returns the first element of this list.
        System.out.println(firstName);

        while(!names.isEmpty()){
            System.out.println(names.pop());
        }
    }
}
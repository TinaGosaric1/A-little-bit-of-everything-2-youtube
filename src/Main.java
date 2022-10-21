import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        //making queue from linked list
        LinkedList<String> names = new LinkedList<String>();
        names.add("Caleb");
        names.add("Sue");
        names.add("Sally");
        String firstName = names.remove();       //Retrieves and removes the first element of this list.
        System.out.println(firstName);

        while(!names.isEmpty()){
            System.out.println(names.remove());
        }
    }
}
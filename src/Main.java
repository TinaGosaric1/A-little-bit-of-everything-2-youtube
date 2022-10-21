import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src/students.txt"));

        List<String> students = new ArrayList<String>();

        while(scanner.hasNextLine()){
            students.add(scanner.nextLine());
        }

        for(String item : students){
            System.out.println("Name: " + item);
        }
        scanner.close();
    }
}
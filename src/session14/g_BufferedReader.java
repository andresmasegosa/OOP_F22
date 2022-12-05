package session14;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class g_BufferedReader {

    public static void main(String[] args) {
        Path path = Paths.get("./src/session10/names.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


        //Now Using Streams:
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            reader.lines().forEach(line -> System.out.println(line));

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


        //Exercise: Read each line and create a Student object (using map function).
        //          Finally, print out all students objects.
        //          Alternatively, collect all students objects in a list.


        try (BufferedReader reader = Files.newBufferedReader(path)) {

            List<Student> list = reader.lines().map(line ->new Student(line)).toList();

        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }



    }
}

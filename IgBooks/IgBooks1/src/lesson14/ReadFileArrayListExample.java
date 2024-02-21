package lesson13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileArrayListExample {
    public static void main(String[] args) {
        Path file = Paths.get("c://testFile.txt");
        List<String> fileArr;

        try{
            fileArr = Files.readAllLines(file);
            fileArr.stream()
                    .filter(line -> line.contains("animal"))
                    .forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println("message: " + e.getMessage());

        }
    }
}

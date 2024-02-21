package lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOFileStreamExample {
    public static void main(String[] args) {
        try(Stream<String> lines = Files.lines(Paths.get("c://testFile.txt")) ){
            lines.forEach(line -> System.out.println("lines: " + line));
        } catch(IOException e){
            System.out.println("error: " + e.getMessage());
        }
    }

}

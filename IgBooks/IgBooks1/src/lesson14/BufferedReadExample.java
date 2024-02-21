package lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample {
    public static void main(String[] args) {
        try(BufferedReader bReader = new BufferedReader(new FileReader("c://testFile.txt"))){
            bReader.lines()
                    .forEach(line -> System.out.println("line: " + line));
        } catch (IOException e){
            System.out.println("message: " + e.getMessage());
        }
    }
}

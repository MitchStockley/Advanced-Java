package lesson14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AllFileWalk {
    public static void main(String[] args) {
        try(Stream<Path> files = Files.walk(Paths.get("C:\\Users\\Mitch\\Documents\\Bootcamp resources\\advanced java\\D84838GC10_labs\\D84838GC10_labs\\labs\\14-NIO.2\\practices\\practice2\\LambdaDirectory14-02Prac"))){
            files
                    .forEach(line -> System.out.println(line));
        } catch (Exception e){
            System.out.println("Message: " + e.getMessage());
        }

    }
}

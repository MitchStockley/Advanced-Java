package Book8.chapter1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorDemo {
    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");
        MyFileVisitor visitor = new MyFileVisitor();

        try
        {
            Files.walkFileTree(start,visitor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static class MyFileVisitor extends SimpleFileVisitor <Path>
    {
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr)
        {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr)
        {
            System.out.println(file.toString() + " Could not access");
            return FileVisitResult.CONTINUE;
        }


        public FileVisitResult preVisitDirectory(Path dir) throws IOException
        {
            System.out.println(dir.toString() + "Could not access!");
            return FileVisitResult.CONTINUE;
        }
    }
}

package lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        try{
            System.out.println("Opening file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("file open");
            int data = in.read();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("quiting");
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quiting");
        }


    }
}

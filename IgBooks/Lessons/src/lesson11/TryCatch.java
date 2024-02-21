package lesson11;

import java.io.FileInputStream;
import java.io.InputStream;

public class TryCatch {
    public static void main(String[] args) {

        try{
            System.out.println("About to open file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("File open");

        } catch (Exception e){
            System.out.println("something went wrong");
        }
    }
}

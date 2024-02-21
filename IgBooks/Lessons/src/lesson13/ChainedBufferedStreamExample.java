package lesson13;

import java.io.*;

public class ChainedBufferedStreamExample {
    public static void main(String[] args) {

        try(BufferedReader bufInput = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bufOutput = new BufferedWriter(new FileWriter(args[1]))){
            String line = "";
            while((line = bufInput.readLine()) != null) {
                bufOutput.write(line);
                bufOutput.newLine();
            }
        } catch(FileNotFoundException f){
            System.out.println("File not found: " + f);
        } catch(IOException e){
            System.out.println("IOException: " + e);
        }

    }

}

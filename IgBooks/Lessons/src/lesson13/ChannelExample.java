package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelExample {
    public static void main(String[] args) {
        try(FileChannel fcIn = new FileInputStream(args[0]).getChannel();
            FileChannel fcOut = new FileOutputStream(args[1]).getChannel()){
            ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
            fcIn.read(buff);
            buff.position(0);
            fcOut.write(buff);
        } catch (FileNotFoundException f){
            System.out.println("File not found: " + f);
        } catch(IOException e){
            System.out.println("IOException: " + e);
        }
        }
    }


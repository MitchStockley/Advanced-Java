package lesson15;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ArrayListTest implements Runnable {
    private CopyOnWriteArrayList<String> wordList =
            new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayListTest test = new ArrayListTest();

        es.submit(test);
        es.submit(test);
        es.shutdown();

        try {
            es.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("==ItemList==");
        test.getArrayList().stream().forEach(
                s -> System.out.println("Item: " + s));
    }

    public void run(){
        wordList.add("A");
        wordList.add("B");
        wordList.add("C");
    }

    public CopyOnWriteArrayList<String> getArrayList(){
        return wordList;
    }
}

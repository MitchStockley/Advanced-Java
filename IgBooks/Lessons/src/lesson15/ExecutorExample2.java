package lesson15;

import java.util.concurrent.*;

public class ExecutorExample2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<String> f1 = es.submit(new CallableExample("one", 10));
        Future<String> f2 = es.submit(new CallableExample("two", 20));

        try{
            es.shutdown();
            es.awaitTermination(5, TimeUnit.SECONDS);
            String result1 = f1.get();
            System.out.println("Result of one: " + result1);
            String result2 = f2.get();
            System.out.println("result of two: " + result2);
        } catch(ExecutionException|InterruptedException ex){
            System.out.println("Exception: " + ex);
        }


    }
}

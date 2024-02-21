package lesson15;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        System.out.println("new value: " + ai.incrementAndGet());
        System.out.println("new value: " + ai.getAndIncrement());
        System.out.println("new value: " + ai.getAndIncrement());
    }
}

package Book5.chapter1.CountDownV1;

public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftoff;
        flood = new launchEvent(16, "Flood the pad!");
        ignition = new launchEvent(6, "Start the engines!");
        liftoff = new launchEvent(0, "Liftoff!");
        clock.start();

        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}

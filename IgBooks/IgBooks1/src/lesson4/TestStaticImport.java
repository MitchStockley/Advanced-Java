package lesson4;
import static java.lang.Math.*;
import static java.lang.Math.random;
public class TestStaticImport {

    public static void main(String[] args) {
        System.out.println("Random: " + random());
        System.out.println("Square root " + sqrt(50));
        System.out.println("Round " + round(random() * 50));
        System.out.println("Absolute " + abs(9));
    }
}

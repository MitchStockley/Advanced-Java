package lesson7;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");

        for(String item: set){
            System.out.println("Item: " + item);
        }
    }
}

package lesson8;

import java.util.*;

public class RoboCall06 {
    public static void main(String[] args) {
        List<Person> p1 = Person.createShortList();
        p1.forEach(Person::print);
    }
}

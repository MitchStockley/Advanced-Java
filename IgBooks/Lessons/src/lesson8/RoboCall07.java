package lesson8;


import java.util.*;

public class RoboCall07 {
    public static void main(String[] args) {
        List<Person> p1 = Person.createShortList();
        RoboCall05 robo = new RoboCall05();
        System.out.println("Calling all drivers lambda");

        p1.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
                .forEach(p -> robo.roboCall(p));
    }



}

package lesson10;

import java.util.List;
import java.util.Optional;

public class TestFlatMap {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("First CO Bonus");


        System.out.println(eList.stream()

                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e-> e.getState().equals("CO"))
                .findFirst()
                .flatMap(e -> Optional.of(e.getSummary()))
                .orElse("No match found"));



    }
}

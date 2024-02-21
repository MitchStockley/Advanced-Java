package lesson10;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class TestAverage {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();


        OptionalDouble result2 = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.println("name: " + e.getGivenName() + " surname: " + e.getSurName()))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("Total salary: $%,6.2f %n", e))
                .average();

        System.out.printf("average bonuses paid: $%,6.5f %n", result2.getAsDouble());
    }
}

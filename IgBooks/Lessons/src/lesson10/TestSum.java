package lesson10;

import java.util.List;

public class TestSum {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        double result;

        result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .sum();

        System.out.printf("Total bonuses paid: $%,6.5f %n", result);

        System.out.println("CO bonus details");

        double result2;

        result2 = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.println("name: " + e.getGivenName() + " surname: " + e.getSurName()))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("Total salary: $%,6.2f %n", e))
                .sum();

        System.out.printf("Total bonuses paid: $%,6.5f %n", result2);


    }
}

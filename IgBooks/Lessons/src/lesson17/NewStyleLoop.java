package lesson17;

import java.util.List;

public class NewStyleLoop {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        double result = eList.stream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .sum();

        System.out.printf("Total CO executive pay: $%,9.2f %n", result);
    }
}

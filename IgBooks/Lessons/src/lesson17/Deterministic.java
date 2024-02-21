package lesson17;

import java.util.List;

public class Deterministic {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        double r1 = eList.stream()
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> e.printSummary())
                .mapToDouble(Employee::getSalary)

                .sequential().sum();


        double r2 = eList.stream()
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> e.printSummary())
                .mapToDouble(Employee::getSalary)

                .parallel().sum();

        System.out.println("The same: " + (r1 == r2));
    }
}

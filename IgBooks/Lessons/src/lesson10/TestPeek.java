package lesson10;

import java.util.List;

public class TestPeek {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e-> e.getState().equals("CO"))
                .peek(e -> System.out.println("name: " + e.getGivenName() +
                        "surname: " + e.getSurName() + " Salary: " + e.getSalary() +
                        " Bonus: " + Bonus.byRole(e.getRole())))
                .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))

                .forEach(s -> System.out.printf("Bonus paid $%, 6.2f %n" , s));


    }
}

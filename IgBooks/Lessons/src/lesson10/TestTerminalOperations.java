package lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestTerminalOperations {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("Executive count");

        Long execCount =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .count();
        System.out.println("Number of executives are: " + execCount);

        System.out.println("Highest paid exec");

        Optional highestExec =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .max(Employee::sortBySalary);

        if(highestExec.isPresent()){
            Employee temp = (Employee) highestExec.get();
            System.out.printf("name: " + temp.getGivenName()
            + " surname: " + temp.getSurName() + " salary: $%,6.2f %n " , temp.getSalary());
        }

        System.out.println("Lowest paid staff");

        Optional lowestExec =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .min(Comparator.comparingDouble(e -> e.getSalary()));

        if(lowestExec.isPresent()){
            Employee temp2 = (Employee) lowestExec.get();
            System.out.printf("\nname: " + temp2.getGivenName()
                    + "\nsurname: " + temp2.getSurName() + "\nsalary: $%,6.2f %n " , temp2.getSalary());
        }


    }
}

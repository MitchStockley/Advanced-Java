package lesson17;

import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        //Using Parallel Streams: Collection
        double result = eList.parallelStream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .sum();

        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);

        //Using Parallel Streams: From a Stream
        System.out.println();

       double result2 = eList.stream()
               .filter(e -> e.getState().equals("CO"))
               .filter(e -> e.getRole().equals(Role.EXECUTIVE))
               .peek(e -> e.printSummary())
               .mapToDouble(e -> e.getSalary())
               .parallel()
               .sum();

        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result2);
    }
}

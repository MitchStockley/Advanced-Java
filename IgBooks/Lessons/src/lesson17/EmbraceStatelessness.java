package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmbraceStatelessness {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        List<Employee> newList02 = eList.parallelStream()
                .filter(e -> e.getDept().equals("Eng"))
                .collect(Collectors.toList());


    }
}

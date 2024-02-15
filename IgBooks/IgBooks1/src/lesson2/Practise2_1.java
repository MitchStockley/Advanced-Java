package lesson2;

import lesson3.Employee;

public class Practise2_1 {
    public static void main(String[] args) {
        Employee testEmployee = new Employee(453, "Mitch", "de145", 1000);

        System.out.println("The employees name is " + testEmployee.getName());
        System.out.println("The employees id is " + testEmployee.getEmployeeId());
        System.out.println("The employees ssn is " + testEmployee.getSsn());
        System.out.println("The employees salary is " + testEmployee.getSalary());
    }

}

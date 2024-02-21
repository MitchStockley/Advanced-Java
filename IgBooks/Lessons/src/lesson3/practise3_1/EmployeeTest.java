package lesson3.practise3_1;

public class EmployeeTest {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public EmployeeTest(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }



    public int getEmployeeId() {
        return empId;
    }


    public void changeName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public void Display(){
        System.out.println("Employee name is " + name + ", Employee id is " +
                empId + ", The Ssn is  " + ssn
                + ", The Employee salary is " + salary); }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }



}


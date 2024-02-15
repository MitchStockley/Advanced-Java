package lesson5;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
      this.empId = empId;
      this.name = name;
      this.ssn = ssn;
      this.salary = salary;
    }

    public String getDetails() {
      return "ID: " + empId + " Name: " + name;
    }

    public String getAllDetails() {
        return "ID: " + empId + " Name: " + name 
          + " SSN: " + ssn + " Salary: " + salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary(){
      return this.salary;
    }


    public String Display(){
        return "id " + empId +  "\n"+ "Employee name: " + name;
     }

     @Override
    public  boolean equals(Object o) {
         boolean result = false;
         if ((o != null) && (o instanceof Employee)) {
             Employee e = (Employee) o;
             if ((e.empId == this.empId) && (e.name == this.name) && (e.ssn == this.ssn) && (e.salary == this.salary)) {
                 result = true;
             }


         }
         return result;
     }
}
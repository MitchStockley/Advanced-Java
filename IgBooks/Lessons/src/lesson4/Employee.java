package lesson4;

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


    
    public double getSalary(){
      return this.salary;
    }

     @Override
    public String toString(){
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
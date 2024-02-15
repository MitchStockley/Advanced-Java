package lesson5;



public class TestFinalObjectReference {
    public static void main(String[] args) {
       final Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
       emp1.setEmpId(100);
//       emp1 = emp2; cant change reference to a different object because emp1 is final



    }
}

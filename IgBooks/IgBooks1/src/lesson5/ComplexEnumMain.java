package lesson5;

public class ComplexEnumMain {
    public static void main(String[] args) {
        Computer comp = new Computer();
       comp.setState(Computer.PowerState.SUSPEND);
        System.out.println("Current State: " + comp.getState());
        System.out.println("Description: " + comp.getState().getDescription());
    }
}

package lesson3.practise3_1;

public class Test {
    public static void main(String[] args) {
        Director newDirector = new Director(123,"james","d4th66", 50000);
        Admin newAdmin = new Admin(555,"sally", "2345fg", 20000);
        Engineer newEngineer = new Engineer(566,"grant", "d33", 90000);
        Manager newManager = new Manager(444,"Nisha", "34yyy", 70000);

        newAdmin.Display();
        newDirector.Display();
        newEngineer.Display();
        newManager.Display();
    }
}

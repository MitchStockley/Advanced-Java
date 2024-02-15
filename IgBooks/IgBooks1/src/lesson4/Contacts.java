package lesson4;
//immutable class

public final class Contacts {
    private final String firstName;
    private final String Lastname;

    public Contacts(String fname,String lName){
        this.firstName = fname;
        this.Lastname = lName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }
}

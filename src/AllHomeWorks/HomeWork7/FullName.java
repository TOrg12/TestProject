package AllHomeWorks.HomeWork7;

public class FullName {
    private String firstName;
    private  String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

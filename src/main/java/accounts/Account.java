package accounts;

public class Account {

    private String firstName;
    private String lastName;
    private String accNumber;

    public Account (String firstName, String lastName, String accNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumber = accNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

}







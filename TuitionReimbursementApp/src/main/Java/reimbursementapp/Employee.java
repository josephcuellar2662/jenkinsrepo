package reimbursementapp;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private int type;
    private String username;
    private String password;

    public Employee(){
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.type = 0;
    }

    public Employee(String firstName, String lastName, String email, int type, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
        this.username = username;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


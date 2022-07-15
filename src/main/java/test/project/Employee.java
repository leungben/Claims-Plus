package test.project;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private String emailAddress;
    private int currentClaims = 0;
    private int closedClaims = 0;

    public Employee(int employeeID, String name, String position, String emailAddress) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

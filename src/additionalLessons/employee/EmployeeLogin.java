package additionalLessons.employee;

public class EmployeeLogin{

    private String employeeID;
    private String password;

    EmployeeLogin(String employeeId, String password){
        this.employeeID = employeeId;
        this.password = password;
    }

    public String getEmployeeID() { return employeeID; }
    public String getPassword() { return password; }

}

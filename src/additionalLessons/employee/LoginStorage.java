package additionalLessons.employee;

public class LoginStorage{

    private EmployeeLogin[] array = new EmployeeLogin[2];
    private int size = 0;

    public void add(EmployeeLogin value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        EmployeeLogin[] newArr = new EmployeeLogin[array.length + 2];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    // is password
    public boolean passChecker(String password) {
        boolean isPass = false;
        for (int i = 0; i < size; i++) {
            EmployeeLogin employee = array[i];
            if(employee.getPassword().equals(password)){
                System.out.println(employee);
                isPass = true;
            }
        }
        return isPass;
    }

    // is ID
    public boolean idChecker(String empId) {
        boolean isID = false;
        for (int i = 0; i < size; i++) {
            EmployeeLogin employee = array[i];
            if(employee.getEmployeeID().equals(empId)){
                System.out.println(employee);
                isID = true;
            }
        }
        return isID;
    }
}

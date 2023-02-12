package homework.homework11and12.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArr = new Employee[array.length + 10];
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

    // Search By Employee's id
    public void searchById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(id)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Error: Employ with id (" + id + ") not found");
        }
    }

    // Search By Company Name
    public void searchByCmpName(String cmpName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(cmpName)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Error: not found company " + cmpName);
        }
    }

    public boolean idChecker(String newId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(newId)) {
                found = true;
                return found;
            }
        }
        return found;
    }

    public void searchBySalaryRange(double from, double to) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getSalary() > from && emp.getSalary() < to) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("employee with earnings from " + from + " to " + to + " was not found");
        }
    }

    public void positionChangeById(String empId, String pos) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getEmployeeID().equals(empId)) {
                emp.setPosition(pos);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with id (" + empId + ") not found");
        }
    }

    public void getActiveEmp() {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.isActive()) {
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Not found active employee");
        }
    }

    public void inactiveEmp(String eId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getEmployeeID().equals(eId)) {
                found = true;
                emp.setActive(false);
            }
        }
        if (!found) {
            System.out.println("Employee with id (" + eId + ") not found");
        }
    }
    public void activateEmp(String eId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getEmployeeID().equals(eId)) {
                found = true;
                emp.setActive(true);
            }
        }
        if (!found) {
            System.out.println("Employee with id (" + eId + ") not found");
        }
    }
}
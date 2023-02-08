package homework.homework11.employee;

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
            if(employee.getEmployeeID().startsWith(id)){
                System.out.println(employee);
                found = true;
            }
        }
        if(!found){
            System.out.println("Error: Employ with id (" + id + ") not found");
        }
    }

    // Search By Company Name
    public void searchByCmpName(String cmpName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if(employee.getCompany().contains(cmpName)){
                System.out.println(employee);
                found = true;
            }
        }
        if(!found){
            System.out.println("Error: not found company " + cmpName);
        }
    }
}
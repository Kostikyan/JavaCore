package homework.homework11and12.employee;

import java.util.Scanner;

public class EmployeeDemo {

    static Scanner sc = new Scanner(System.in);
    static EmployeeStorage es = new EmployeeStorage();

    public static void main(String[] args) {

        // boolean for inf run OR if input 0 -> end program
        boolean isRun = true;

        // inf while
        while (isRun){

            // print commands
            System.out.println("input: 0) for exit");
            System.out.println("       1) for add employee");
            System.out.println("       2) for print all employee");
            System.out.println("       3) search employee by employee ID");
            System.out.println("       4) search employee by company name employee ID");
            System.out.println("       5) for search employee by salary range");
            System.out.println("       6) for change employee position by id");
            System.out.println("       7) for print only active employees");
            System.out.println("       8) for inactive employee by id");
            System.out.println("       9) for activate employee by id");


            // input command number
            String command = sc.nextLine();

            // check command number
            switch (command){

                // end program
                case "0":
                    isRun = false;
                    break;

                // adding new employee
                case "1":
                    addEmployee();
                    break;

                // print all employees
                case "2":
                    es.print();
                    break;

                // search employee by ID
                case "3":
                    System.out.print("please input employee's ID: ");
                    String id = sc.nextLine();
                    es.searchById(id);
                    break;

                // search employee by company name
                case "4":
                    System.out.print("please input company name: ");
                    String cmpName = sc.nextLine();
                    es.searchByCmpName(cmpName);
                    break;

                // search employee by salary range
                case "5":
                    System.out.print("\nfrom: ");
                    String fromNum = sc.nextLine();
                    System.out.print("to: ");
                    String toNum = sc.nextLine();
                    es.searchBySalaryRange(Double.parseDouble(fromNum), Double.parseDouble(toNum));
                    break;

                // change employee position by id
                case "6":
                    System.out.print("please input employee's id: ");
                    String empId = sc.nextLine();
                    System.out.print("please input new position: ");
                    String newPosition = sc.nextLine();

                    es.positionChangeById(empId, newPosition);
                    break;

                // print all active employees
                case "7":
                    es.getActiveEmp();
                    break;

                // inactive employee
                case "8":
                    System.out.print("please input employee's id: ");
                    String eId = sc.nextLine();
                    es.inactiveEmp(eId);
                    break;

                // active employee
                case "9":
                    System.out.print("please input employee's id: ");
                    String emId = sc.nextLine();
                    es.activateEmp(emId);
                    break;

                // if inputted command wrong
                default:
                    System.out.println("wrong command please try again!");
            }
        }

    }

    private static void addEmployee() {
        System.out.print("\ninput name: ");
        String name = sc.nextLine();
        System.out.print("input surname: ");
        String surname = sc.nextLine();
        System.out.print("input employee ID: ");
        String empId = sc.nextLine();
        System.out.print("input salary: ");
        String salary = sc.nextLine();
        System.out.print("input company: ");
        String company = sc.nextLine();
        System.out.print("input position: ");
        String position = sc.nextLine();

        while(es.idChecker(empId)){
            System.out.println("\nThis ID already exist! Try Another!");
            System.out.print("input ID: ");
            empId = sc.nextLine();
        }

        Employee employee = new Employee(name, surname, empId, Double.parseDouble(salary), company, position);
        es.add(employee);

        System.out.println("\nEmployee was added");
    }

}

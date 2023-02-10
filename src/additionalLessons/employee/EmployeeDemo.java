package additionalLessons.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Employee Storage
        EmployeeStorage es = new EmployeeStorage();
        LoginStorage ls = new LoginStorage();

        // boolean for inf run OR if input 0 -> end program
        boolean isRun = true;

        // inf while
        while (isRun) {

            // print commands
            System.out.println("input: 0) for exit");
            System.out.println("       1) for add employee");
            System.out.println("       2) for print all employee");
            System.out.println("       3) search employee by employee ID");
            System.out.println("       4) search employee by company name");
            System.out.println("       5) for log in employee account");

            // input command number
            String command = sc.nextLine();

            // check command number
            switch (command) {

                // if command = 0  ->  end program
                case "0":
                    isRun = false;
                    break;

                // if command = 1  ->  adding new employee
                case "1":
                    System.out.print("\ninput name: ");
                    String name = sc.nextLine();
                    System.out.print("input surname: ");
                    String surname = sc.nextLine();
                    System.out.print("input password: ");
                    String password = sc.nextLine();
                    System.out.print("input employee ID: ");
                    String empId = sc.nextLine();
                    System.out.print("input salary: ");
                    String salary = sc.nextLine();
                    System.out.print("input company: ");
                    String company = sc.nextLine();

                    System.out.println("\nRemember your id and password!");

                    Employee employee = new Employee(name, surname, empId, salary, company);
                    es.add(employee);

                    EmployeeLogin empLog = new EmployeeLogin(empId, password);
                    ls.add(empLog);

                    System.out.println("Employee was added");
                    break;

                // if command = 2  ->  print all employees
                case "2":
                    es.print();
                    break;

                // if command = 3  ->  search employee by ID
                case "3":
                    System.out.print("please input employee's ID: ");
                    String id = sc.nextLine();
                    es.searchById(id);
                    break;

                // if command = 4  ->  search employee by company name
                case "4":
                    System.out.print("please input company name: ");
                    String cmpName = sc.nextLine();
                    es.searchByCmpName(cmpName);
                    break;

                // if command = 5  ->  log in
                case "5":
                    System.out.print("EmployeeID: ");
                    String idLog = sc.nextLine();
                    System.out.print("Password: ");
                    String passLog = sc.nextLine();

                    boolean isPass = ls.passChecker(passLog);
                    boolean isId = ls.idChecker(idLog);

                    String foundName = es.foundName(idLog);

                    if (isPass && isId) {
                        System.out.println("Welcome " + foundName);
                        boolean isRun2 = true;
                        while(isRun2){
                            System.out.println("input: 0) for log out");
                            System.out.println("       1) for change name");

                            String command2 = sc.nextLine();

                            switch (command2){
                                case "0":
                                    System.out.println("Bye!");
                                    isRun = true;
                                    isRun2 = false;
                                    break;
                                case "1":
                                    System.out.print("new name: ");
                                    String nName = sc.nextLine();
                                    es.set(nName);
                                    System.out.println("name changed to " + nName);
                                    break;
                                default:
                                    System.out.println(" ");
                            }
                        }
                    }else{
                        System.out.println("Wrong ID or password, please try again.");
                        break;
                    }
                    break;

                // if inputted command wrong
                default:
                    System.out.println("wrong command please try again!");
            }
        }

    }

}
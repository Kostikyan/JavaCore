package homework.homework11.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Employee Storage
        EmployeeStorage es = new EmployeeStorage();

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

            // input command number
            String command = sc.nextLine();

            // check command number
            switch (command){

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
                    System.out.print("input employee ID: ");
                    String empId = sc.nextLine();
                    System.out.print("input salary: ");
                    String salary = sc.nextLine();
                    System.out.print("input company: ");
                    String company = sc.nextLine();

                    Employee employee = new Employee(name, surname, empId, salary, company);
                    es.add(employee);

                    System.out.println("\nEmployee was added");
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

                // if inputted command wrong
                default:
                    System.out.println("wrong command please try again!");
            }
        }

    }

}

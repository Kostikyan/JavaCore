package homework.homework11.employee;

import java.util.Objects;

public class Employee{

    // Employee Data
    private String name, surname, employeeID, salary, company;

    // Employee Full Constructor
    public Employee(String name, String surname, String employeeID, String salary, String company) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
    }

    // If Empty Constructor
    public Employee() {
    }

    // GETS:
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public String getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }

    // SETS:
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    // OVERRIDES:
    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", employee ID: '" + employeeID + '\'' +
                ", salary: '" + salary + '\'' +
                ", company: '" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(salary, employee.salary) && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company);
    }
}

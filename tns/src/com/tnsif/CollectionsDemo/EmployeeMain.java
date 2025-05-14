package com.tnsif.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees to the list
        employees.add(new Employee(101, "Allen", 67893));
        employees.add(new Employee(203, "Evan", 57893));
        employees.add(new Employee(301, "Bobby", 20987));
        employees.add(new Employee(102, "Candy", 47893));

        // Sorting by name
        System.out.println("Sort by name:");
        Collections.sort(employees, new EmployeeNameCom());
        printEmployees(employees);

        // Sorting by salary
        System.out.println("\nSort by salary:");
        Collections.sort(employees, new EmployeeSalcom());
        printEmployees(employees);
    }

    // Method to print employees
    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.eid + ", " + employee.ename + ", " + employee.sal);
        }
    }
}
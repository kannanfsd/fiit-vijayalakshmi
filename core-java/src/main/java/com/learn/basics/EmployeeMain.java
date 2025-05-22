package com.learn.basics;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeId = 1201;
        employee.employeeName = "John Doe";
        employee.salary = 10000;
        employee.printEmployee();
    }
}

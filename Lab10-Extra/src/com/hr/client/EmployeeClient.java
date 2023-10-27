package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("Justin");

        try {
        emp.goToWork();
        // TODO: call goToWork() on the Employee object
        } catch (WorkException e) {
            System.out.println(e.getMessage());  // just the reason string
            System.out.println(e.getCause().getMessage());  // extract "message" and "cause" from the nested exception
            e.printStackTrace();
        }
    }
}
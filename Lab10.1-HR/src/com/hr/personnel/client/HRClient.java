/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IllegalWageException;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) throws IllegalWageException {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Mew",  LocalDate.of(1990, 8, 24), 2250.0));
        dept.addEmployee(new SalariedEmployee("Justin", LocalDate.of(1999, 2, 6), 1_250.0));
        dept.addEmployee(new SalariedEmployee("Jeffrey", LocalDate.of(2004, 1, 2), 5_000.0));

        // add Employees to it
        try {
            dept.addEmployee(new HourlyEmployee("Aaron",    LocalDate.of(2000, 2, 2), 5, 30.0));
            }

        catch (IllegalWageException e) {
            System.out.println("Error: " + e);
        }

        try {
            dept.addEmployee(new HourlyEmployee("Oliver",    LocalDate.of(2002, 6, 2), 40.0, 40.0));
        }
        catch (IllegalWageException e) {
            System.out.println("Error: " + e);  // e.toString() authomatically called
        }


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();
    }
}
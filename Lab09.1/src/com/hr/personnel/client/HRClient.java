/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {

        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Aaron", LocalDate.of(1990, 8, 24), 1175.50));
        dept.addEmployee(new SalariedEmployee("Mew", LocalDate.of(2000, 2, 2), 1200.10));
        dept.addEmployee(new SalariedEmployee("Oliver", LocalDate.of(2014, 2, 6), 1500.00));
        dept.addEmployee(new HourlyEmployee("Justin", LocalDate.of(2014, 2, 6), 33.00, 30.00));
        dept.addEmployee(new Executive("Jeff", LocalDate.of(2010, 2, 6), 50000.00));
        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();
        System.out.println("\nPay all employees"); // for readability
        dept.payEmployees();

        // pay all Employees
        System.out.println("\nPay all employees");
        dept.payEmployees();

        // holiday break
        System.out.println("\nHoliday break:");
        dept.holidayBreak();

        // force holiday break
        System.out.println("\nForce holiday break:");
        dept.holidayBreak();

    }
}
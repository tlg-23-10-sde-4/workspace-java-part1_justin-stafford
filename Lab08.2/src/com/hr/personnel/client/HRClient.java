/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.Department;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);  // toString() automatically called

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Oliver", LocalDate.of(1990, 8, 24), 1175.0));
        dept.addEmployee(new SalariedEmployee("Mew", LocalDate.of(2000, 2, 2), 1275.0));
        dept.addEmployee(new HourlyEmployee("Aaron",   LocalDate.of(2014, 2, 6), 22.0, 15.0));
        dept.addEmployee(new HourlyEmployee("Justin",  LocalDate.of(2020, 6, 2), 25.0, 30.0));
        dept.addEmployee(new Executive("Jeff",          LocalDate.of(1986, 12, 5), 100_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all Employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}
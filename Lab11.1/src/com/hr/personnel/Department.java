/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();


    // constructors
    public Department() {
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  //toString() auto
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    // methods
    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay();
        }
    }

    /*
    *   Forced Vacation
    * Department can't see takeVacation() method.
    * if (employees)[i] take vacation
     */

public void holidayBreak() {
        for (Employee emp : employees) {
            System.out.println(emp);
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}
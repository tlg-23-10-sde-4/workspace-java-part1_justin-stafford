package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public double salary;

    // Methods (excluding get/set methods):

    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary of " + getSalary());

    }
    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

   // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", salary=" +
                getSalary();
    }
}
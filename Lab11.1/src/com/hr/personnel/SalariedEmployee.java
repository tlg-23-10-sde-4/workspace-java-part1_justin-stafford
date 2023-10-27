package com.hr.personnel;

import java.time.LocalDate;
// if SalariedEmployees implements TaxPayer it will skip Employee types.
public class SalariedEmployee
        extends Employee
        {

    private double salary;

    // Methods (excluding get/set methods):

    @Override
    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary of " + getSalary());
    }
    @Override
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " pays taxes in the amount of: " + getSalary() * SALARIED_TAX_RATE);
    }

    public void takeVacation() {
    System.out.println(getName() + "is on vacation");
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
    @Override
    public double getStandardDeduction() {
        return 9_000.00;
    }
        }
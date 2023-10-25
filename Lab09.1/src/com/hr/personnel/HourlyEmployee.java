package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee
        extends Employee
    {
    private double rate;
    private double hours;

//business "action" methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid wage of " + payment + " per hour");
    }

    public void payTaxes() {
        double taxes = getRate() * getHours();
        System.out.println(getName() + " pays taxes in the amount of " + getRate() * taxes + " per hour");
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // getters and setters for fields
    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", rate=" + getRate() +
                ", hours=" + getHours();
    }

}

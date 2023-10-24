package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    public double rate;
    public double hours;

    public HourlyEmployee() {
        super();
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

    public String toString() {
        return "HourlyEmployee" +
                ": name=" + getName() +
                ", hireDate=" + getHireDate() +
                ", rate=" + getRate()
                + ", hours=" + getHours();
    }

}

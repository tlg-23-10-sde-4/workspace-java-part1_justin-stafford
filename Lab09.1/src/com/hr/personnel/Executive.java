package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }
    @Override
    public void fileReturn() {
        System.out.println("Return electronically.");
    }
    @Override
    public void work() {
        System.out.println(getName() + "is an executive and is playing golf");
    }
}

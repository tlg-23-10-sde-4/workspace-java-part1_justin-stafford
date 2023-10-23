package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
* An immutable class.  A class definition written in such a way that instances
* that instances of it, once created, cannot have their properties changed.
* There are simply no public methods to do so.
 */
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name; //delegate
        this.birthDate = birthDate;
    }

    /*
    * Returns the person's age in whole years.
    * This is a "derived property", i.e. it is calculated and returned, not stored in a field.
    *HINT: find period of time in whole years. between two dates: the birthdates and today's date.
     */
    public int getAge() {
        return 0;
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}
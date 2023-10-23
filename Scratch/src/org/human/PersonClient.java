package org.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Justin", LocalDate.of(1973, 4, 9));

        System.out.println(p1);

        System.out.println("<>");
    }
}
package com.fullstack.javacore.CollectionTopics.Java8;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;

public class AgeOfPerson {
    public AgeOfPerson() {
    }

    public static void main(String[] args) {
        String birthdateStr = "1998-08-24";
        LocalDate birthdate = LocalDate.parse(birthdateStr);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        PrintStream var10000 = System.out;
        int var10001 = age.getYears();
        var10000.println("Age: " + var10001 + " years " + age.getMonths() + " months " + age.getDays() + " days");
}
}

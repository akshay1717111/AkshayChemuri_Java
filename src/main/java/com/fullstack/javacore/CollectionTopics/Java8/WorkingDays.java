package com.fullstack.javacore.CollectionTopics.Java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDays {
    public WorkingDays() {
    }

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 7, 3);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        int workingDays = 0;

        for(LocalDate currentDate = startDate; !currentDate.isAfter(endDate); currentDate = currentDate.plus(1L, ChronoUnit.DAYS)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                ++workingDays;
            }
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
}
}
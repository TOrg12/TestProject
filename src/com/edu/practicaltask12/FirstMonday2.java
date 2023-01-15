package com.edu.practicaltask12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.firstInMonth;


public class FirstMonday2 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
    }
}
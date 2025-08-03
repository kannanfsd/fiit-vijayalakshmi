package com.learn.datetime.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeAPIDemo {
    public static void main(String[] args) {
        LocalDate dateOnly = LocalDate.now();
        LocalTime timeOnly = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(dateOnly);
        System.out.println(timeOnly);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);
    }
}

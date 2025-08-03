package com.learn.datetime.newapi;

import java.time.*;

public class OfMethodDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, Month.DECEMBER, 17);
        LocalTime time = LocalTime.of(19, 35);
        LocalDateTime dateTime = LocalDateTime.of(2010, 12, 20, 9, 25);
        ZoneId indiaZoneId = ZoneId.of("Asia/Calcutta");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2016, 10, 15, 18, 22, 20, 0, indiaZoneId);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(indiaZoneId);
        System.out.println(zonedDateTime);
    }
}

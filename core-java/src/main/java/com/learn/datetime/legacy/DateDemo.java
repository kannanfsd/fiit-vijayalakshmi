package com.learn.datetime.legacy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) {
        Date today = new Date(); // current date and time value
        System.out.println(today);

        Calendar calender = new GregorianCalendar();
        //System.out.println(calender);
        int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH);
        int date = calender.get(Calendar.DATE);
        int day = calender.get(Calendar.DAY_OF_MONTH);
        int hour = calender.get(Calendar.HOUR_OF_DAY);
        int minutes = calender.get(Calendar.MINUTE);
        int seconds = calender.get(Calendar.SECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d %02d:%02d:%02d:%04d%n",
                year, month, date, hour, minutes, seconds,day);

    }
}

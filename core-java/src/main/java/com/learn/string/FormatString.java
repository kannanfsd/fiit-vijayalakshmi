package com.learn.string;

public class FormatString {
    public static void main(String[] args) {
        String format = "Hello Mr./Ms. %s you have a %d messages.";
        String name = "Viji";
        int msgCount = 5;
        System.out.println(String.format(format, name, msgCount));

    }
}

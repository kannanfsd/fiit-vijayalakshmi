package com.learn.string;

public class InternMethodDemo {
    public static void main(String[] args) {
        String hello = "Hello";
        String obj = new String("Hello").intern();
        System.out.println(obj == hello);

        String name = "\u004DHello\u0021";
        System.out.println(name);
    }
}

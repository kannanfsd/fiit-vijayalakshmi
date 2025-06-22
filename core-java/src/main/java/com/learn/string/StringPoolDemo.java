package com.learn.string;

public class StringPoolDemo {
    public static void main(String[] args) {
        String hello = "Hello";
        String hi = "Hello";
        String hey = "hey";
        System.out.println(hello==hi);
        System.out.println(hello.hashCode());
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());

        String obj = new String("Hello");
        String obj2 = new String("Hello");
        String obj3 = new String("hey");
        System.out.println(obj==obj2);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}

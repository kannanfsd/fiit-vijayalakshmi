package com.learn.access;

class A1 {
    String message;
    String name;
    String location;
    A1() {
        this("Now this is act as method calling.");
        System.out.println("A1 default constructor");
    }
    A1(String message) {
        this(message, "FIIT");
    }
    A1(String message, String name) {
        this(message, name, "Chennai");
    }
    A1(String message, String name, String location) {
        this.message = message;
        this.name = name;
        this.location = location;
    }
    void display() {
        System.out.println("Message: "+message);
        System.out.println("Name: "+name);
        System.out.println("Location: "+location);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        A1 a1 = new A1();
        //A1 a2 = new A1("Hello World");
        //A1 a3 = new A1("Buy a new car", "BMW");
        //A1 a4 = new A1("Bought a Car", "Ford", "Chennai");
        a1.display();
        //a2.display();
        //a3.display();
        //a4.display();
    }
}

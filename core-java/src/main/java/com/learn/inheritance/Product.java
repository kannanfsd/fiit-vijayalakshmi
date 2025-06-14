package com.learn.inheritance;

class A {
//    A() {
//        System.out.println("A - Default Constructor");
//    }
    A(String location){
        System.out.println("A - "+location);
    }
}
class B extends A {
//    B() {
//        System.out.println("B - Default Constructor");
//    }
    B(String name){
        super("Chennai");
        System.out.println("B - " + name);
    }
}

public class Product {
    public static void main(String[] args) {
        B b = new B("John Doe");
    }
}

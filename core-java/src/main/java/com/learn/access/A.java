package com.learn.access;

import java.io.IOException;
import java.sql.SQLException;

class B {
    static void add(int a, int b)throws ArithmeticException {
        System.out.println("Sum of a, b is "+(a + b));
    }
}
class C {
    int multiply(int a, int b) {
        return a*b;
    }
}
public class A {
    static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
//        B b = new B();
//        b.add(1, 2);
        B.add(1, 2);
        int sresult = sub(4,2);
        C c = new C();
        int result = c.multiply(2, 3);
        System.out.println("Prod of a, b is "+result);
    }
}

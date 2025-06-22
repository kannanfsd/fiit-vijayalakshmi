package com.learn.interfaces;

interface Test {
    final static int num = 10;   //variable with final static
    abstract void test();        //default abstract method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
class TestImpl implements Test {
    @Override
    public void test() {
        System.out.println("This is an Interface test, It contains the value is "+num);
    }
}
public class FirstInterfaceDemo {
    public static void main(String[] args) {
        TestImpl obj = new TestImpl();
        obj.test();
        obj.defaultMethod();
        Test.staticMethod();
    }
}

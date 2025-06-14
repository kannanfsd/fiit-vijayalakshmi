package com.learn.inheritance;

class Standard{
    private int val1;
    public int getVal1() {
        return val1;
    }
    public void setVal1(int val1) {
        this.val1 = val1;
    }
    int val2;
    void doAddition() {
        System.out.println("Addition of " + val1 + " and " + val2 + " is "+(val1 + val2));
    }
    void doSubtraction() {
        System.out.println("Subtraction of " + val1 + " and " + val2 + " is "+(val1 - val2));
    }
    static void display(){
        System.out.println("Parent class method.");
    }
}
class Scientific extends Standard{
    int val3;
    void doSinValue(){
        System.out.println("Sin value of " + getVal1() + " is "+Math.sin(getVal1()));
    }
    void doCosValue() {
        System.out.println("Cos value of " + val2 + " is "+Math.cos(val2));
    }
    static void display(){
        System.out.println("Child class method.");
    }
    void printData(){
        System.out.println("Child class there own method.");
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scientific sc = new Scientific();
        sc.setVal1(12);
        sc.val2 = 22;
        sc.doAddition();
        sc.doSubtraction();
        sc.doSinValue();
        sc.doCosValue();
        sc.display();
        sc.printData();
    }
}

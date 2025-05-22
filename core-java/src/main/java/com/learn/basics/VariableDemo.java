package com.learn.basics;

class Employer {

}

public class VariableDemo {
    public static void main(String[] args) {
        int salary = 500;
        long mySalary = salary; //Implicit casting
        System.out.println(mySalary);

        //int newSalary = mySalary; //compilation error
        int newSalary = (int) mySalary;
        System.out.println(newSalary);

        double data1 = 12.567;
        long data2 = (long) data1; // data truncation
        System.out.println(data2); // actual output: 12 // 0.567

        int a =15;
        int b = -a;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
    }
}

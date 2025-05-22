package com.learn.basics;

class Student {
    int regId;
    Student(int regId) {    //args constructor method
        this.regId = regId;
    }
    void displayRegId() {   //concrete method
        System.out.println("The Student registration ID is " + regId);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(1251790);
        student.displayRegId();
    }
}

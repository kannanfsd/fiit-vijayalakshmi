package com.learn.objectasargs;

public class ObjectAsArgsAndReturnValue {
    public static void main(String[] args) {
        Student s1 = new Student("FIIT001", "Ram", 48, 56, 61);
        Student s2 = new Student("FIIT002", "Ram", 84, 91, 96);
        Student s3 = new Student("FIIT003", "Ram", 48, 56, 61);
        Result result = ResultCalculator.calculateResult(s3);
        System.out.println(result);
    }
}

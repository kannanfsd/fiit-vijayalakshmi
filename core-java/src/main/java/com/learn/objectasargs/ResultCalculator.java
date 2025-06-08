package com.learn.objectasargs;

public class ResultCalculator {
    public static Result calculateResult(Student student) {
        int total = student.getMark1()+student.getMark2()+student.getMark3();
        int average = total/3;
        Result result = new Result();
        result.setRollNumber(student.getRollNumber());
        if(average > 70) {
            result.setGrade("Pass");
        } else {
            result.setGrade("Fail");
        }
        return result;
    }
}

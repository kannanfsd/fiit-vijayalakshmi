package com.learn.objectasargs;

public class Result {
    private String rollNumber;
    private String grade;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "rollNumber='" + rollNumber + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

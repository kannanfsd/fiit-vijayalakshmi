package com.learn.basics;

class Calculator {
    int op1, op2;
    void displayOperand() {
        System.out.println("Operand-1: "+op1);
        System.out.println("Operand-2: "+op2);
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Calculator calc = new Calculator();
        calc.op1 = 98;
        calc.op2 = 53;
        calc.displayOperand();
    }
}

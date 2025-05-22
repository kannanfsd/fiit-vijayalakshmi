package com.learn.exception;

public class UnChecked2 {
    public static void main(String[] args) {
        int result=0;
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            result = x / y;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Result: "+result);
        }
    }
}

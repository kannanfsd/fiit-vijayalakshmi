package com.learn.exception;

import java.util.Scanner;

public class UnChecked {
    public static void main(String[] args) {
        System.out.println("Begin the program");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer: ");
            int x = sc.nextInt();
            System.out.println("Enter the second integer: ");
            int y = sc.nextInt();
            if(y == 0){
                throw new ArithmeticException("Divisor is not allowed zero value.");
            }
            int result = x / y;
            System.out.println(result);
        }catch(Exception e){
            //e.printStackTrace();
            System.err.println("Error Message: "+e.getMessage());
            //throw new ArithmeticException("Oops! Something went wrong");
        }
        System.out.println("End the program");
    }
}

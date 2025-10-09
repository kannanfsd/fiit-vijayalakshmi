package com.learn.thread;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Main Thread - Start thread");
        System.out.println("This is my first Thread application.");
        printData();
        System.out.println("Main Thread - End thread");
    }
    static void printData(){
        System.out.println("Child Thread - Start thread");
        for(int i=0;i<5;i++){
            System.out.println("Welcome back, Mr./Ms. Vijayalaksmi Anadan");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ie){}
        }
        System.out.println("Child Thread - End thread");
    }
}

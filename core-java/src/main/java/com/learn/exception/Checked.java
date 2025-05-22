package com.learn.exception;

public class Checked {
    public static void displayName() throws InterruptedException {
        System.out.println("My name is " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Begin the program");
        Thread currentThread = Thread.currentThread();
        currentThread.setName("FIIT");
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
                displayName();
            }catch (InterruptedException e){}
        }
        System.out.println("End the program");
    }
}

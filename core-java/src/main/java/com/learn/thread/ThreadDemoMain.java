package com.learn.thread;

class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Begin the Thread.");
        for(int i=0;i<5;i++){
            System.out.println("Welcome back, Mr./Ms. Vijayalaksmi Anadan");
            try{
                sleep(2000);
            }catch(InterruptedException ie){}
        }
        System.out.println("End the Thread.");
    }
}

public class ThreadDemoMain {
    public static void main(String[] args) {
        System.out.println("Begin the main.");
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        System.out.println("End the main.");
    }
}

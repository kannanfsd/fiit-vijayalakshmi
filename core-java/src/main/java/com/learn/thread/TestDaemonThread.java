package com.learn.thread;

public class TestDaemonThread extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        } else {
            System.out.println("User thread work");
        }
    }
    public static void main(String[] args) {
        TestDaemonThread t1 = new TestDaemonThread();
        TestDaemonThread t2 = new TestDaemonThread();
        TestDaemonThread t3 = new TestDaemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}

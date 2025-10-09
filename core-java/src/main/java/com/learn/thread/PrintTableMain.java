package com.learn.thread;

class Table {
    void printTable(int n) {
        System.out.println("Printing table as " + n);
        System.out.println("Begin to print the table.");
        synchronized(this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n +" * "+ i + " = "+(i*n));
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException ie){}
            }
        }
        System.out.println("End to print the table.");
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(7);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(9);
    }
}

public class PrintTableMain {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}

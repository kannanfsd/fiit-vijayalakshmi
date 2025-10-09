package com.learn.thread;

class ThreadDemoL1 extends Thread {
    int i = 0;
    ThreadDemoL1(String name) {
        setName(name);
    }
    @Override
    public void run() {
       for(int j=1;j<=5;j++){
           System.out.println("Print the "+getName()+" "+j+"time/sec");
           try{
               sleep(1000);
           }catch (InterruptedException e){}
       }
    }
}
public class ThreadDemoMainL1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("Name of the current thread: " + t1.getName());
        t1.setName("DOMS");
        System.out.println("Name of the current thread: " + t1.getName());
        System.out.println("Default Priority: " + t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("After define, Priority: " + t1.getPriority());
        System.out.println(t1.isDaemon());
        ThreadDemoL1 t2 = new ThreadDemoL1("Columbus");
        ThreadDemoL1 t3 = new ThreadDemoL1("Ohio");
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        t3.start();
        for (int j=1;j<=5;j++){
            System.out.println("Print the "+t1.getName()+" "+j+"time/sec");
            try{
                t1.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}

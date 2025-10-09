package com.learn.thread;

class RunnableThread implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()+": "+i+" time/sec");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
public class RunnableThreadMain {
    public static void main(String[] args) {
        System.out.println("Begin main thread.");
        RunnableThread thread1 = new RunnableThread();
        RunnableThread thread2 = new RunnableThread();
        Thread t1 = new Thread(thread1, "Oswal");
        Thread t2 = new Thread(thread2, "Walter");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){}
        System.out.println("End main thread.");
    }
}

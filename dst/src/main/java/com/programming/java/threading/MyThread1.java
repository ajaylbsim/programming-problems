package com.programming.java.threading;

public class MyThread1 implements Runnable {


    static int count = 1;
    static Object monitor = new Object();
    static int maxId = 3;
    int myid;

    public MyThread1(int myid) {
        this.myid = myid;
    }


    @Override
    public void run() {


        while (count < 100) {

             synchronized (monitor) {

                    try {
                        while ((count%maxId) != this.myid){
                         monitor.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " count id :-" + count);
                    count++;
                    monitor.notifyAll();

                }


        }
    }

}

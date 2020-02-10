package com.programming.java.threading;

public class MyThread1Test {


    public static void main(String[] args) {


        Thread t1 = new Thread(new MyThread1(1),"T1");
        Thread t2 = new Thread(new MyThread1(2),"T2");
        Thread t3 = new Thread(new MyThread1(0),"T3");
        t1.start();
        t2.start();
        t3.start();



    }

}

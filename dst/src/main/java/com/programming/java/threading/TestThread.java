package com.programming.java.threading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {
    static final int max_T = 2;




    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(max_T);


        ReentrantLock reentrantLock = new ReentrantLock();
        Myworker myworker1 = new Myworker(1,"W1",reentrantLock);
        Myworker myworker2 = new Myworker(2,"W2",reentrantLock);
        Myworker myworker3 = new Myworker(3,"W3",reentrantLock);
        Myworker myworker4 = new Myworker(4,"W4",reentrantLock);
        Myworker myworker5 = new Myworker(5,"W5",reentrantLock);

        executorService.execute(myworker1);
        executorService.execute(myworker2);
        executorService.execute(myworker3);
        executorService.execute(myworker4);
        executorService.execute(myworker5);

        System.out.println(">>>>>>>>>>>>>>");
    }


}

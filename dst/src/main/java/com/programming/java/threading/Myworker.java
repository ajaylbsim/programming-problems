package com.programming.java.threading;

import java.util.concurrent.locks.ReentrantLock;

public class Myworker implements Runnable {

    private String name;
    private ReentrantLock reentrantLock;
    private int id=1;


    public Myworker(int id,String name, ReentrantLock reentrantLock) {
        this.name = name;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {

        Boolean task = Boolean.FALSE;


        while (!task) {
            Boolean isLok = reentrantLock.tryLock();

            System.out.println("Thraed is lokking lock  by "+name );
            try {
                Thread.sleep(1000L);

            }catch (Exception e){

            }



            if(isLok){

                try {

                    System.out.println("Thraed is currntly running  by "+name );
                    Thread.sleep(1000L);


                } catch (Exception e) {

                } finally {
                    System.out.println("Thraed is released  by "+name );

                    reentrantLock.unlock();
                   task = Boolean.TRUE;

                }

            }


        }

    }
}

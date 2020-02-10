package com.programming.java.threading;

import sun.jvm.hotspot.debugger.ThreadAccess;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {


    public static void main(String[] args) {

        final ReentrantLock lock = new ReentrantLock();

        System.out.println("ReentrantLock" + Thread.currentThread().getName());

        lock.lock();
        System.out.println(" Before unlock- " + lock.getHoldCount());
        System.out.println(" Before unlock- " + lock.getQueueLength());
        System.out.println(" Before unlock- " + lock.isFair());
        System.out.println(" Before unlock- " + lock.isHeldByCurrentThread());
        System.out.println(" Before unlock- " + lock.tryLock());
        System.out.println(" Before unlock- " + lock.getHoldCount());
        Boolean task = Boolean.FALSE;




//        try {
//            for (int i=0;i<12;i++){
//                System.out.println(">>>>>>>>>>>>>>>>  "+i+ " Before unlock- "+lock.getHoldCount());
//                Thread.sleep(1000l);
//            }
//        }catch (Exception e){
//
//        }finally {
//            lock.unlock();
//            System.out.println(" After - unlock "+lock.getHoldCount());
//
//        }

    }

}

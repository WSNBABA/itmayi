package com.itmayido.SHThread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 15:29
 * @VERSION 1.0
 */

public class JoinThreadDemo02 {

    /**
     * 问题：
     *          1.现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行  
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("t1,i:" + i);
                }
            }
        });
        Thread thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread01.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 20; i++) {
                    System.out.println("t2,i:" + i);
                }
            }
        });
        Thread thread03 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread02.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 20; i++) {
                    System.out.println("t3,i:" + i);
                }
            }
        });

        thread01.start();
        thread02.start();
        thread03.start();
    }
}

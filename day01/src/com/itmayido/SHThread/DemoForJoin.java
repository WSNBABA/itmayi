package com.itmayido.SHThread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 14:48
 * @VERSION 1.0
 */

public class DemoForJoin {

    /**
     *  把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。
     *  比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
     *
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("子线程：i:" + i);
                }
            }
        });

        thread.start();

        thread.join();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程：i:" + i);
        }

    }
}

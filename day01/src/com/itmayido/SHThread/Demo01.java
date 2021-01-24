package com.itmayido.SHThread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 14:20
 * @VERSION 1.0
 */

public class Demo01 {

    /**
     * 用户线程定义：用户自定义创建的线程，当主线程停止，用户线程不会停止的
     *
     * 守护线程定义： 当进程不存在或者主线程挂了，守护线程也会停止
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println("我是子线程...");
                }
            }
        });
        //标识是守护线程
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            System.out.println("我是主线程");
        }
        System.out.println("主线程执行完毕!");
    }
}

package com.itmayido.creatthread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 14:08
 * @VERSION 1.0
 *
 * 匿名内部类创建线程
 */

public class demo03 {
    public static void main(String[] args) {

        /**
         * 常用的线程类方法
         *
         * 1. start() 启动线程
         * 2. currentThread() 获取当前线程对象
         * 3. getID() 获取当前线程id
         * 4. getName() 获取当前线程名字
         * 5. sleep(long mill) 休眠线程
         * 6. stop() 停止线程
         *
         *
         * 常用的线程构造方法
         * 1. Thread() 分配一个新的Thread对象
         * 2. Thread(String name)
         * 3. Thread(Runnable r)
         * 4. Thread(Runnable r, String name)
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i:" + i);
                }
            }
        });

        thread.start();
    }

}

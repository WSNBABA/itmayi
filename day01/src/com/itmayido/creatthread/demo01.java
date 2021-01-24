package com.itmayido.creatthread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 13:59
 * @VERSION 1.0
 *
 * 创建多线程例子-Thread类 重写run方法
 */

class CreateThread extends Thread {
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("i:"+i);
        }
    }
}
public class demo01 {
    public static void main(String[] args) {
        CreateThread thread = new CreateThread();
        thread.start();
    }
}

package com.itmayido.creatthread;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/19 14:04
 * @VERSION 1.0
 *
 * 实现runnable接口
 */

class CreateRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i< 10; i++) {
            System.out.println("i:" + i);
        }
    }
}
public class demo02 {
    public static void main(String[] args) {
        CreateRunnable runnable = new CreateRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}

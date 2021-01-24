package com.itmayidu;

/**
 * @AUTHOR LZG
 * @DATE 2020/12/20 17:04
 * @VERSION 1.0
 */

class ThreadTrain1 implements Runnable {
    private int count = 100;
    private static Object oj = new Object();
    @Override
    public void run() {
        while (count>0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }

    public void sale() {

        synchronized(oj) {
            if(count>0){
                System.out.println(Thread.currentThread().getName()+", 出售第"+(100-count+1)+"票");
                count--;
            }
        }
    }
}

public class Demo01 {

    public static void main(String[] args) {
        ThreadTrain1 threadTrain1 = new ThreadTrain1();
        Thread t1 = new Thread(threadTrain1, "一号窗口");
        Thread t2 = new Thread(threadTrain1, "二号窗口");
        t1.start();
        t2.start();
    }

}

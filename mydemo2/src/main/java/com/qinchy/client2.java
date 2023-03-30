package com.qinchy;

import java.util.concurrent.CountDownLatch;

// 同一个对象，多个线程访问对象锁测试：
public class client2 {
    public static void main(String[] args) {
        final CountDownLatch c = new CountDownLatch(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                T t1 = new T();
                try {
                    System.out.println(Thread.currentThread().getName() + " #1# 启动");
                    c.await();
                    t1.test1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                T t1 = new T();
                try {
                    System.out.println(Thread.currentThread().getName() + " #2# 启动");
                    c.await();
                    t1.test2();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

        c.countDown();
        System.out.println("countdown -> 0");
    }
}
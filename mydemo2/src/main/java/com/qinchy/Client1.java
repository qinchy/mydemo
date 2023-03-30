package com.qinchy;

import java.util.concurrent.CountDownLatch;

// 不同对象访问对象锁测试：
public class Client1 {
    public static void main(String[] args) throws Exception {
        final CountDownLatch c = new CountDownLatch(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                T t1 = new T();
                try {
                    System.out.println(Thread.currentThread().getName() + " #1# 启动");
                    c.await();
                    T.testclass3();
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
                    T.testclass2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        c.countDown();
        System.out.println("countdown -> 0");
    }
}
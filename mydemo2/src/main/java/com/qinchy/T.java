package com.qinchy;

public class T {

    public static synchronized void testclass2() throws Exception { //同testclass1方法
        System.out.println(Thread.currentThread().getName() + "---testclass2 Doing");
        Thread.sleep(2000);
        testclass3();
    }

    public static synchronized void testclass3() throws Exception { //同testclass1方法
        System.out.println(Thread.currentThread().getName() + "---testclass3 Doing");
        Thread.sleep(2000);
        testclass2();
    }

    public void testclass1() throws Exception {
        synchronized (T.class) {//类锁
            System.out.println(Thread.currentThread().getName() + "---testclass1   Doing");
            Thread.sleep(2000);
        }
    }

    public void test1() throws Exception {
        synchronized (this) { //对象锁
            System.out.println(Thread.currentThread().getName() + "---test1  Doing");
            Thread.sleep(2000);
            test2();
        }

    }

    public synchronized void test2() throws Exception { //同test1方法
        System.out.println(Thread.currentThread().getName() + "--- test2 Doing");
        Thread.sleep(2000);
        test1();
    }

}
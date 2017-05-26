package com.jdk18;

/**
 * @author qinchy
 * @des        jdk1.8接口支持静态方法与默认方法
 */
public interface TestInterface {

    double calculate(int a);

    //这个是默认方法
    default String get(String aa, String bb) {
        System.out.println("我是jdk1.8默认实现方法...");
        return "";
    }

    String aa = "2222";

    //这个是静态方法
    static void staticmethod() {
        System.out.println("我是静态方法" + aa);
    }
}
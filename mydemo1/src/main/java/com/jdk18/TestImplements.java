package com.jdk18;

/**
 * Created by Administrator on 2017/5/26.
 */
public class TestImplements implements TestInterface {
    @Override
    public double calculate(int a) {
        return Math.pow(a,2D);
    }

    @Override
    public String get(String aa, String bb) {
        System.out.println("我是jdk1.8默认实现方法...");
        return "";
    }

    public static void main(String[] args){
        TestInterface instance = new TestImplements();
        Double d = instance.calculate(10);
        System.out.println(d);

        String s = instance.get("aa","bb");
        System.out.println(s);

    }
}

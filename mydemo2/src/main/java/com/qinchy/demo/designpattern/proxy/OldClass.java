package com.qinchy.demo.designpattern.proxy;

public class OldClass implements Source{
    @Override
    public void method() {
        System.out.println("我是默默无闻干活的人");
    }
}

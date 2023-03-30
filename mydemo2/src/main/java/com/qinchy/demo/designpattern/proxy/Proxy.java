package com.qinchy.demo.designpattern.proxy;

public class Proxy implements Source{
    private Source worker = new OldClass();

    @Override
    public void method() {
        worker.method();
        doSomethings();
    }
    void doSomethings(){
        System.out.println("我是专门抢功劳汇报的人");
    }
}

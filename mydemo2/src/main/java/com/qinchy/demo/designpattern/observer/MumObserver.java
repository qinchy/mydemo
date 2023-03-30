package com.qinchy.demo.designpattern.observer;

public class MumObserver extends Observer{
    @Override
    void handler() {
        System.out.println("妈妈接受到信息，开始处理。");
    }
}

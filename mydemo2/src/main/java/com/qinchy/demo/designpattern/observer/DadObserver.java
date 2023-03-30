package com.qinchy.demo.designpattern.observer;

public class DadObserver extends Observer{
    @Override
    void handler() {
        System.out.println("爸爸接收到信息，开始处理。");
    }
}

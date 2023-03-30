package com.qinchy.demo.designpattern.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver();
    }
}

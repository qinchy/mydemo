package com.qinchy.demo.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        Source proxy = new Proxy();
        proxy.method();
    }
}

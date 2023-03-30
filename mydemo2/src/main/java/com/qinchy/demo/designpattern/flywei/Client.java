package com.qinchy.demo.designpattern.flywei;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory= new FlyweightFactory<String>();
        Flyweight result = factory.getFlyweight("StringObject");
        System.out.println(result);

        System.out.println("+++++++++++++++++");
        result = factory.getFlyweight("StringObject");
        System.out.println(result);
    }
}

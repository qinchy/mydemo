package com.qinchy.demo.designpattern.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        mediator.setCustomer1(new Seller());
        mediator.setCustomer2(new Buyer());

        mediator.doSomething1();
        mediator.doSomething2();
    }
}

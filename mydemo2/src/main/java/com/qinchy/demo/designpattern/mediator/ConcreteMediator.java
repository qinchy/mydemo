package com.qinchy.demo.designpattern.mediator;

public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        customer1.doSomethings();
    }

    @Override
    public void doSomething2() {
        customer2.doSomethings();
    }
}

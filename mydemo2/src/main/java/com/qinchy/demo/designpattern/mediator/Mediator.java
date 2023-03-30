package com.qinchy.demo.designpattern.mediator;

public abstract class Mediator {
    //定义同事类
    protected Colleague customer1;
    protected Colleague customer2;

    //通过getter/setter方法把同事类注入进来
    public Colleague getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Colleague customer1) {
        this.customer1 = customer1;
    }

    public Colleague getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Colleague customer2) {
        this.customer2 = customer2;
    }

    //中介者模式的业务逻辑
    public abstract void doSomething1();

    public abstract void doSomething2();
}
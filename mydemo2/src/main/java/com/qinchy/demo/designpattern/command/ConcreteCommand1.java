package com.qinchy.demo.designpattern.command;

/**
 * 具体的Command类
 */
public class ConcreteCommand1 extends Command {
    //对哪个Receiver类进行命令处理
    private final Receiver receiver;

    //构造函数传递接收者
    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }

    //必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        this.receiver.doSomething();
    }
}
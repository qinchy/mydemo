package com.qinchy.demo.designpattern.command;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
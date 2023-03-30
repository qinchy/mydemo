package com.qinchy.demo.designpattern.command;

/**
 * 通用Receiver接受者角色：该角色就是干活的角色，命令传递到这里是应该被执行的
 */
public abstract class Receiver {
    public abstract void doSomething();
}
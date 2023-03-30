package com.qinchy.demo.designpattern.command;

/**
 * 调用者Invoker类：接收到命令，并执行命令
 */
public class Invoker {
    private Command command;

    public void setCommand(Command _command) {
        this.command = _command;
    }

    public void action() {
        // command就是接收到的命令
        this.command.execute();
    }
}
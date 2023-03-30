package com.qinchy.demo.designpattern.memento;

// 管理备忘录的类
public class Caretaker {
    RoleMemento memento;

    public RoleMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleMemento memento) {
        this.memento = memento;
    }
}
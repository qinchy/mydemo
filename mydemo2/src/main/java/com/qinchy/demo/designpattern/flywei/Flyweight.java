package com.qinchy.demo.designpattern.flywei;

public class Flyweight<T>{
    T obj;

    public Flyweight(T obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "obj=" + obj +
                '}';
    }
}
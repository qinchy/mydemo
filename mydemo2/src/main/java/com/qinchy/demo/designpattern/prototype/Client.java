package com.qinchy.demo.designpattern.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        System.out.println("oldHashCode = " + prototype.hashCode());
        Prototype o = (Prototype)prototype.clone();
        System.out.println("newHashCode = " + o.hashCode());
    }
}

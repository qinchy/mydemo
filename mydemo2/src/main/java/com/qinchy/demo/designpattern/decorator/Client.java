package com.qinchy.demo.designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        Worker worker= new Employee(new Leader());
        worker.work();
    }
}

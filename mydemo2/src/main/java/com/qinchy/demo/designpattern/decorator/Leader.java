package com.qinchy.demo.designpattern.decorator;

public class Leader implements Worker{
    @Override
    public void work() {
        System.out.println("干领导的活");
    }
}

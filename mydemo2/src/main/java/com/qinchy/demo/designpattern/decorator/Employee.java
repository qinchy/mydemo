package com.qinchy.demo.designpattern.decorator;

public class Employee implements Worker{
    private Worker worker;

    public Employee(Worker worker) {
        this.worker = worker;
    }

    void doOwnWork(){
        System.out.println("干自己的活");
    }

    @Override
    public void work() {
        // 这就是添加的额外的职责
        worker.work();

        doOwnWork();
    }
}

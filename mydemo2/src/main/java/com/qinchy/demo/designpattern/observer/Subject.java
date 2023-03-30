package com.qinchy.demo.designpattern.observer;

import java.util.Vector;

public class Subject {
    private final Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer o:observers) {
            o.handler();
        }
    }
}

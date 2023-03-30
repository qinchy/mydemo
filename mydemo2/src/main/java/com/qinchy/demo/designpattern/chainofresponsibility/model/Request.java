package com.qinchy.demo.designpattern.chainofresponsibility.model;

public class Request<T> {
    private Level requestLevel;
    private T requestData;

    public Request(Level requestLevel, T requestData) {
        this.requestLevel = requestLevel;
        this.requestData = requestData;
    }

    public void setRequestLevel(Level requestLevel) {
        this.requestLevel = requestLevel;
    }

    public T getRequestData() {
        return requestData;
    }

    public void setRequestData(T requestData) {
        this.requestData = requestData;
    }

    public Level getRequestLevel() {
        return requestLevel;
    }
}

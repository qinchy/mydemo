package com.qinchy.demo.designpattern.flywei;

import java.util.HashMap;

public class FlyweightFactory<T> {
    private HashMap<T, Flyweight> data;

    public FlyweightFactory() {
        data = new HashMap<T, Flyweight>();
    }

    public Flyweight getFlyweight(T object) {
        if (data.containsKey(object)) {
            System.out.println("非首次获取");
            return data.get(object);
        } else {
            System.out.println("首次获取");
            // 把对象缓存起来
            Flyweight flyweight = new Flyweight(object);
            data.put(object, flyweight);
            return flyweight;
        }
    }
}

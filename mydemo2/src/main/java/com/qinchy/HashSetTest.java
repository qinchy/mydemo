package com.qinchy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add(new Student(1,"Zhang")));
        System.out.println(set.add(new Student(2, "Li")));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

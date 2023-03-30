package com.qinchy;

import java.io.Serializable;
import java.util.Objects;

public class CallByValueOrRef {
    public static void main(String[] args) {
        Student s1 = new Student(1, "XiaoLi");
        Student s2 = new Student(2, "XiaoWang");
        swap(s1, s2);
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }

    public static void swap(Student s1, Student s2) {
//        Student temp = s1;
//        s1 = s2;
//        s2 = temp;
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());
        s1.setName("XiaoZhang");
        s2.setName("XiaoWu");
    }

}


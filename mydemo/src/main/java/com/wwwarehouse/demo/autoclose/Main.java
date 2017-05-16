package com.wwwarehouse.demo.autoclose;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chaoyong.qin on 2017/5/16.
 */
public class Main {
    //声明资源时要分析好资源关闭顺序,先声明的后关闭
    //在try-with-resource中也可以有catch与finally块。
    //只是catch与finally块是在处理完try-with-resource后才会执行。
    public static void main(String[] args) {
        try (Resource res = new Resource();
             ResourceOther resOther = new ResourceOther()) {
            res.doSome();
            resOther.doSome();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            String str = readFirstLineFromFile("D:\\.m2\\repository\\settings.xml");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //JDK1.7中的写法，利用AutoCloseable接口
    //代码更精练、完全
    public static String readFirstLineFromFile(String path) throws IOException {
        //BufferedReader已经实现了AutoCloseable
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}

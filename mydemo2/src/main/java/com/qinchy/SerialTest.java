package com.qinchy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
    public static void main(String[] args) throws Exception {

        //文件路径
        String filePath = "d:\\object.dat";

        //创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 e:data.dat
        oos.writeInt(100); // int -> Integer (实现了 Serializable)

        oos.writeBoolean(true); //boolean -> Boolean (实现了 Serializable)

        oos.writeChar('a'); //char -> Character (实现了 Serializable)

        oos.writeDouble(9.5); //double -> Double (实现了 Serializable)

        oos.writeUTF("努力学习"); //String (实现了 Serializable)

        //保存一个dog对象
        oos.writeObject(new Student(10, "小白"));

        oos.close();
        System.out.println("保存完毕");

    }
}

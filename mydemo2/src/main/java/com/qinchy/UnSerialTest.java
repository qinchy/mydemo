package com.qinchy;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UnSerialTest {
    public static void main(String[] args) throws Exception {

        //指定反序列化的文件路径
        String filePath = "d:\\object.dat";

        //创建对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取（反序列化）的顺序需要和保存数据（序列化）的顺序一致，否则会报异常
        System.out.println(ois.readInt());

        System.out.println(ois.readBoolean());

        System.out.println(ois.readChar());

        System.out.println(ois.readDouble());

        System.out.println(ois.readUTF());

        Object o = ois.readObject();
        System.out.println("运行类型=" + o.getClass());
        System.out.println("Student信息=" + o);


        //特别重要的细节：需要我们将Dog类的定义，放到可以引用的位置
        Student s = (Student) o;
        System.out.println(s.getName());


        //关闭流,关闭外层流即可，底层会关闭 FileInputStream 流
        ois.close();
    }
}

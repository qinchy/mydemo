package com.qinchy.demo.designpattern.bridge;

//将怎么画与图形解耦
public class Client {

    public static void main(String[] args) {
        // 将画红色的圆圈与圆圈、以及图形进行解耦
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

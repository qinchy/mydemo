package com.qinchy.demo.designpattern.chainofresponsibility;

import com.qinchy.demo.designpattern.chainofresponsibility.model.Level;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Request;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Response;

public class Client {
    public static void main(String[] args) {
        Handler handler = new InfoHandler();
        handler.setNext(new DebugHandler());

        //Request request = new Request(Level.INFO, "这是INFO信息");
        Request request = new Request(Level.DEBUG, "这是DEBUG信息");

        Response response = handler.handleMessage(request);
        System.out.println(response);
    }
}

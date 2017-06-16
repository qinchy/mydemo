package com.qinchy.fel;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * Created by chaoyong.qin on 2017/6/16.
 */
public class FelMain {
    private static FelEngine fel = new FelEngineImpl();

    public static void main(String[] args){
        Object result = fel.eval("5000*12+7500");
        System.out.println(result);
        express1();
        express2();
        express3();
        express4();
        express5();
        express6();
        express7();
        express8();
    }

    private static void express1(){
        FelContext ctx = fel.getContext();
        ctx.set("x", 5000);
        ctx.set("y", 12);
        Object result = fel.eval("50/100*x+y");
        System.out.println(result);
    }

    private static void express2(){
        Object result = fel.eval("500");
        System.out.println(result);
    }

    private static void express3(){
        Object result = fel.eval("500%3");
        System.out.println(result);
    }

    private static void express4(){
        Object result = fel.eval("1>2?3:4");
        System.out.println(result);
    }

    private static void express5(){
        Object result = fel.eval("8+11-5*(6/3)");
        System.out.println(result);
    }

    private static void express6(){
        FelContext ctx = fel.getContext();
        ctx.set("x", 2);
        ctx.set("y", 5);
        Object result = fel.eval("$('Math').pow(x,y)",ctx);
        System.out.println(result);
    }

    private static void express7(){
        //至少保留20
        FelContext ctx = fel.getContext();
        ctx.set("x", 10);
        ctx.set("y", 20);
        Object result = fel.eval("(x>y)?(x-y):0");
        System.out.println(result);
    }

    private static void express8(){
        //至少发货20
        FelContext ctx = fel.getContext();
        ctx.set("x", 10);
        ctx.set("y", 20);
        Object result = fel.eval("(x>=y)?x:0");
        System.out.println(result);
    }
}

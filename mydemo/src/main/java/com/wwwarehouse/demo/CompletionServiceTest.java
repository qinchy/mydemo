package com.wwwarehouse.demo;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by chaoyong.qin on 2017/5/17.
 */
public class CompletionServiceTest {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        CompletionService<String> cs = new ExecutorCompletionService<String>(exec);
        System.out.println("1~"+DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        for (int i = 0; i < 10; i++) {
            final int j = i;
//            cs.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("第"+j+"个使用的线程是" +Thread.currentThread().getName());
//                }
//            },String.valueOf(i));
            cs.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("第" + j + "个使用的线程是" + Thread.currentThread().getName());
                    return String.valueOf(j);
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            Future<String> take = cs.take();
            System.out.println(take.get());
            System.out.println("2~"+DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        }

        System.out.println("3~"+DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }
}

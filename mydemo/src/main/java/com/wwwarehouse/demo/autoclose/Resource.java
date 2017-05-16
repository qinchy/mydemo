package com.wwwarehouse.demo.autoclose;

/**
 * 在JDK7中只要实现了AutoCloseable或Closeable接口的类或接口，都可以使用try-with-resource来实现异常处理和资源关闭
 */
class Resource implements AutoCloseable {
 void doSome() {
  System.out.println("do something");
 }

 @Override
 public void close() throws Exception {
  System.out.println("resource closed");
 }
}
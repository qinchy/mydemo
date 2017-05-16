package com.wwwarehouse.demo.autoclose;

/**
 * 在JDK7中只要实现了AutoCloseable或Closeable接口的类或接口，都可以使用try-with-resource来实现异常处理和资源关闭
 */
class ResourceOther implements AutoCloseable {
 void doSome() {
  System.out.println("do something other");
 }

 @Override
 public void close() throws Exception {
  System.out.println("other resource closed");
 }
}
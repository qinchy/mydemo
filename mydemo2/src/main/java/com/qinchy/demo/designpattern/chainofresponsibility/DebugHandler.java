package com.qinchy.demo.designpattern.chainofresponsibility;

import com.qinchy.demo.designpattern.chainofresponsibility.model.Level;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Request;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Response;

/**
 * debug日志处理器
 */
public class DebugHandler extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return Level.DEBUG;
    }

    @Override
    protected Response<String> echo(Request request) {
        return new Response<>(302, "REDIRECT", "SUCCESS");
    }
}

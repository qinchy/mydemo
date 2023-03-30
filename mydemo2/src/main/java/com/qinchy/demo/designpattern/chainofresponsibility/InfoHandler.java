package com.qinchy.demo.designpattern.chainofresponsibility;

import com.qinchy.demo.designpattern.chainofresponsibility.model.Level;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Request;
import com.qinchy.demo.designpattern.chainofresponsibility.model.Response;

public class InfoHandler extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return Level.INFO;
    }

    @Override
    protected Response<String> echo(Request request) {
        return new Response<>(404,"NotFound","FAILURE");
    }
}

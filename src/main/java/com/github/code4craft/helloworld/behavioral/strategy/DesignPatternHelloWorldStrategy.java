package com.github.code4craft.helloworld.behavioral.strategy;

/**
 * @author yihua.huang@dianping.com
 */
public class DesignPatternHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Strategy!";
    }
}

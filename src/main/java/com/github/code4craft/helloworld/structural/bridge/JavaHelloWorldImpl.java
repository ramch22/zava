package com.github.code4craft.helloworld.structural.bridge;

/**
 * @author yihua.huang@dianping.com
 */
public class JavaHelloWorldImpl implements HelloWorldImpl {
    @Override
    public String generate() {
        return "Hello Java!";
    }
}

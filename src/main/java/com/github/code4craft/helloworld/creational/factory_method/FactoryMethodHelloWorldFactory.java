package com.github.code4craft.helloworld.creational.factory_method;

import com.github.code4craft.helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class FactoryMethodHelloWorldFactory extends HelloWorldFactory{

    @Override
    public HelloWorld createHelloWorld() {
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello Factory Method!";
            }
        };
    }
}

package com.cc.dynamicproxy.cglib;

/**
 * Created by kelan on 2018/8/30.
 */
public class Test {

    public static void main(String[] args) {
        Apple apple = new Apple();

        Apple result = (Apple)new AppleProxy(apple).getProxyInstance();

        result.grow();
    }
}

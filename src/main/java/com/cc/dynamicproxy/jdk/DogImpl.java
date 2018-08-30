package com.cc.dynamicproxy.jdk;

/**
 * Created by kelan on 2018/8/30.
 */
public class DogImpl implements Dog {
    @Override
    public void bark() {
        System.out.println("wow~~");
    }
}

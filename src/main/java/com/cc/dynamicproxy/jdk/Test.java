package com.cc.dynamicproxy.jdk;

/**
 * Created by kelan on 2018/8/30.
 */
public class Test {

    public static void main(String[] args) {
        Dog dog = new DogImpl();

        Dog dogProxy = (Dog) new DogProxy(dog).getProxyInstance();

        dogProxy.bark();
    }
}

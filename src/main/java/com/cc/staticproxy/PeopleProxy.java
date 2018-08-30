package com.cc.staticproxy;

/**
 * 代理的作用是：在不改变目标对象的情况夏，使用代理对象增加目标对象的行为
 *
 * 使用静态代理，需要目标对象和代理对象实现相同的接口
 */
public class PeopleProxy implements People {

    @Override
    public void say() {

        System.out.println("----start-----");
        PeopleImpl people = new PeopleImpl();
        people.say();
        System.out.println("----end----");
    }
}

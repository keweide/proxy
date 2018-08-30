package com.cc.staticproxy;

import org.springframework.stereotype.Component;

/**
 * Created by kelan on 2018/8/30.
 */
public class PeopleImpl implements People {
    @Override
    public void say() {
        System.out.println("hello everybody");
    }
}

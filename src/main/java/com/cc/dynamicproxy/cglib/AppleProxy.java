package com.cc.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib采用生成子类的方式实现动态代理
 * 目标对象不需要实现子类
 */
public class AppleProxy implements MethodInterceptor {

    private Object target;

    public AppleProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类
        return enhancer.create();
    }

    //实现回调函数
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----I am coming----");
        Object result = method.invoke(target,objects);
        System.out.println("----really delicious-----");
        return null;
    }
}

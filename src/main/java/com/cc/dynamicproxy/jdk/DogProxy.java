package com.cc.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk API实现动态代理，代理对象不需要实现接口，但是目标对象一定要实现接口
 */
public class DogProxy {

    //目标对象
    private Object target;

    public DogProxy(Object target) {
        this.target = target;
    }
    //创建代理
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("----dog start-----");
                        //执行目标的方法
                        Object result = method.invoke(target,args);
                        System.out.println("----dog end-----");
                        return result;
                    }
                }
        );
    }
}

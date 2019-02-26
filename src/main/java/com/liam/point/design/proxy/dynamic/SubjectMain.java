package com.liam.point.design.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午6:08
 * @desc:
 */
public class SubjectMain {

    public static void main(String[] args) {
        Subject subject =  new RealSubject();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxyClass =
                (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, handler);
        proxyClass.getName();
    }
}

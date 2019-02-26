package com.liam.point.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午6:03
 * @desc:
 */
public class MyInvocationHandler implements InvocationHandler {

    private Subject subject;

    public MyInvocationHandler(Subject subject){
        this.subject = subject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理方法");
        if (method.getName().equals("getName")) {
            String invoke = (String)method.invoke(subject,args);
            return invoke;
        }

        return null;
    }
}

package com.liam.point.design.proxy.dynamic;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午6:02
 * @desc:
 */
public class RealSubject implements Subject{

    @Override
    public String getName() {
        String name = "英语书";
        System.out.println(name);
        return name;
    }
}

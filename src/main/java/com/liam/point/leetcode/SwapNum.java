package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/25 下午2:26
 * @desc: 交换两数
 */
public class SwapNum {

    public static void main(String[] args) {
        int a = 10, b = 20;
        swapNum(a,b);
    }

    public static void swapNum(Integer a,Integer b){
        System.out.println(a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}

package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/25 下午2:26
 * @desc: 交换两数
 */
public class SwapNumber {

    public static void main(String[] args) {
        int a = 10, b = 20;
//        swapNum(a,b);
        System.out.println(a^a^b);
    }

    public static void swapNum(Integer a,Integer b){
        System.out.println(a+" "+b);
        a=a^b;
        //带入a即--> b = (a^b)^b --> a^(b^b) --> a^0 = a
        b=a^b;
        //带入b即--> a = a^(a^b) --> (a^a)^b --> 0^b = b
        a=a^b;
        System.out.println(a+" "+b);
    }

    public static void swapNum2(Integer a,Integer b){
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}

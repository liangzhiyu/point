package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/28 上午10:49
 * @desc: 取出指定位二进制
 */
public class DesignatedNumber {

    public static void main(String[] args) {
        Integer number = getDesignatedNumber(7, 2);
        System.out.println(number);
    }

    public static Integer getDesignatedNumber(Integer number, Integer i) {
        int rightNumber = number >> i;
        return rightNumber & 1;
    }
}

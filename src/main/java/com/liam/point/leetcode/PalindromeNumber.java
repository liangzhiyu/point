package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/28 上午10:37
 * @desc: 判断数字是否为回文数(从前往后和从后往前都一样)
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        String number = "1234321";
        Boolean flag = isPalindromeNumber(number);
        System.out.println(flag);
    }

    public static Boolean isPalindromeNumber(String number){
        String[] split = number.split("");
        for (int i = 0; i < split.length; i++) {
            String start = split[i];
            String end = split[split.length - i-1];
            if (!start.equals(end)) {
                return false;
            }
            System.out.println(start+"  "+end);
        }
        return true;
    }
}

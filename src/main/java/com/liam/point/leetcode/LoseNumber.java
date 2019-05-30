package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/28 上午11:31
 * @desc: 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，
 * 找出 0 .. n 中没有出现在序列中的那个数
 */
public class LoseNumber {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 4,5, 6, 7, 9};
        Integer loseNumber = getLoseNumber(arr);
        System.out.println(loseNumber);
    }

    /**
     * @author: liangzy
     * @date: 19-5-28 上午11:33
     * @param: [arr]
     * @return: java.lang.Integer
     * @desc: 解法1————求和法：
     * 1.求出 0 到 n 之间所有的数字之和
     * 2.遍历数组计算出原始数组中数字的累积和
     * 3.两和相减，差值就是丢失的那个数字
     */
    public static Integer getLoseNumber(Integer[] arr) {
        //求出 0 到 n 之间所有的数字之和
        int length = arr.length;
        int sum = (arr[0] + arr[length-1]) * (length+1) / 2;

        //遍历数组计算出原始数组中数字的累积和
        int loseSum = 0;
        for (int i = 0; i < arr.length; i++) {
            loseSum += arr[i];
        }
        //两和相减，差值就是丢失的那个数字
        return sum-loseSum;
    }


    /**
     * @author: liangzy
     * @date: 19-5-29 上午10:46
     * @param: [arr]
     * @return: java.lang.Integer
     * @desc: 异或法:
     * 1.补充一个完整的数组和原数组进行组合
     * 2.用异或找出只出现一次的数字
     */
    public static Integer getLostNumberByXOR(Integer[] arr){

        return null;
    }
}

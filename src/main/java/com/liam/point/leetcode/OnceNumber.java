package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/05/27 上午10:54
 * @desc: 一组整型数据中,有一个数只出现了一次,
 * 其他的数都出现了两次,让你来找出一个数。
 */
public class OnceNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int tmp = arr[0];
        for(int i = 1;i < arr.length; i++){
            tmp = tmp ^ arr[i];
            System.out.println(tmp+"  "+i);
        }
    }
}

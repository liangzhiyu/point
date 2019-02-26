package com.liam.point.leetcode;

/**
 * @author: liangzy
 * @date: 2019/02/19 上午9:57
 * @desc: 两数之和
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1,7,8,10};
        int[] index = twoSum(nums,15);
        for (int i : index) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }
}

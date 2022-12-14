package com.pasenger.algorithms.lc01;

/**
 * 解法1 暴力穷举
 *
 * @author Pasenger
 * @date 2022/11/16 21:47
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;
    }
}

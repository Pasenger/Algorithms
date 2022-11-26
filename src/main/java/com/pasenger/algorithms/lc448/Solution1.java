package com.pasenger.algorithms.lc448;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution 1: 变负数
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/26 20:06
 */
public class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        for (int num : nums) {
            // 对n取模，还原原来的值
            int x = (num - 1) % n;
            nums[x] += n;
        }

        for (int i = 0; i < n; i++) {
            if(nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}

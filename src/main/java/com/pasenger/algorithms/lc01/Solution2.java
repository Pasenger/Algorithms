package com.pasenger.algorithms.lc01;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法1 暴力穷举 减少重复扫描
 *
 * @author Pasenger
 * @date 2022/11/16 21:47
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        // key: value, value: array index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer cacheIndex = map.get(diff);
            if (cacheIndex != null) {
                result[0] = cacheIndex;
                result[1] = i;

                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }
}

package com.pasenger.algorithms.lc01;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法4
 *
 * @author Pasenger
 * @date 2022/11/16 21:47
 */
public class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        // key: value, value: array index
        Map<Integer, Integer> map = new HashMap<>();

        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return result;
    }
}

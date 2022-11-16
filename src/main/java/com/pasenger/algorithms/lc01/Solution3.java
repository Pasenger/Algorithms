package com.pasenger.algorithms.lc01;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法3 缓存元素再查找
 *
 * @author Pasenger
 * @date 2022/11/16 21:47
 */
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        // key: value, value: array index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int diff = 0;
        Integer cacheIndex = null;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            cacheIndex = map.get(diff);
            if (cacheIndex != null && cacheIndex.intValue() != i) {
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
        }

        return result;
    }
}

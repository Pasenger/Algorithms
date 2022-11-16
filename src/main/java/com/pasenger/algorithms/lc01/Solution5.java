package com.pasenger.algorithms.lc01;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法5 解法4 + 分割查找
 *
 * @author Pasenger
 * @date 2022/11/16 21:47
 */
public class Solution5 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        // key: value, value: array index
        Map<Integer, Integer> map = new HashMap<>();

        int diff = 0;

        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                if (i < index) {
                    return new int[]{i, index};
                } else {
                    return new int[]{index, i};
                }
            }

            map.put(nums[i], i);

            diff = target - nums[j];
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                if (j < index) {
                    return new int[]{j, index};
                } else {
                    return new int[]{index, j};
                }
            }

            map.put(nums[j], j);
        }

        return result;
    }
}

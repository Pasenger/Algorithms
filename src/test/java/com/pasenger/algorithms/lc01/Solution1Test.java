package com.pasenger.algorithms.lc01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pasenger
 * @date 2022/11/16 21:50
 */
@DisplayName("两数之和测试")
class Solution1Test {
    Solution1 solution = new Solution1();

    @DisplayName("nums = [3, 3], target = 6")
    @Test
    void testTwoSum1() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @DisplayName("nums = [3, 2, 4], target = 6")
    @Test
    void testTwoSum2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @DisplayName("nums = [2,7,11,15], target = 9")
    @Test
    void testTwoSum3() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}
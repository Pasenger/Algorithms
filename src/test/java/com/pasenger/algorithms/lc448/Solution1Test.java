package com.pasenger.algorithms.lc448;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/26 20:17
 */
@DisplayName("LeetCode-448-Solution1")
class Solution1Test {
    Solution1 solution = new Solution1();

    @DisplayName("Case1")
    @Test
    void findDisappearedNumbers1() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solution.findDisappearedNumbers(nums);

        List<Integer> expected = Arrays.asList(5, 6);
        assertIterableEquals(expected, result);
    }

    @DisplayName("Case2")
    @Test
    void findDisappearedNumbers2() {
        int[] nums = new int[]{1,1};
        List<Integer> result = solution.findDisappearedNumbers(nums);

        List<Integer> expected = Arrays.asList(2);
        assertIterableEquals(expected, result);
    }
}
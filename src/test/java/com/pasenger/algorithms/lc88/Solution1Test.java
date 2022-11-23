package com.pasenger.algorithms.lc88;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/23 19:58
 */
@DisplayName("LeetCode-88_Solution1")
class Solution1Test {
    Solution1 solution = new Solution1();

    @DisplayName("Case-1")
    @Test
    void testMerge1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[]{1,2,2,3,5,6};

        assertArrayEquals(expected, nums1);
    }

    @DisplayName("Case-2")
    @Test
    void testMerge2() {
        int[] nums1 = new int[]{1};
        int m = 1;

        int[] nums2 = new int[]{};
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[]{1};

        assertArrayEquals(expected, nums1);
    }

    @DisplayName("Case-3")
    @Test
    void testMerge3() {
        int[] nums1 = new int[]{0};
        int m = 0;

        int[] nums2 = new int[]{1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[]{1};

        assertArrayEquals(expected, nums1);
    }
}
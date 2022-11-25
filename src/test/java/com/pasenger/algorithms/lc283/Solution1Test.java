package com.pasenger.algorithms.lc283;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/25 19:06
 */
@DisplayName("LeetCode-283-Solution1")
class Solution1Test {
    Solution1 solution = new Solution1();

    @DisplayName("Case01")
    @Test
    void testMoveZeroes1(){
        int[] nums = new int[]{0,1,0,3,12};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }

    @DisplayName("Case02")
    @Test
    void testMoveZeroes2(){
        int[] nums = new int[]{0};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{0}, nums);
    }
}
package com.pasenger.algorithms.lc70;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Pasenger
 * @date 2022/11/15 22:22
 */
@DisplayName("Leetcode_70 爬楼梯 递归解法1")
class Solution1Test {
    Solution1 solution = new Solution1();

    @DisplayName("N = 1")
    @Test
    void testClimbStairs1(){
        System.out.println(solution.climbStairs(1));
    }

    @DisplayName("N = 3")
    @Test
    void testClimbStairs3(){
        System.out.println(solution.climbStairs(3));
    }

    @DisplayName("N = 10")
    @Test
    void testClimbStairs10(){
        System.out.println(solution.climbStairs(10));
    }

    @DisplayName("N = 45")
    @Test
    void testClimbStairs45(){
        System.out.println(solution.climbStairs(45));
    }
}
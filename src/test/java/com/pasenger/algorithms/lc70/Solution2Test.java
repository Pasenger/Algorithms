package com.pasenger.algorithms.lc70;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pasenger
 * @date 2022/11/15 22:32
 */
@DisplayName("Leetcode-70 递归解法_带缓存")
class Solution2Test {

    Solution2 solution = new Solution2();

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
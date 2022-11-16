package com.pasenger.algorithms.lc70;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 递归方式求解, 缓存过程结果
 *
 * @author Pasenger
 * @date 2011-11-15
 */
public class Solution3 {

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int result = 0;

        // 上一步
        int pre = 2;

        // 上上一步
        int pre2 = 1;

        for (int i = 3; i <= n; i++) {
            result = pre + pre2;
            pre2 = pre;
            pre = result;
        }

        return result;
    }
}
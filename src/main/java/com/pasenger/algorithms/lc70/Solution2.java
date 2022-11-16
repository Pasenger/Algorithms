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
public class Solution2 {

    private Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        Integer v = map.get(n);
        if (v != null) {
            return v;
        } else {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, result);

            return result;
        }
    }
}

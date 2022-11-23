package com.pasenger.algorithms.lc88;

import java.util.Arrays;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/23 19:57
 */
public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
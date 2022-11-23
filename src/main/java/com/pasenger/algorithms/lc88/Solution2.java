package com.pasenger.algorithms.lc88;

import java.util.Arrays;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/23 19:57
 */
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int retLen = m + n;
        int[] temp = new int[retLen];

        for (int i = 0, nums1Index = 0, nums2Index = 0; i < retLen; i++) {
            if (nums1Index >= m) {
                // nums1已经取完
                temp[i] = nums2[nums2Index++];
                continue;
            }

            if (nums2Index >= n) {
                // nums2已经取完
                temp[i] = nums1[nums1Index++];
                continue;
            }

            if (nums1[nums1Index] < nums2[nums2Index]) {
                // nums1中元素值小于nums2
                temp[i] = nums1[nums1Index++];
            } else {
                temp[i] = nums2[nums2Index++];
            }
        }


        for (int i = 0; i < retLen; i++) {
            nums1[i] = temp[i];
        }
    }
}
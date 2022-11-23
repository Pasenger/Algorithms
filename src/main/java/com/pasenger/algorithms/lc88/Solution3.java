package com.pasenger.algorithms.lc88;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/23 19:57
 */
public class Solution3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int retLen = m + n;

        for (int i = retLen - 1, nums1Index = m - 1, nums2Index = n - 1; i >= 0; i--) {
            if (nums1Index < 0) {
                // nums1已经取完
                nums1[i] = nums2[nums2Index--];

                continue;
            }

            if (nums2Index < 0) {
                // nums2已经取完
                nums1[i] = nums1[nums1Index--];
                continue;
            }

            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[i] = nums1[nums1Index--];
            } else {
                nums1[i] = nums2[nums2Index--];
            }
        }
    }
}
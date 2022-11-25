package com.pasenger.algorithms.lc283;

/**
 * Desc
 *
 * @Author Pasenger &lg;pasenger@163.com&gt;
 * @Time 2022/11/25 18:59
 */
public class Solution2 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // 第一次遍历，j指针记录非0元素的个数
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // 剩下的都为0，添加到数组末尾
        while (j < nums.length){
            nums[j++] = 0;
        }
    }
}

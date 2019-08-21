package com.CK;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(new Solution().findMin(nums));
    }
}

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);

        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            int midVal = nums[mid];

            if (midVal < nums[mid + 1] && midVal < nums[mid - 1]) return midVal;

            if (midVal > nums[right])
                left = mid;
            else if (midVal < nums[right] && midVal < nums[left])
                right = mid;
            else
                right--;

        }

        return Math.min(nums[left], nums[right]);
    }
}
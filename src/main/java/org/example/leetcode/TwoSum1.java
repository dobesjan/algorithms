package org.example.leetcode;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] sumIndexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int firstValue = nums[i];
            for (int ii = 0; ii < nums.length; ii++) {
                if (i != ii) {
                    int secondValue = nums[ii];
                    if (firstValue + secondValue == target) {
                        sumIndexes[0] = i;
                        sumIndexes[1] = ii;
                    }
                }
            }
        }

        return sumIndexes;
    }
}

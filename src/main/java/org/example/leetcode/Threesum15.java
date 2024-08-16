package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Threesum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int listLength = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int k = 0; k < nums.length; k++) {

                if (k != i) {
                    for (int j = 0; j < nums.length; j++) {

                        if (j != k && i != j) {
                            int sum = nums[i] + nums[j] + nums[k];
                            if (sum == 0) {
                                List<Integer> combination = new ArrayList<>();
                                combination.add(nums[i]);
                                combination.add(nums[j]);
                                combination.add(nums[k]);

                                if (!isDuplicated(result, combination)) {
                                    result.add(combination);
                                    listLength += 3;
                                }
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    private boolean isDuplicated(List<List<Integer>> resultSet, List<Integer> triplet) {
        for (int i = 0; i < resultSet.size(); i++) {
            int matches = 0;
            for (int ii = 0; ii < resultSet.get(i).size(); ii++) {
                for (int j = 0; j < triplet.size(); j++) {
                    if (triplet.get(j) == resultSet.get(i).get(ii)) {
                        matches += 1;
                        if (matches >= 3) return true;
                    }
                }
            }
        }

        return false;
    }

    public void demo() {
        int[] nums = {3,0,-2,-1,1,2};
        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}

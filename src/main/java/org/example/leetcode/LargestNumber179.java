package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber179 {
    public String largestNumber(int[] nums) {
        List<char[]> numChars = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            char[] charArray = String.valueOf(nums[i]).toCharArray();
            numChars.add(charArray);
        }

        int maxIndex = 0;
        String result = "";

        while (numChars.size() > 0) {
            for (int j = 0; j < numChars.size(); j++) {
                char[] max = numChars.get(maxIndex);
                char[] current = numChars.get(j);

                if (Character.getNumericValue(current[0]) > Character.getNumericValue(max[0])) {
                    maxIndex = j;
                } else if (Character.getNumericValue(current[0]) == Character.getNumericValue(max[0])) {
                    if (current.length > 1 && max.length > 1 && Character.getNumericValue(current[1]) > Character.getNumericValue(max[1])) {
                        maxIndex = j;
                    } else if (current.length > 1 && Character.getNumericValue(current[1]) >= Character.getNumericValue(max[0])) {
                        maxIndex = j;
                    }
                }
            }

            result = result + String.valueOf(numChars.get(maxIndex));
            numChars.remove(maxIndex);
            maxIndex = 0;
        }

        return result;
    }
}

package Session9;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMapSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[]{numMap.get(diff), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }

        public static void main (String[]args){
            int[] nums1 = {2, 7, 11, 15};
            int target = 9;
            int[] result1 = twoSum(nums1, target);
            System.out.println("Output: " + result1[0] + " " + result1[1]);
        }
    }



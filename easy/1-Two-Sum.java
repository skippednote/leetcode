import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];

            if (indexMap.containsKey(diff) && i != indexMap.get(diff)) {
                return new int[] { i, indexMap.get(diff) };
            }
            indexMap.put(nums[i], i);
        }

        return new int[0];
    }
}
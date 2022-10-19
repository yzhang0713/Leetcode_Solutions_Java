import java.util.Map;
import java.util.HashMap;
/**
 * Problem 1. Two Sum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> mapNums = new HashMap<>();
        // Build the map
        for (int i = 0; i < nums.length; i++) {
            if (mapNums.containsKey(target - nums[i])) {
                result[0] = mapNums.get(target - nums[i]);
                result[1] = i;
                break;
            }
            mapNums.put(nums[i], i);
        }
        return result;
    }
}

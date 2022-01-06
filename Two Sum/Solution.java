import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            // if (nums[i] > target) break;   
            int rem = target - nums[i];
            if (indices.containsKey(rem)) {
                if (indices.get(rem) == i) continue;
                return new int[]{i, indices.get(rem)};
            } 
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,2,4};
        int[] result = twoSum(test, 6); 
        System.out.println(Arrays.toString(result));
    }
}
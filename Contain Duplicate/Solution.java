import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
    // public static boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == nums[i - 1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    public static void main(String[] args) {
        int[] test = new int[]{1,1,3,1};
        System.out.println(containsDuplicate(test));
    }
}
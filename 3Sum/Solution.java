import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                conquer(nums, i , res);
            }
        }
        return res;
    }

    public void conquer(int[] nums, int index, List<List<Integer>> res) {
        int l = index + 1; int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r] + nums[index];
            if (sum == 0) {
                res.add(Arrays.asList(nums[index], nums[l], nums[r]));
                l++;
                r--;
            
                while (l < r && nums[l] == nums[l - 1]) l++;
                while (l < r && nums[r] == nums[r + 1]) r--;
            } else if (sum > 0) {
                r--;
            } else l++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 0, 1,  2, -1 ,-4};
        Solution sol = new Solution();
        sol.threeSum(nums);
    }
}
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1; int r = nums.length - 1;
            while (l < r) {
                int sum  = nums[i] + nums[l] + nums[r];
                int distance = Math.abs(sum - target);
                res = distance < Math.abs(res - target) ? sum : res;
                if (sum < target) l++;
                else r--;
            }
        } 
        return res;
    }

    public static void main(String[] args) {
        int nums[] = new int[] {-100,-98,-2,-1};
        int target = 1;
        Solution sol = new Solution();
        System.out.println(sol.threeSumClosest(nums, target));
    }
}
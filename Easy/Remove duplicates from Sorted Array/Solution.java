

class Solution {
    public static int removeDuplicates(int[] nums) {
        int result = 0;
        for (int r = 1, l = 0; r < nums.length ; r++) {
            if (nums[r] == nums[r-1]) 
                result++; 
            else if (nums[r] != nums[l]) {
                nums[++l] = nums[r];
            }
            if (r == nums.length - 1 && l != r) 
                nums[++l] = Integer.MIN_VALUE; 
        }
        return result;
    }

    public static void main(String[] args) {
        int test[] = new int[] {1,1,2};
        int answer = removeDuplicates(test);
        
    }
}
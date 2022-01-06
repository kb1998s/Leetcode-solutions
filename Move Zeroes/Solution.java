import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public static void moveZeroes(int[] nums) {
        int non_zero = 0;
        for (int num: nums) {
            if (num != 0) nums[non_zero++] = num;
        }
        for (int i = non_zero; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] test = new int[] {4,0,0,3,5,0,1};
        moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}
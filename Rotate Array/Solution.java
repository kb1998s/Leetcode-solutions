class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp_arr = nums.clone();
        for (int i = 0, j = n - (k % n); i < nums.length; i++) {
            if (j < n) {
                nums[i] = temp_arr[j];
                j++;
                continue;
            } 
            nums[i] = temp_arr[i - (k % n)];
        }
        return;
    }
    public static void main(String[] args) {
        int[] test = new int[] {1,2,3,4,5,6,7};
        rotate(test, 10);
    }
}
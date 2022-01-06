import java.util.Hashtable;

class Solution {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Hashtable<Integer, Boolean> hash = new Hashtable<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]) && hash.get(nums[i]) == true){
                hash.replace(nums[i], false); continue;
            } 
            hash.put(nums[i], true);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hash.get(nums[i]) == true) return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] test = new int[] {4,1,2,1,2};
        singleNumber(test);
    }


}
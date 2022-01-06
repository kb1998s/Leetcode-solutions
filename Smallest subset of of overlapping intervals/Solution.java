import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    public static int getMax(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length;i ++) {
            if (nums[i][1] > max) {
                max = nums[i][1];
            }
        }
        return max;
    }
    public static int[][] toArray(ArrayList<int[]> result) {
        int[][] arr = new int[result.size()][2]; 
        for (int i = 0; i < result.size(); i ++) {
            arr[i] = result.get(i);
        }

        return arr;
    }

    public static int[][] solution(int[][] intervals) {
        // Ascending sort based on start day
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        ArrayList<int[]> result = new ArrayList<>();
        int currBest = intervals[0][0];
        int max = getMax(intervals);
        int[] 

        return toArray(result);
    }
    public static void main(String[] args) {
        int[][] nums = new int[][]  { {0,2}, {1,4}, {3, 10}, {5, 6}, {7, 8} };
        solution(nums);
    }
}
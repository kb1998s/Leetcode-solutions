import java.util.Arrays;
import java.util.Stack;

class Solution {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        int delCount = 0;
        Stack delStack = new Stack<Integer[][]>();
        for (int left = 0, right = 1; right < n; right++) {
            // if no overlap then move left pointer to right
            if(intervals[left][1] <= intervals[right][0]) left = right;
            // then remove the larger interval
            else if (intervals[left][1] <= intervals[right][1]) {
                delStack.push(intervals[right]);
                delCount++;
            }
            else if (intervals[left][1] > intervals[right][1]) {
                left = right;
                delStack.push(intervals[right]);
                delCount++;
            }
        }


        return delCount;
    }

    public static void main (String[] args) {
        // int[][] intervals =  new int[][] { {1,2},{2,3},{3,4},{1,3} };
        int[][] intervals =  new int[][] { {1,2},{2,3} };
        eraseOverlapIntervals(intervals);
    }


}
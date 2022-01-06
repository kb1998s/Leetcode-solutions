import java.util.ArrayList;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftB = new int[n];
        int[] rightB = new int[n];
        leftB[0] = -1;
        rightB[n - 1] = n;
        for (int i = 1; i < n; i++) {
            int l = i - 1;
            while (l >= 0 && heights[l] >= heights[i]) {
                l = leftB[l];
            }
            leftB[i] = l;
        }

        for (int i = n - 2; i >= 0; i--) {
            int r = i + 1;
            while (r < n && heights[r] >= heights[i]) {
                r = rightB[r];
            } 
            rightB[i] = r;
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max((rightB[i] - leftB[i] - 1) * heights[i], result);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.largestRectangleArea(new int[]{2, 0, 2});
        System.out.println(res);
    }
}
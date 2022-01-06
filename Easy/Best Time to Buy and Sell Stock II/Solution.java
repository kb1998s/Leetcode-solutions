class Solution {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] profit = new int[n];
        int result = 0;
        profit[0] = 0;
        
        for (int i = 1; i < n; i++) {
            profit[i] = Integer.max(0, prices[i] - prices[i - 1]);
        }
        for (int i = 1; i < n; i++) {
            result +=  profit[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{7,6,4,3,1};
        int result = maxProfit(test);
    }
}
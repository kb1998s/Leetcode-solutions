class Solution{
    public Boolean powerOfThree(int n) {
        for (Double i = (double) n; i >=3; i /= 3) {
            if (i % 1 != 0) return false;
            if (i == 3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.powerOfThree(19684));
    }
}
class Solution {
    public static int reverse(int x) {
        int result = 0;
        for (int num = x; num != 0; num /= 10) {
            int rem = num % 10;
            int newResult = result * 10 + rem;
            if ((newResult - rem) / 10 != result) return 0;

            result = newResult;

        }
        return result;
    }

    public static void main(String[] args) {
        int test = 123;
        System.out.println(reverse(1534236469));
    }
}
class Solution {
    public static Boolean isOperator(Character chr) {
        return chr == '+' || chr == '-';
    }


    public static int myAtoi(String s) {
        int result = 0;
        Boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            Character chr = s.charAt(i);
            // check leading
            if (!Character.isDigit(chr)) {
                if (chr == ' ') {
                    continue;
                }
                if (isOperator(chr)) {
                    if (i > 0 && isOperator(s.charAt(i - 1))) return 0;
                    if (i < s.length() - 1 && !Character.isDigit(s.charAt(i + 1))) return 0;
                    if (chr == '-') neg = true;
                    continue;
                }
                return 0;
            }
            
            
            if (Character.isDigit(chr)) {
                int curr = chr - '0';
                // check if overflow, if not then add to result;
                if ((long)result * 10 + (long)curr > Integer.MAX_VALUE) {
                    if (neg) return Integer.MIN_VALUE;
                    else return Integer.MAX_VALUE;
                } else result = result * 10 + curr;
                // check character after it
                if (i < s.length() - 1 && !Character.isDigit(s.charAt(i + 1))) break; 
            }
        }
        
        return neg == true ? -1 * result : result;
    }

    public static void main(String[] args) {
        String test = "+ 12";
        System.out.println(myAtoi(test));
    }
}
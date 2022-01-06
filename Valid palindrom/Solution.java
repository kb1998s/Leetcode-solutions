class Solution {
    public static String process(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) ) result += Character.toLowerCase(s.charAt(i)); 
        }
        return result;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j;) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            Character start = s.charAt(i);
            Character end = s.charAt(j);
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--)) ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panamas";
        System.out.println(isPalindrome(test));
    }
}
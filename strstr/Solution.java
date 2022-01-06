class Solution {
    public static Boolean isStrStr(String haystack, String needle, int ind) {
        for (int j = 0, k = ind; j < needle.length() && k < ind + needle.length(); j++, k++) 
            {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    return false;
                }
                
            }
            return true;
    }
    public static int strStr(String haystack, String needle) {
    
        for (int i = 0; i < haystack.length(); i ++) {
            if (haystack.length() - i < needle.length()) break;
            if (isStrStr(haystack, needle, i)) return i;
        }
        return haystack.length() == 0 && needle.length() == 0 ? 0 : -1;
    }

    public static void main(String[] args) {
        String[] test = {"baaaa", "aaaa"};
        System.out.println(strStr(test[0], test[1]));
    }
}
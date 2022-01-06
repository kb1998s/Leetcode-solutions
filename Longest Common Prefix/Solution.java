class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) == -1) {
                pref = pref.substring(0, pref.length() - 1);
                if (pref.length() == 0) return "";
            }
        }
        return pref;
    }

    public static void main(String[] args) {
        String[] test = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(test));
    }
}
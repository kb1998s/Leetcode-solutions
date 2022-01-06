class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (alpha[t.charAt(i) - 'a'] == 0) return false;
            alpha[t.charAt(i) - 'a']--;
        }
        return true;
    }   

    public static void main(String[] args) {
        String test[] = new String[]{ "anagras", "nagaras"};
        System.out.println(isAnagram(test[0],test[1]));
    }
}
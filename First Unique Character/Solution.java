import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int firstUniqChar(String s) {
        
        // Map<Character, Integer> covered = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     Character chr = s.charAt(i);
        //     if (covered.containsKey(chr)) covered.replace(chr, -1);
        //     else covered.put(chr, i);
        // }
        // int min = Integer.MAX_VALUE;
        // for (char chr: covered.keySet()) {
        //     int index = covered.get(chr);
        //     if (index != -1 && index < min) {
        //         min = index;
        //     }
        // }

        // return min == Integer.MAX_VALUE ? -1 : min;
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == 1) return i; 
        }
        return -1;
    }

    public static void main(String[] args) {
        String test = "labba";
        System.out.println(firstUniqChar(test));
    }
}
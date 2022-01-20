import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        permutePts("",n, n);
        return result;
    }

    public void permutePts(String str, int l, int r) {
        if (l == 0 && r == 0) {
            result.add(str);
            return;
        } 
        if (l > 0 && l <= r) {
            String newStr = str + "(";
            permutePts(newStr, l - 1, r);
        }
        if (r > 0 && l < r) {
            String newStr = str + ")";
            permutePts(newStr, l, r - 1);
        } 
    }
    

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> result = sol.generateParenthesis(3);
    }
}
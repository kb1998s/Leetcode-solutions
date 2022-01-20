import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        permute(set, 1, 0, k, n);
        return res; 
    }

    public void permute(HashSet<Integer> set, int index, int total, int k, int n) {
        if (total == n && k == 0) {
            res.add(new ArrayList<>(set));
        }

        if (k == 0 || total == n) return;

        for (int i = index; i < 10; i++) {
            if (total + i > n) break;
            if (set.add(i)) {
                permute(set, index + 1, total + i, k - 1, n);
                set.remove(i);
            }
            
        }
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.combinationSum3(3, 7);
    }
}
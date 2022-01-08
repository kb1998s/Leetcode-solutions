import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, 0, target, curr, res);
        return res;
    }


    public void dfs(int[] candidates, int i, int total, int target, List<Integer> curr, List<List<Integer>> res) {
        if (total == target) {
            List<Integer> temp = new ArrayList<>(curr);
            res.add(temp);
            return;
        } 
        if (total > target || i >= candidates.length) return;

        curr.add(candidates[i]);
        dfs(candidates, i, total + candidates[i], target, curr, res);
        curr.remove(curr.size() - 1);
        dfs(candidates, i + 1, total, target, curr, res);
    }
    public static void main (String[] args) {
        int candidates[] = new int[] {2, 3, 6, 7};
        int target = 7;
        Solution sol = new Solution();
        sol.combinationSum(candidates, target);
    }
}
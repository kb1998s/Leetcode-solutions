import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, target,  new ArrayList<Integer>(), res);

        return res;
    }

    public void dfs(int[] candidates,int index, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i == index || candidates[i] != candidates[i - 1]) {
                curr.add(candidates[i]);
                dfs(candidates, i + 1, target - candidates[i], curr, res);
                curr.remove(curr.size() - 1);
                // dfs(candidates, index, target, curr, res);
            }
        }

    }

    public static void main (String[] args) {
        int candidates[] = new int[] {10,1,2,7,6,1,5};
        int target = 8;
        Solution sol = new Solution();
        sol.combinationSum2(candidates, target);
    }
}
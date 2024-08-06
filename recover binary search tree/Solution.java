// /Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
public class Solution {
    public long value = -1;
    public long swap = -1;
    
    public void recoverTree(TreeNode root) {
         swap(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public void swap(TreeNode root, long min, long max) {
        if (root == null) return;
        
        
        
        else if (root.val <= min) {
            value = (long)root.val;
            swap = min;
            root.val = (int)swap;
            return;
        } else if (root.val >= max) {
            value = (long)root.val;
            swap = max;
            root.val = (int)swap;
            return;
        } else {
            swap(root.left, min, root.val);
            swap(root.right, root.val, max);
            
        }

        if (root.val == swap && value != -1) {
            root.val = (int)value;
            value = -1; swap = -1;
            return;
        }

    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(3);
        tree.left.right = new TreeNode(2);
        Solution sol = new Solution();
        sol.recoverTree(tree);
    }
}
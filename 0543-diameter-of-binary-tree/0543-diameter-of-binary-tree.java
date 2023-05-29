/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] rst = dfs(root);
        return Math.max(rst[0], rst[1]) - 1;
    }
    private int[] dfs(TreeNode root) {
        if (root == null) return new int[] {0, 0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int singlePath = Math.max(left[1] , right[1]) + 1; // pick single path + curr node
        int combinedPath = Math.max(Math.max(left[0], right[0]), left[1] + right[1] + 1); // complete left/right child, or join curr root.
        return new int[]{combinedPath, singlePath};
    }
}
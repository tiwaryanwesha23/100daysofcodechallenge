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
    int ans,count;

    private boolean findKth(TreeNode root,int k){
        if(root==null)return false;
        if(findKth(root.left,k)) return true;
        // Increase count for this node
        this.count++;
        // Check if this is kth smallest element
        if(this.count==k){
            this.ans = root.val;
            return true;
        }
        return findKth(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        findKth(root,k);
        return this.ans;
    }
}
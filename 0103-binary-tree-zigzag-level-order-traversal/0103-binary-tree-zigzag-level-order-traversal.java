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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        deque.add(root);
        while ( !deque.isEmpty() ) {
            List<Integer> current = new LinkedList<>();
            int m = deque.size();
            
            for (int i = 0; i < m; i++) {
                TreeNode node = deque.removeFirst();
                
                if ( res.size() % 2 == 0) {
                    // left to right
                    current.add(node.val);
                } else {
                    // right to left
                    current.add(0, node.val);
                }
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }
    
            res.add(current);
        }
        
        return res;
    }
}
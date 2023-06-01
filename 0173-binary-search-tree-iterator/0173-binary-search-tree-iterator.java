public class BSTIterator {
    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public int next() {
        TreeNode node = stack.pop();
        TreeNode cur = node.right;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        return node.val;
    }
}

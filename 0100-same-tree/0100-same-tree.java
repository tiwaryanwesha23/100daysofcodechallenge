
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pp = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        pp.offer(p);
        qq.offer(q);

        while (!pp.isEmpty() && !qq.isEmpty()) {
            p = pp.poll();
            q = qq.poll();
            if (p == null && q == null) continue;
            if (p == null ^ q == null) return false;
            if (p.val != q.val) return false;
            offer(p, pp);
            offer(q, qq);
        }

        return true;
    }

    private void offer(TreeNode node, Queue<TreeNode> queue) {
        queue.offer(node.left);
        queue.offer(node.right);
    }
}
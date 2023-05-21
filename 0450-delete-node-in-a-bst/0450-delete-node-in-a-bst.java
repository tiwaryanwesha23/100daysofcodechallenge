
public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(key < root.val){
            // root=root.left; // not the search idea, while think this as a whole tree
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else {
                TreeNode findMin = root.right;
                int val = findMin.val;
                while(findMin!=null){
                    val = findMin.val;
                    findMin = findMin.left;
                }
                root.val = val;
                root.right = deleteNode(root.right, val);
            }

        }
        return root;
    }
}

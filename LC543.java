/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LC543 {
    int res = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        int depth = treeDepth(root);
        return res;
        
    }
    
    public int treeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftans = treeDepth(root.left);
        int rightans = treeDepth(root.right);
        res = Math.max(res, leftans + rightans);
        return Math.max(leftans, rightans)+1;        
    }
    
  
}
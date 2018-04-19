import java.util.List;

public class BST2DoublyLinkedList {
    private static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void printList(TreeNode head) {
        TreeNode x = head;
        while (x.right!=null) {
            System.out.print(x.val+"->");
            x = x.right;
        }
        System.out.println(x.val);
        while (x.left!=null) {
            System.out.print(x.val+"->");
            x = x.left;
        }
        System.out.println(x.val);

    }
    // recursive
    public static TreeNode convert(TreeNode root) {
        if (root.left == null && root.right==null) {
            return root;
        }
        TreeNode leftroot=null;
        TreeNode rightroot=null;
        if (root.left != null) {
            leftroot = convert(root.left);
            TreeNode x = leftroot;
            while (x.right!=null)
                x = x.right;
            x.right = root;
            root.left = x;
        }

        if (root.right != null) {
            rightroot = convert(root.right);
            rightroot.left = root;
            root.right = rightroot;
        }

        return root.left!=null?leftroot:root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(15);
        root.right.right.right.left = new TreeNode(13);


        TreeNode after = convert(root);
        printList(after);





    }
}

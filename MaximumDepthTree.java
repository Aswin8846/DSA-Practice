package DSAPractice;

class TNode {
    int val;
    TNode left, right;
    TNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaximumDepthTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(8);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(11);

        MaximumDepthTree tree = new MaximumDepthTree();
        int height = tree.maxDepth(root);
        System.out.println("Maximum Depth of the Tree: " + height);
    }
}


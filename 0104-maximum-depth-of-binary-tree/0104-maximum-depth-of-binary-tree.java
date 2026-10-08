class Solution {
    public int maxDepth(TreeNode root) {

        // If tree is empty
        if (root == null) {
            return 0;
        }

        // Find depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Take the larger depth and add 1 for current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
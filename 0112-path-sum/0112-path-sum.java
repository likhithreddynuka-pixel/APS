class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // Empty tree
        if (root == null) {
            return false;
        }

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Subtract current node value
        int remaining = targetSum - root.val;

        // Check left or right subtree
        return hasPathSum(root.left, remaining)
            || hasPathSum(root.right, remaining);
    }
}
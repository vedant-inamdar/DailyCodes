public class sumofleftleaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        int ans = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans = ans + root.left.val;
            } else {
                ans = ans + sumOfLeftLeaves(root.left);
            }
        }
        ans = ans + sumOfLeftLeaves(root.right);

        return ans;
    }
}
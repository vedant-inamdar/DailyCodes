import javax.swing.tree.TreeNode;

public class maxdepthbintree {
        public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftdepth=maxDepth(root.left);
            int rightdepth=maxDepth(root.right);
            return Math.max(leftdepth,rightdepth)+1;
        }
    }
}
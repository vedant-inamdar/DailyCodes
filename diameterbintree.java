import javax.swing.tree.TreeNode;

public class diameterbintree {
        public int maxdiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculate(root);
        return maxdiameter;
    }

    public int calculate(TreeNode node){
        if(node==null){
            return 0;
        }

        int leftdepth=calculate(node.left);
        int rightdepth=calculate(node.right);

        maxdiameter=Math.max(maxdiameter,leftdepth+rightdepth);

        return Math.max(leftdepth,rightdepth)+1;
    }
}
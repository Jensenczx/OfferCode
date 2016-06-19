
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

/*
二叉树的镜像

题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。 
二叉树镜像即为将其左右子树进行一个调换。
*/
public class Solution {

    public static void Mirror(TreeNode root){
        if(root!=null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

    public static void main (String [] args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	node1.left = node2;
    	node1.right = node3;
    	Mirror(node1);
    	System.out.println(node1.left.val);
    }

}

/*
1.首先想到要使用递归来解决这个问题
2.左右子树的调换，看考虑到完整性问题
*/
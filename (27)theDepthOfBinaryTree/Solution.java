/*
二叉树的深度
题目描述
输入一棵二叉树，求该树的深度。
从根结点到叶结点依次经过的结点
（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    public static int TreeDepth(TreeNode root) {
        if(root==null)
        	return 0;
        if(root.left==null&&root.right==null)
        	return 1;
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        if(leftDepth>rightDepth)
        	return leftDepth+1;
        else return rightDepth+1;
    }

    public static void main (String [] args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	node1.left = node2;
    	node1.right = node3;
    	node2.right = node4;
    	node4.right = node5;
    	System.out.println(TreeDepth(null));
    }

}
/*
二叉树，首先想到的就是通过递归左右子树来解决问题
然后找到递归终止的条件
*/
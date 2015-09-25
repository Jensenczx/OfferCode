/*
平衡二叉树
题目描述
输入一棵二叉树，判断该二叉树是否是平衡二叉树。

*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public static boolean IsBalanced_Solution(TreeNode root) {
    	if(root==null)
    		return true;
    	int result = getTheDeepOfTheTree(root.left)-getTheDeepOfTheTree(root.right);
 		if(Math.abs(result)<=1)
 			return true;
 		return false;
    }

    public static int getTheDeepOfTheTree(TreeNode root){
    	if(root==null)
    		return  0;
    	int leftDepth = getTheDeepOfTheTree(root.left)+1;
		int rightDepth = getTheDeepOfTheTree(root.right)+1;
		if(leftDepth>rightDepth)
			return leftDepth;
		return rightDepth;
    }

    public static void main(String [] args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	node1.left = node2;
    	node1.right = null;
    	System.out.println(IsBalanced_Solution(node1));
    }
}

/*
由于之前做过求树的深度的问题，所以解决起来不是很困难，但是第一次编译还是没有通过
由于对概念不是很熟悉，对于数据结构上的一些概念确实是有所欠缺，也是要继续恶补的。
*/
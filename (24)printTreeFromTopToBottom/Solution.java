/*
从上往下打印二叉树
题目描述
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
*/

import java.util.ArrayList;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {
    public static ArrayList<Integer> PrintFromTopToBottom1(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(root==null)
    		return list;
    	ArrayList<TreeNode> treeNodeContainer = new ArrayList<TreeNode>();
    	treeNodeContainer.add(root);
    	for(int i=0; i<treeNodeContainer.size(); i++){
    		TreeNode temNode = treeNodeContainer.get(i);
    		list.add(temNode.val);
    		if(temNode.left!=null)
    			treeNodeContainer.add(temNode.left);
    		if(temNode.right!=null)
    			treeNodeContainer.add(temNode.right);
    	}
    	return list;
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;
        ArrayList<TreeNode> container = new ArrayList<TreeNode>();
        container.add(root);
        for (int i = 0; i < container.size(); i++) {
            TreeNode tmp = container.get(i);
            System.out.println(tmp.val);
            list.add(tmp.val);
            if (tmp.left != null)
                container.add(tmp.left);
            if (tmp.right != null)
                container.add(tmp.right);
        } 
        return list;
    }

    public static void main(String [] args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	TreeNode node6 = new TreeNode(6);
    	TreeNode node7 = new TreeNode(7);
    	node1.left = node2;
    	node1.right = null;
    	System.out.println(PrintFromTopToBottom(node1));

    }
   
}

/*
1.想不到借助一个中间量对现有的数据进行一个缓存，然后再进行处理
2.实现一个类似于队列的模型，先进入的先执行，后进入的后执行。
*/
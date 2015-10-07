/*
题目描述
给定一颗二叉搜索树，请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
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

    static TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k<=0||pRoot==null)
        	return null;
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        ergodic(pRoot,result);
        int length = result.size();
        for(int i=0; i<length; i++){
        	if(i==k-1)
        		return result.get(i);
        }
        return null;

    }

    public static void ergodic(TreeNode node,ArrayList<TreeNode> list){
    	if(node.left!=null)
    		ergodic(node.left,list);
    	list.add(node);
    	if(node.right!=null)
    		ergodic(node.right,list);
    }

    public static void main(String[]args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	TreeNode node6 = new TreeNode(6);
    	node3.left = node2;
    	node2.left = node1;
    	node3.right = node4;
    	node4.right = node5;
    	node5.right = node6;
    	System.out.println(KthNode(node3,1).val);

    }
}

/*

*/
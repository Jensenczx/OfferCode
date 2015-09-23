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
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();
    	ArrayList<TreeNode>list = new ArrayList<TreeNode>();
    	if(root==null)
    		return pathlist;
    	else{
    		list.add(root);
    		calSum(root,target,list,pathlist,root.val);
    	}
    	return pathlist;
    }

    public static void calSum(TreeNode node,int target,ArrayList<TreeNode>list,ArrayList<ArrayList<Integer>> pathlist,int sum){
    	if(node.left==null&&node.right==null){
    		if(sum==target){
    			ArrayList<Integer>vallist = new ArrayList<Integer>();
    			for(TreeNode treeNode:list)
    				vallist.add(treeNode.val);
    			pathlist.add(vallist);
    		}
    	}
    	if(node.left!=null){
    		list.add(node.left);
    		sum+=node.left.val;
    		calSum(node.left,target,list,pathlist,sum);
    	}
    	if(node.right!=null){
    		list.add(node.right);
    		sum+=node.right.val;
    		calSum(node.right,target,list,pathlist,sum);
    	}
    	list.remove(node);
    }
    public static void add(int a){
    	a--;
    }

    public static void main(String [] args){
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	TreeNode node6 = new TreeNode(3);
    	node1.left = node2;
    	node1.right = node3;
    	node2.left = node4;
    	node2.right = node5;
    	node3.left = node6;
    	Integer i = new Integer(20);
    	add(i);
    	System.out.println(i); 
    }
}
//按之字形顺序打印二叉树
/*
题目描述

请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
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
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(pRoot==null)
    		return result;
    	ArrayList<TreeNode> current = new ArrayList<TreeNode>();
    	int flag = 1;
    	current.add(pRoot);
    	ArrayList<Integer> firstNode = new ArrayList<Integer>();
    	firstNode.add(pRoot.val);
    	result.add(firstNode);
    	while(current.size()>0){
    		ArrayList<Integer> subResult = new ArrayList<Integer>();
    		int currentLength = current.size();
    		if(flag%2==0){
    			for(int i=currentLength-1; i>=0; i--){
    				TreeNode temNode = current.get(i);
    				if(temNode.left!=null){
    					subResult.add(temNode.left.val);
    					current.add(temNode.left);
    				}
    				if(temNode.right!=null){
    					subResult.add(temNode.right.val);
    					current.add(temNode.right);
    				}
    			}
    		}else{
    			for(int i=currentLength-1; i>=0; i--){
      				TreeNode temNode = current.get(i);
    				if(temNode.right!=null){
    					subResult.add(temNode.right.val);
    					current.add(temNode.right);
    				}
    				if(temNode.left!=null){
    					current.add(temNode.left);
    					subResult.add(temNode.left.val);
    				}
    			}
    		}
    		for(int j=0; j<currentLength; j++)
    			current.remove(0);
    		if(current.size()>0)
    		result.add(subResult);
    		flag++;
    	}
    	return result;
    }

    public static void main(String[] args){
    	TreeNode node1 = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            TreeNode node4 = new TreeNode(4);
            TreeNode node5 = new TreeNode(5);
            TreeNode node6 = new TreeNode(6);
            TreeNode node7 = new TreeNode(7);
            node1.left = node2;
            node1.right = node3;
            node2.left = node4;
            node2.right = node5;
            node3.left = node6;
            node3.right = node7;
            System.out.println(Print(node1));

    }

}

/*
有点类似于之前的广度遍历，广度遍历通过借助一个栈结构即可实现，按照之字形
进行输出，实现思路，通过对当前层的数据存放在在数据结构中，然后对奇偶层数的判断，
然后再对其进行不同的操作，然后再输出的时候，将数组倒过来进行输出。
*/
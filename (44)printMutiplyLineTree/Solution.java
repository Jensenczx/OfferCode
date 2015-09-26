/*
把二叉树打印成多行
题目描述
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行.
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
    static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    	if(pRoot==null)
    		return list;
    	ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
    	ArrayList<Integer> tem = new ArrayList<Integer>();
    	tem.add(pRoot.val);
    	queue.add(pRoot);
    	list.add(tem);
    	int low = 0;
    	int high =1;
    	int end = high;
    	while(low<high){
    		TreeNode temNode = queue.get(low);
    		if(temNode.left!=null){
    			queue.add(temNode.left);
    			high++;
    		}
    		if(temNode.right!=null){
    			queue.add(temNode.right);
    			high++;
    		}
    		low++;
    		if(low==end){
    			end=high;
    			tem  = new ArrayList<Integer>();
    			for(int i=low; i<queue.size();i++){
    				tem.add(queue.get(i).val);
    			}
    			if(tem.size()>0)
    			list.add(tem);
    		}
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
    	node1.right = node3;
    	node2.left = node4;
    	node2.right = node5;
    	node3.left = node6;
    	node3.right = node7;
    	System.out.println(Print(node7));
    }
}

/*
之前解决的问题是关于如何层次遍历一个二叉树，和这个问题也是有点关联的，
但是这次是要通过多行输出来，涉及到多行，所以就需要我们对每一行进行控制，所以就需要标志位，
起点标志位和终点标志位来把握每一行的长度，通过low和end来确定当前层的左右子树
是否遍历结束，每当我们对左右子树遍历一遍，我们就将low前进一位，同时每遍历一个节点，都将high++，
这样我们就可以知道共共有多少个节点，通过这种方式，最终得到我们所要的结果。
*/
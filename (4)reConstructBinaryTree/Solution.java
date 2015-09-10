 /*
 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例
如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
则重建二叉树并返回。
 */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	int flag = 0;
        for(int i=0; i<in.length; i++){
        	if(in[i]==pre[0]){
        		flag = i;
        	}
        }
    	        TreeNode node = new TreeNode(in[flag]);
    	        node.left=null;
    	        node.right=null;
    	        if(flag>0){
    	        	int [] leftPre = getLeftPre(flag,pre);
        		int [] leftIn = getLeftIn(flag,in);
        		        		node.left=reConstructBinaryTree(leftPre,leftIn);

    	        }
    	        if(flag<in.length-1){
    	        	int [] rightPre = getRightPre(flag,pre);
        		int [] rightIn = getRightIn(flag,in);
        		
        		node.right=reConstructBinaryTree(rightPre,rightIn);
    	        }
        		return node;
    }

    public int [] getRightPre(int i, int [] pre){
    	int num;
    	if(pre.length!=i)
    		 num = pre.length-i-1;
    	else num = pre.length-i;
    		 int [] rightPre = new int [num];
    	for(int j=i+1; j<pre.length; j++){
    		rightPre[j-i-1] = pre[j];
    	}
     	return rightPre;
    }

    public int [] getLeftPre(int i, int [] pre){
    	int [] leftPre= new int [i];
    	for(int j=1; j<=i; j++){
    		leftPre[j-1]=pre[j];
    	}
    	return leftPre;
    }

    public int [] getRightIn(int i, int [] in){
    	int num;
    	if(in.length!=i)
    		 num = in.length-i-1;
    	else num = in.length-i;
    	int [] rightIn = new int[num];
    	for(int j=i+1; j<in.length; j++){
    		rightIn[j-i-1]=in[j];
    	}
    	return rightIn;
    }

    public int [] getLeftIn(int i, int [] in){
    	int [] leftIn = new int[i];
    	for(int j=0; j<i; j++){
    		leftIn[j]=in[j];
    	}
    	return leftIn;
    }

    public static void main(String []args){
    	Solution s = new Solution();
    	int [] pre={1,2,4,7,3,5,6,8};
    	int [] in={4,7,2,1,5,3,8,6};
    	System.out.println(s.reConstructBinaryTree(pre,in).val);
    }
}
/*
1.寻找根节点
2.根据根节点判断出左右子树，然后将左右子树当做一棵树进行递归求解
3.理清思路，列出边界情况
*/
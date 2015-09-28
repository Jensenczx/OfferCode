/*
对称的二叉树
题目描述
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
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

    static boolean isSymmetrical(TreeNode pRoot)
    {
      if(pRoot==null)
      	return true;
      else return judge(pRoot.left,pRoot.right);
    }

	static boolean  judge(TreeNode leftNode ,TreeNode rightNode){
		if(leftNode!=null&&rightNode!=null&&(leftNode.val==rightNode.val)){
			return judge(leftNode.left,rightNode.right)&&judge(leftNode.right,rightNode.left);
		}else if(leftNode==null&&rightNode==null)
		 return true;
		else return false;
	}
	

    public static void main(String[]args){
    	TreeNode node = new TreeNode(1);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	node.left = node1;
    	node.right = node2;
    	node1.left = node3;
    	node2.right = node4; 
    	System.out.println(isSymmetrical(null));
    }
}
/*
开始想到通过中序遍历来实现，因为通过中序遍历后，处于对称位置的结点，在中序
遍历的结果中，其结果也是处在相对位置的，这样我们通过它可以进一步的判断得到其是否
是对称的二叉树，但是一个问题是可能其中会有一些空的结点，但是遍历后，或者左右子树的高度
不同，因此这种做法是不可以的，所以我们通过摸索其规则，根据规则进行相应的编程
1.找规则
2.确定结构
*/

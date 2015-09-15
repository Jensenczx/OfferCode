/*
树的子结构
输入两颗二叉树A，B，判断B是不是A的子结构。
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
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean result = false;
    	if(root1!=null&&root2!=null){
    	if(root1.val==root2.val)
        	result = doesHaveSubTree(root1,root2);
        if(!result)
        	result = HasSubtree(root1.left,root2);
        if(!result)
        	result = HasSubtree(root1.right,root2);
    	}
    	return result;
        }

    public static boolean doesHaveSubTree(TreeNode root1,TreeNode root2){
    	if(root2 == null)
    		return true;
    	if(root1 == null)
    		return false;
    	if(root1.val!= root2.val)
    		return false;
    	return (doesHaveSubTree(root1.left,root2.left)&&doesHaveSubTree(root1.right,root2.right));
    }

        public static void main (String [] args){
        	TreeNode tree1 = new TreeNode(1);
        	TreeNode tree2 = new TreeNode(2);
        	System.out.println(HasSubtree(tree1,tree1));
        }
    }

  /*
  1.涉及到指针的，尤其要注意的是程序的鲁棒性
  2.和指针的当前实际指向
  3.彻底理清思路然后再下手，不要着急动手去写，思路打通
  */
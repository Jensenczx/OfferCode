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
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	if(pRootOfTree==null)
    		return null;
    	ArrayList<TreeNode>treeNodeList = new ArrayList<TreeNode>();
		ergodicTree(pRootOfTree,treeNodeList);
		TreeNode firstNode = treeNodeList.get(0);
		firstNode.left=null;
		TreeNode node = treeNodeList.get(0);
		for(int i=1; i<treeNodeList.size(); i++){
			TreeNode temNode = treeNodeList.get(i);
			temNode.left = treeNodeList.get(i-1);
			treeNodeList.get(i-1).right = temNode;
		}  
		return firstNode;      
    }

	public static void ergodicTree(TreeNode pHead,ArrayList<TreeNode> list){
		if(pHead.left!=null)
			ergodicTree(pHead.left,list);
		list.add(pHead);
		if(pHead.right!=null)
			ergodicTree(pHead.right,list);
	}

	public static void main(String[]args){
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node2.left = node1;
		node2.right = node3;
		System.out.println(Convert(node2).right.left.val);
	}
}
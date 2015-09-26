/*
二叉树的下一个结点
题目描述
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
*/
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
            return null;
        if(pNode.next==null&&pNode.left==null&&pNode.right==null)
            return null;
        if(pNode.right!=null){
            pNode = pNode.right;
            while(pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }
        if(pNode.next!=null){
            if(pNode.next.left==pNode)
                return pNode.next;
            else{
                TreeLinkNode temNode = pNode;
                pNode = pNode.next;
                while(pNode.next!=null){
                    temNode = pNode;
                    pNode = pNode.next;
                }
                if(temNode==pNode.left)
                    return pNode;
                else 
                    return null;
            }
        }
        return null;
    }
}
/*
找出各种可能的情况，针对各种情况进行分析
*/
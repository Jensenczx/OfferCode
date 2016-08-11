/*
二叉树中和为某一值的路径
题目描述
输入一颗二叉树和一个整数，打印出二叉树中结点
值的和为输入整数的所有路径。路径定义为从树的
根结点开始往下一直到叶结点所经过的结点形成一条路径。
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

    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return result;
        FindPath(root, target, new ArrayList<Integer>(), 0);
        return result;
    }

    public static void FindPath(TreeNode root, int target, ArrayList<Integer> list, int sum) {
        list.add(root.val);
        sum += root.val;
        if(root.left == null && root.right == null && sum == target){
            result.add(list);
            return;
        }
        if(root.left != null)
            FindPath(root.left, target, new ArrayList<Integer>(list), sum);
        if(root.right != null)
            FindPath(root.right, target, new ArrayList<Integer>(list), sum);
    }
}


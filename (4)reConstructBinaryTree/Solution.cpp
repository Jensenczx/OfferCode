/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* reConstructBinaryTree(vector<int> pre,vector<int> vin) {
        if(pre.empty() || vin.empty()) {
            return NULL;
        }
        return constucetBinaryTree(0, pre.size()-1, 0, vin.size()-1, pre, vin);
    }

    public:
    TreeNode* constucetBinaryTree(int preHead, int preTail, int vinHead,int vinTail, vector<int> pre, vector<int> vin)  {
        if(preHead > preTail || vinHead > vinTail) 
            return NULL;

        TreeNode* treeNode = new TreeNode(pre[preHead]);
        int index = preHead;
        for (int i = vinHead; i <= vinTail; i++) {
            if(vin[i] == pre[preHead]) {
                index = i;
                break;
            }
        }
        
        treeNode->left = constucetBinaryTree(preHead+1, preHead + index - vinHead, vinHead, index-1, pre, vin);
        treeNode->right = constucetBinaryTree(preHead + index - vinHead + 1, preTail, index+1, vinTail, pre, vin);
        return treeNode;
    }
    

};


举一反三，通过这一个题目，我们便可以解决所有的二叉树重新构建问题，对于树的问题，由于该数据结构自身的特性，我们很容易将大问题
分解为子问题，通过递归的方式来解决问题，首先是获取到子节点，然后构建其左右子树，关键节点在于对其中递归点的切分，首先切分出来
从何处递归操作，这里要注意对于其中索引位置的控制，是很容易出现问题的地方。
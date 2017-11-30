/*
struct TreeNode {
	int val;
	struct TreeNode *left;
	struct TreeNode *right;
	TreeNode(int x) :
			val(x), left(NULL), right(NULL) {
	}
};*/
class Solution {
public:
    bool HasSubtree(TreeNode* pRoot1, TreeNode* pRoot2)
    {
    	if(pRoot2 == NULL || pRoot1 == NULL)
    		return false;
    	if(pRoot1->val == pRoot2->val) {
    		if(HasSubtree2(pRoot1->left, pRoot2->left) && HasSubtree2(pRoot1->right, pRoot2->right)) {
    			return true;
    		}
    	}
    	return HasSubtree(pRoot1->left, pRoot2) || HasSubtree(pRoot1->right, pRoot2);
   }

public:
	bool HasSubtree2(TreeNode* pRoot1, TreeNode* pRoot2)
	{
		if(pRoot2  == NULL) {
    		return true;
    	}

    	if(pRoot1 == NULL) {
    		return false;
    	}
    
    	if(pRoot1->val != pRoot2->val) {
    		return false;
    	} else {
    		return HasSubtree2(pRoot1->left, pRoot2->left) && HasSubtree2(pRoot1->right, pRoot2->right);
    	}
	}
};
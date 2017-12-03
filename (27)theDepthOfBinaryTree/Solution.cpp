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
    int TreeDepth(TreeNode* pRoot)
    {
    	if(pRoot == NULL) {
    		return 0;
    	}
    	int leftDepth = TreeDepth(pRoot->left);
    	int rightDepth =  TreeDepth(pRoot->right);
    	return 1+ (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
};
/*
struct ListNode {
	int val;
	struct ListNode *next;
	ListNode(int x) :
			val(x), next(NULL) {
	}
};*/
class Solution {
public:
    ListNode* FindKthToTail(ListNode* pListHead, unsigned int k) {
    	if(pListHead == NULL || k == 0)
    		return NULL;
    	ListNode* pre = pListHead;
    	ListNode* after = pListHead;
    	for (int i = 0; i < k; i++) {
    		if (pre != NULL) {
    			pre = pre->next;
    		} else {
    			return NULL;
    		}
    	}

    	while(pre != NULL) {
    		pre = pre->next;
    		after = after->next;
    	}
    	return after;
    }
};
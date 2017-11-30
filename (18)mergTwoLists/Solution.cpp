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
    ListNode* Merge(ListNode* pHead1, ListNode* pHead2)
    {
        ListNode start = ListNode(0);
        ListNode node = start;
        while(pHead1 && pHead2) {
        	if(pHead1->val <= pHead2->val) {
        		node->next = phHead1;
        		pHead1 = pHead1->next;
        	} else {
        		node->next = pHead2;
        		pHead2 = pHead2->next;
        	}
        	node = node->next;
        }

        if(pHead1) {
        	node->next = pHead1;
        }
        
        if(pHead2) {
        	node->next = pHead2;
        }

        return start.next;
    }
};
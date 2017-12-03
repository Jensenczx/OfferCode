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
    ListNode* FindFirstCommonNode( ListNode* pHead1, ListNode* pHead2) {
       if(pHead1 == NULL || pHead2 == NULL)
       		return NULL;
       	
       	int length1 = findListLength(pHead1);
       	int length2 = findListLength(pHead2);

       	int margin = 0;
       	margin = length1 - length2;
       	if(length1 > length2) {
       		return findSameNode(pHead1, pHead2, margin);
       	} else {
       		return findSameNode(pHead2, pHead1, -margin);
       	}
       	return NULL;
    }
 
    int findListLength(ListNode * node) {
    	ListNode *p = node;
    	int length = 0;
    	if(p != NULL) {
    		length++;
    		p = p->next;
    	}
    	return length;
    }

    ListNode* findSameNode(ListNode *node1, ListNode * node2, int margin) {
    	ListNode *p1 = node1;
    	ListNode *p2 = node2;
    	while(p1 != NULL && p2 !=NULL) {
    		if(p1 == p2)
    			return p1;
    		if(margin > 0) {
    			margin --;
    		} else {
    			p2 = p2->next;
    		}
    		p1 = p1->next;
    	}
    }

};
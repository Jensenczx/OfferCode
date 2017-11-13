/**
*  struct ListNode {
*        int val;
*        struct ListNode *next;
*        ListNode(int x) :
*              val(x), next(NULL) {
*        }
*  };
*/
class Solution {
public:
    vector<int> printListFromTailToHead(ListNode* head) {
        vector<int> result;
        ListNode* pNode = head;
        while(pNode != NULL) {
        	result.insert(result.begin(), pNode.val);
        	pNode = pNode.next;
        }
        return result;
    }

};
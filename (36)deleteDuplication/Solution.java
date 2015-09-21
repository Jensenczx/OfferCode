class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static ListNode deleteDuplication(ListNode pHead)
    {
    	if(pHead==null)
    		return null;
    	ListNode node = pHead;
    	int initial=pHead.val;
    	while(pHead.next!=null){
    		if(pHead.next.val == initial){
    			pHead.next = pHead.next.next;
    		}else{
    			initial = pHead.next.val;
    			pHead = pHead.next;
    		}
    	}
    	return node;
    }

    public static void main (String [] args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(2);
    	node1.next=node2;
    	node2.next=node3;
    	System.out.println(deleteDuplication(node1).next.val);
    }
}
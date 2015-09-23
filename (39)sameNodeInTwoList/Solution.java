class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
	//蛮力法
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1==null||pHead2==null)
    		return null;
    	ListNode node1 = pHead1;
    	ListNode node2 = pHead2;
    	while(node1!=null){
    		node2 = pHead2;
    		while(node2!=null){
    			if(node2.val == node1.val)
    				return node2;
    			node2 = node2.next;
    		}
    		node1 = node1.next;
    	}
    	return null;
    	
}

    public static void main (String [] args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	node1.next = node2;
    	ListNode node3 = new ListNode(2);
    	System.out.println(FindFirstCommonNode(node1,node3).val);
    }
}
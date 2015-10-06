class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode entryNode = null;
        if(pHead==null)
        	return entryNode;
        if(pHead.next==pHead)
        	return pHead;
        ListNode slowNode = pHead;
        ListNode fastNode = pHead.next;
        ListNode encounterNode = null;
        while(fastNode.next!=null&&slowNode!=fastNode){
        	fastNode = fastNode.next.next;
        	if(fastNode==null)
        		return entryNode;
        	slowNode = slowNode.next;
        }
        if(fastNode.next==null)
        	return entryNode;
        if(slowNode==fastNode)
        	encounterNode = slowNode;
        slowNode = pHead;
        while(slowNode!=fastNode){
        	slowNode=slowNode.next;
        	fastNode=fastNode.next;
        }
        entryNode = slowNode;
        return entryNode;

    }

    public static void main(String[]args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	ListNode node6 = new ListNode(6);
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	node5.next = node6;
    	node6.next = node3;
    	System.out.println(EntryNodeOfLoop(node1).val);

    }



}
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

	public static ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){
		if(pHead1==null||pHead2==null)
			return null;
		int num1 =1;
		int num2 =1;
		ListNode node1 = pHead1;
		ListNode node2 = pHead2;
		while(node1.next!=null){
			node1 = node1.next;
			num1++;
		}
		while(node2.next!=null){
			node2 = node2.next;
			num2++;
		}
		int [] array1 = new int [num1];
		int [] array2 = new int [num2];
		node1 = pHead1;
		node2 = pHead2;
		num1 =0;
		num2 =0;
		while(node1.next!=null){
			array1[num1]=node1.val;
			node1 = node1.next;
			num1++;
		}
		while(node2.next!=null){
			array2[num2]=node2.val;
			node2 = node2.next;
			num2++;
		}
		tem = num1>num2?num1:num2;
		for(int i=tem-1;i>=0;i--){

		}
	}

    public static void main (String [] args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	node1.next = node2;
    	ListNode node3 = new ListNode(2);
    	System.out.println(FindFirstCommonNode(node1,node3).val);
    }
}
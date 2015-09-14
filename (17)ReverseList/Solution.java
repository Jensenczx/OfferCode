/*
题目描述
输入一个链表，反转链表后，输出链表的所有元素。
*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static ListNode ReverseList(ListNode head) {
    	if(head==null)
    		return null;
    	ListNode tem = null;
    	ListNode tem1 = null;
    	while(head.next!=null){
    		tem = head;
            head = head.next;
    		tem.next = tem1;
         	tem1 = tem;
    	}
        head.next = tem1;
    	return head;
    }
    public static void main(String []args){
    	ListNode node1 = new ListNode(1);

    	ListNode node2 = new ListNode(2);

    	ListNode node3 = new ListNode(3);

    	ListNode node4 = new ListNode(4);

    	ListNode node5 = new ListNode(5);

    	node1.next = node2;

    	node2.next = node3;

    	node3.next = node4;

    	node4.next = node5;

    	System.out.println(ReverseList(null));
    }
}
/*
解题心得：
解决这个问题可以说是用来很久的时间，其实最后发现很简单的问题，从中发现的问题就是。
让链表反向，首先是要将链表走一遍，所以通过头结点和循环来控制其向前走，然后就是如何将其
翻转过来.
*/
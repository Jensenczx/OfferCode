/*
合并两个排序的链表
题目描述

输入两个单调递增的链表，输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。
*/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = null;
        ListNode tem = null;
        if(list1==null){
        	tem = list2;
        }
        else if(list2==null){
        	tem = list1;
        }
        else if(list1==null&&list2==null)
        	return null;
        else{
        	while(list1!=null&&list2!=null){
        		if(list1.val<=list2.val){
        			if(head == null){
        			    head = new ListNode(list1.val);
        			    tem = head;
        			}
        			else{
                        head.next = new ListNode(list1.val);
                        head = head.next;
                    }
        			list1 = list1.next;
        		}else{
        			if(head == null){
        			    head = new ListNode(list2.val);
        			    tem = head;
        			}
        			else{
                        head.next = new ListNode(list2.val);
                        head = head.next;
                    }
        			list2 = list2.next;
        		}
        	}
        	if(list1==null){
        		while(list2!=null){
        			head.next = new ListNode(list2.val);
                    head = head.next;
        			list2 = list2.next;
        		}
        	}else{
        		while(list1!=null){
        			head.next = new ListNode(list2.val);
                    head = head.next;
        			list1 = list1.next;
        		}
        	}
        }
        return tem;
    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        while (list1 != null && list2 != null) {
            head.next = new ListNode(list1.val > list2.val ? list2.val : list1.val);
            if (head.next.val == list1.val)
                list1 = list1.next;
            else list2 = list2.next;
        }
        ListNode tmp = (list1 == null ? list1 : list2);
        while (tmp != null) {
            head.next = new ListNode(tmp.val);
            tmp = tmp.next;
        }
        return head;
    }


    public static void main(String [] agrs){
    	ListNode node1 = new ListNode(1);

    	ListNode node2 = new ListNode(2);

    	ListNode node3 = new ListNode(3);

    	ListNode node4 = new ListNode(4);

    	ListNode node5 = new ListNode(5);

    	node2.next = node4;

    	node4.next = node5;

    	System.out.println(Merge(node1,node1).next.val);
    }
}

/*
费了很大的劲解决这个问题
开始被困的问题是如何返回头结点
解决方案：设置头结点为空，得到初值后做一个判断，然后记录下来
遍历问题：
对于链表问题，经常需要的是对链表进行遍历，所以需要向下走，无论是用来记录的还是被记录的
都是需要
注意：空节点的判断，

update:更新后巧妙的借助于三元运算符，来有效的来使得代码变得更加清晰。
*/
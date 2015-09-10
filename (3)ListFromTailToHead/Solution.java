/*
题目描述:
输入一个链表，从尾到头打印链表每个节点的值
*/
import java.util.ArrayList;

class ListNode {
       int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
       	while(listNode!=null){
       		list.add(listNode.val);
       			listNode = listNode.next;
       	}
       	ArrayList<Integer>list1 = new ArrayList<Integer>();
       	for(int i=list.size()-1; i>=0; i--){
       		list1.add(list.get(i));
       	}
       	return list1;
    }

   	public void printListFromTailToHead1(ListNode listNode){
   		if(listNode!=null){
   			if(listNode.next!=null){
   				printListFromTailToHead1(listNode.next);
   			}
   			System.out.println(listNode.val);
   		}
   	}

    public static void main(String []args){
    	Solution s = new Solution();
    	ListNode first = new ListNode(1);
    	ListNode second = new ListNode(2);
    	first.next = second;
    	s.printListFromTailToHead1(first);
    }
}
/*
1.倒叙输出，符合栈的数据结构
2.栈的数据结构可以通过递归来模拟其出栈操作
3.在使用while循环的时候找个具体的实例进行模拟防止出现问题
*/
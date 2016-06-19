/*
删除链表中重复的结点
题目描述
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 
处理后为 1->2->5
*/
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
        if(pHead.next==null)
            return pHead;
        int tem=pHead.val;
        ListNode node=null;
        ListNode temNode=null;
        int num = 0;
        while(pHead.next!=null){
            if(pHead.next.val!=tem){
                if(node==null){
                    if(num==0){
                        node = new ListNode(pHead.val);
                    temNode = node;
                    }
                }else{
                    if(num==0){
                        node.next = new ListNode(pHead.val);
                        node = node.next;
                    }    
                }
                tem = pHead.next.val;
                num=0;
            }else{
                num++;
            }
            pHead = pHead.next;
        }
        if(num==0){
            if(temNode==null){
                temNode = new ListNode(pHead.val);
            }else{
                node.next = new ListNode(pHead.val);
            }
        }
        return temNode;
    }
    public static ListNode deleteDuplication(ListNode pHead){
        ListNode result = new ListNode(0);
        if(pHead==null)
            return result.next;
        ListNode tmpNode = result;
        while(pHead.next!=null){
            if(pHead.val!=pHead.next.val){
                tmpNode.next = new ListNode(pHead.val);
                tmpNode = tmpNode.next;
                pHead = pHead.next;
            }else{
                int tmp = pHead.val;
                while(pHead.next!=null){
                    if(pHead.next.val!=tmp)
                        break;
                    else
                        pHead = pHead.next;
                }
            }
        }
        tmpNode.next = new ListNode(pHead.val);
        return result.next;
    }


    public static void main (String [] args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(1);
    	ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(4);
    	node1.next=node2;
        node2.next=node5;
    	System.out.println(deleteDuplication(node1).val);
    }
}
/*
对于这个问题，看似很简单的，但是写起来却很是费力，主要是对于一些边界值的
一些判断，再就是要考虑到各种情况，比较复杂，
1.通过建立一个新的链表来进行操作，而不是在原有的数据结构基础上进行修改，记录上一个结点的值
然后通过和下一个结点的值的比较，来确定上一个结点是否是single，然后将该数据加入到我们的结果中
如果不符合条件的，继续向下遍历，考虑到各种情况。
*/
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public static RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode node = null;
        RandomListNode newList = null;
        if(pHead==null)
                return node;
        if(pHead.next==null)
                return pHead;
        RandomListNode firstNode = pHead;
        //将每个节点复制一遍放在原来节点的后面
        while(pHead.next!=null){
                RandomListNode temNode = new RandomListNode(pHead.label);
                temNode.next = pHead.next;
                pHead.next = temNode;
                pHead = temNode.next;
        }
        RandomListNode endNode = new RandomListNode(pHead.label);
        pHead.next = endNode;
        pHead = firstNode;
        if(pHead.random!=null)
            pHead.next.random = pHead.random.next;
        else
            pHead.next.random = null;
        pHead = pHead.next;
        //将所有的节点的野节点的指向确定
        while(pHead.next!=null){
                pHead = pHead.next;
                if(pHead.random!=null)
                    pHead.next.random = pHead.random.next;
                else
                        pHead.next.random = null;
                pHead = pHead.next;
        }
        pHead = firstNode;
       //将原来的节点和现在的节点拆分
       newList = pHead.next;
       node = pHead.next;
       pHead.next = null;
       pHead = newList;
       while(pHead.next!=null){
               pHead = pHead.next;
               node.next=pHead.next;
               node = node.next;
               pHead = pHead.next;
       }
                return newList;
    }
    
    public static void main(String[]args){
            RandomListNode node1 = new RandomListNode(1);
            RandomListNode node2 = new RandomListNode(2);
            RandomListNode node3 = new RandomListNode(3);
            RandomListNode node4 = new RandomListNode(4);
            RandomListNode node5 = new RandomListNode(5);
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node1.random=node3;
            node2.random=node5;
            node4.random=node2;
            System.out.println(Clone(node1).next.next.label);
    }
    
}

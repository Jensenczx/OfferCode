/*
题目描述

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/
import java.util.LinkedList;

public class Solution {
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();
    
    public void push(int node) {
        if(queue1==null&&queue2==null){
            queue1.add(node);
        }
        else if(queue1!=null){
            queue1.add(node);
        }else {
            queue2.add(node);
        }
    }
    
    public int pop() {
        if(queue1==null&&queue2==null){
            return 0;
        }else if(queue1!=null){
            while(queue1.size()>1){
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        else if(queue2!=null){
            while(queue2.size()>1){
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        return 0;
    	
    }

    public static void main(String []args){
    	Solution s = new Solution();
        s.push(1);
        s.push(2);
        s.push(3);
    	System.out.println(s.pop());
    }
}
/*
1.实际例子模拟操作过程
2.不考虑具体实现，列出大致思路，然后在考虑编码
*/
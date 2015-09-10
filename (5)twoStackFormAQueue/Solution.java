/*
题目描述

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()){
    		if(stack1.empty()){
    			return 0;
    		}else{
    			while(!stack1.empty()){
    				stack2.push(stack1.pop());
    			}
    			return stack2.pop();
    		}
    	}else{
    		return stack2.pop();
    	}
    }
    public static void main(String []args){
    	Solution s = new Solution();
    	
    	System.out.println(s.pop());
    }
}
/*
1.实际例子模拟操作过程
2.返回值自己随意规定 
*/
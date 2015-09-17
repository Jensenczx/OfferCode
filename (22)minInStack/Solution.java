/*
包含min函数的栈
题目描述

定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
*/
import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> temStack = new Stack<Integer>();
    int minNum;

    public void push(int node) {
    	if(stack.empty()){
    		minNum = node;
    	}else{
    		if(node<minNum)
    			minNum = node;
    	}
    	stack.push(node);
    	temStack.push(minNum);
    }
    
    public void pop() {
        if(stack!=null){
        	stack.pop();
        	temStack.pop();
        }
    }
    
    public int top() {
    	if(stack!=null)
    		return stack.peek();
    	return 0;
    }
    
    public int min() {
    	if(stack!=null)
    		return temStack.peek();
    	return 0;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	s.push(2);
    	s.push(3);
    	s.push(1);
    	System.out.println();
    }
}
/*
很好地借助栈的特性，同理可以用来解决最大值问题
*/
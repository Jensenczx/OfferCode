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
    			throw new Exception("栈中无数据");
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
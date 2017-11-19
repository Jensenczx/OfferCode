class Solution
{
public:
    void push(int node) {
        stack1.push(node);
    }

    int pop() {
    	int result = 0;
    	if(stack2.empty()) {    		
    	while(!stack1.empty()) {
    		int tmp = stack1.top();
    		stack1.pop();
    		stack2.push(tmp);
    	}
    }
    	result = stack2.top();
    	stack2.pop();
        return result;
    }

private:
    stack<int> stack1;
    stack<int> stack2;
};
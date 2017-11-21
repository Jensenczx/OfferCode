class Solution {
public:
    int Fibonacci(int n) {
    	if (n <= 0)
    		return 0;
    	if (n <= 2) {
    		return 1;
    	} 
    	return Fibonacci(n-1) + Fibonacci(n-2);
    }

    int Fibonacci(int n) {
    	if(n <= 0)
    		return 0;
    	int num1 = 1;
    	int num2 = 1;
    	int result = num1;
    	int index = 3;
    	while(index <= n) {
    		result = num1 + num2;
    		num1 = num2;
    		num2 = result;
    		index++;
    	}
    	return result;
    }

};
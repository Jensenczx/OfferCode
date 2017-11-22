class Solution {
public:
    int jumpFloor(int number) {
        if(number < 1)
        	return 0;
        if(number == 1)
        	return 1;
        if(number == 2)
        	return 2;
        return jumpFloor(number -1) + jumpFloor(number - 2);
    }

    int jumpFloor(int number) {
    	if(number < 1)
    		return 0;
    	int num1 = 1;
    	int num2 = 2;
    	if (number == 1)
    		return num1;
    	if (number == 2)
    		return num2;
    	int index = 3;
    	int result = 0;
    	while(index <= number) {
    		result = num1 + num2;
    		num1 = num2;
    		num2 = result;
    		index++;
    	}
    	return result; 
    }
};
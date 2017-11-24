class Solution {
public:
    int rectCover(int number) {
    	if (number <= 0) {
    		return 0;
    	}
    	if (number == 1) {
    		return 1;
    	}

    	if (number == 2) {
    		return 2;
    	}

    	return rectCover(number - 1) + rectCover(n -2);
    }

    int rectCover(int number) {
    	if (number <= 0) {
    		return 0;
    	}

    	if (number <= 2)
    		return number;

    	int num1 = 1;
    	int num2 = 2;
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
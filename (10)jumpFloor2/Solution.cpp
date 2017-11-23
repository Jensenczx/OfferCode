class Solution {
public:
    int jumpFloorII(int number) {
    	if (number <= 0)
    		return 0;
    	if (number == 1)
    		return 1;
    	int result = 0;
    	for(int i = 1; i <= number; i++) {
    		result+= jumpFloorII(number - i);
    	}
    	return result + 1;
    }
};
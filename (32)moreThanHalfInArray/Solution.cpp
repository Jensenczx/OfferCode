class Solution {
public:
    int MoreThanHalfNum_Solution(vector<int> numbers) {
    	if(numbers.empty())
    		return 0;
    	int number = numbers[0];
    	int count = 1;
    	for(int i = 1; i < numbers.size(); i++) {
    		if(count == 0) {
    			number = numbers[i];
    			count++;
    			continue;
    		}
    		if(numbers[i] != number) {
    			count--;
    		} else {
    			count++;
    		}
    	}

    	if(count == 0)
    		return 0;
    	count = 0;
    	for (int j = 0; j < numbers.size(); j++) {
    		if(numbers[j] == number) {
    			count++;
    		}
    	}

    	if(count > numbers.size()/2)
    		return number;
    	return 0;
    }
};
class Solution {
public:
    int minNumberInRotateArray(vector<int> rotateArray) {
        if(rotateArray.size() == 0) {
        	return 0;
        }
        for(int i = 1; i < rotateArray.size(); i++) {
        	if(rotateArray[0] > rotateArray[i]) {
        		return rotateArray[i];
        	}
        }
        return rotateArray[0];
    }

    int minNumberInRotateArray(vector<int> rotateArray) {
    	if(rotateArray.size() == 0) {
    		return 0;
    	}

    	int pre = 0;
    	int last = rotateArray.size() -1;
    	while(last > (pre + 1)) {
    		if(rotateArray[pre] < rotateArray[last]) {
    			return rotateArray[pre];
    		} else {
    			if(rotateArray[(pre+last)/2] >= rotateArray[last]) {
    				pre = (pre + last)/2;
    			} else {
    				last = (pre + last)/2;
    			}
    		}
    	}
    	if (rotateArray[pre] > rotateArray[last]){
    		return rotateArray[last];
    	}
    	return rotateArray[pre];
    }
};
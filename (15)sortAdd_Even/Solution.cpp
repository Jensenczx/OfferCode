class Solution {
public:
    void reOrderArray(vector<int> &array) {
       if(array.size() <= 1)
        	return;
        vector<int> v1;
        vector<int> v2;
        for(int i = 0; i < array.size(); i++) {
        	int tmp = array[i];
        	if(tmp % 2 == 0) {
        		v1.push_back(tmp);
        	} else {
        		v2.push_back(tmp);
        	}
        }


        for (int j = 0; j < v2.size(); j++) {
        	array[j] = v2[j];
        }

        for (int i = 0; i < v1.size(); i++) {
        	array[i+v2.size()] = v1[i];
        } 
    }
};
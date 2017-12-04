class Solution {
public:
    int GetNumberOfK(vector<int> data ,int k) {
        if(data.size() == 0)
        	return;
        int num = 0;
        for(int i = 0;i < data.size(); i++) {
        	if(data.get(i) == k) {
        		num++;
        	}
        }
        return num;
    }
};

//查找通过二分的方式，复杂度降低为lgn
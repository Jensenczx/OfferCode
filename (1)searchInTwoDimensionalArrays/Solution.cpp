class Solution {
public:
    bool Find(int target, vector<vector<int> > array) {
        if(array.empty() || array.size() == 0) {
        	return false;
        }
        int rowCount = array[0].size();
        int colCount = array.size();

        for(int i = 0, j = colCount -1; i < rowCount && j >=0;) {
        	if(array[i][j] == target) {
        		return true;
        	} else if(array[i][j] < target) {
        		i++;
        	} else {
        		j--;
        	}
        }

        return false;
    }
};
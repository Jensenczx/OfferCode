class Solution {
private:
	vector<int> v1;
	vector<int> v2;
	int small;

public:
    void push(int value) {
        if(v1.empty()){
        	small = value;
        }
        if(value < small) {
        	small = value;
        }
        v1.push_back(value);
        v2.push_back(small);
    }
    void pop() {
        v1.pop_back();
        v2.pop_back();
    }
    int top() {
        return v1.back();
    }
    int min() {
        return v2.back();
    }
};
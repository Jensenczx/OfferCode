class Solution {
public:
     int  NumberOf1(int n) {
        int num = 0;
        while (n) {
        	n = n & (n-1);
        	num ++;
        }
        return num;
     }
};
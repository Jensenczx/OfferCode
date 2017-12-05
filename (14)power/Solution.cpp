class Solution {
public:
    double Power(double base, int exponent) {
    	if(exponent == 0){
            return 1;
        }
       
        bool isNeg = (exponent < 0);
        if(isNeg) {
            exponent = -exponent;
        }
        double result = base;
        for (int i = 0;i < exponent -1; i++) {
            result = result * base;
        }
        return isNeg ? 1/result : result;        
    }
};
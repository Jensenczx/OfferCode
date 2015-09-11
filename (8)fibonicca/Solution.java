public class Solution {
    public int Fibonacci1(int n) {
    	if(n==0)
    		return 0;
    	else if(n==1)
    		return 1;
    	else{
    		return Fibonacci(n-1)+Fibonacci(n-2);
    	}
    }
    public int Fibonacci(int n) {
    	int [] result = {0,1};
    	int sum1 = result[0];
    	int sum2 = result[1];
    	int sum=0;
    	if(n<2){
    		return result[n];
    	}
    	for(int i=2; i<=n; i++){
    		sum = sum1+sum2;
    		sum1 = sum2;
    		sum2= sum;
    	}
    	return sum;
    }


    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.Fibonacci(3));
    }
}
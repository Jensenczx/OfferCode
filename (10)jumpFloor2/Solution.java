/*
题目描述
一只青蛙一次可以跳上1级台阶，
也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
public class Solution {

    public int JumpFloorII(int target) {
    	int sum = 0 ;
    	if(target == 1)
    		return 1;
    	if(target == 2)
    		return 2;
        if(target>2){
        	for(int i=1; i<target; i++){
        	sum = sum + JumpFloorII(target-i);
        }
        return sum+1;
    }
        return sum; 
    }

    public int JumpFloorII(int target) {
	if (target <= 0)
	    return 0;
	if (target == 1)
            return 1;
	int sum = 0;
	for (int i = 1; i <= target; i++) {
	    sum += JumpFloorII(target - i);
	}
	return sum + 1;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.JumpFloorII(4));
    }
}

/**实现思路：
假设青蛙跳n个台阶，那么它可以先跳出1，，，n步，剩余n-1，，，，0，搭配起来的跳法
那么其总共的跳转方法也就是为(n-1)+...(0),此处0被我们作为一个边界条件进行了过滤，
所以我们需要加上1。也就是在没一种的跳转中，我们都需要再加上1，
**/

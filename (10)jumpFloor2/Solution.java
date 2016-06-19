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

    public int JumpFloorII(int target){
        if(target <= 0)
            return 0;
        if(target == 1)
            return 1;
        int sum = 0;
        for(int i = 1; i <= target; i++){
            sum = sum + JumpFloorII(target-i);
        } 
        return sum+1;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.JumpFloorII(4));
    }
}

/*
1.疑问，作为最后返回值的数据可否修改？？可否通过循环进行解决
2.走出第一步，然后将问题就分割成了递归的子问题。
*/
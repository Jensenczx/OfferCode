/*
题目描述

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/
public class Solution {
    public int NumberOf3(int n) {
    	int num = 0;
    	while(n!=0){
    		n = (n-1)&n;
    		num++;
    	}
    	return num;
    }

    public int NumberOf2(int n){
    	int count = 0;
    	int num = 1;
    	int flag = 1;
    	while(num<=32){
    		if((n&flag)!=0){
    			count++;
    		}
    		flag=flag<<1;
    		num++;
    	}
    	return count;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.NumberOf1(1));
    }
}
/*
通过位运算进行的一些算法都是可以通过计算其中1的个数来解决
比如，
1.两个数字的二进制相差多少位，通过亦或求出其中不同位数，通过计算1的个数确定有多少位数是不同的
2.计算一个数字是否为2的次方，如果其中只有一个1，那么就是
*/
/*
数组中出现次数超过一半的数字
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
*/
public class Solution {

    public static int MoreThanHalfNum_Solution(int [] array) {
    	int result=0;
    	int times=0;
    	int len=array.length; 
    	for(int i=0; i<=len-1; i++){
    		if(times==0){
    			result = array[i];
    			times++;
    		}else{
    			if(array[i]!=result)
    				times--;
    			else
    				times++;
    		}	
    }
    	if(times>0){
    		if(ifMoreThanHalf(array,result))
    			return result;
    		else return 0;
    	}
    	else 
    		return 0;
    }
    public static boolean ifMoreThanHalf(int []array,int num){
    	int times=0;
    	for(int i=0; i<array.length; i++){
    		if(array[i]==num)
    			times++;
    	}
    	if(times>(array.length/2))
    		return true;
    	else return false;
    }
    public static void main(String [] args){
    	int [] array = {1,2,2,3,3,3,3};
    	System.out.println(MoreThanHalfNum_Solution(array));
    }
}
/*
1.超过一半，首先如果是排好序的，其中位数就是我们所要求的结果
2.没有排好序的，其出现次数超过一半，那么其出现次数是要大于其他所有数
出现次数出现之和，将一个数字出现一次记为加一，后面遇到遇到一个不相同的数字
减去一，直到其出现次数为0的时候，开始记录下一个数字，因为该数字最后一定为1，
所以当出现次数为0一定是不可以的，同时会出现一个特殊情况就是当执行到最后的时候，
可能最后一个数字被误判，所以当得到结果之后，还要通过o(n)的一个判断。
*/
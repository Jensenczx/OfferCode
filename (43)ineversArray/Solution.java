/*
数组中的逆序对
题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，
则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
*/
public class Solution {
    public static int InversePairs(int [] array) {
    	int sum = 0;
    	int length = array.length;
    	if(length<=1)
    		return sum;
    	for(int i=0; i<length; i++){
    		for(int j=i+1; j<length; j++){
    			if(array[i]>array[j])
    				sum++;
    		}
    	}
    	return sum;
    }

    public static void main(String [] args){
    	int [] array = {1,2,3,4,7,6,5};
    	int [] array1 = {2,1,3,2};
    	System.out.println(InversePairs(array));
    	System.out.println(InversePairs(array1));
    }
}
/*
此处直接使用了最常规的方法，还有较为简洁的方法通过归并排序来实现，后期再更。
*/
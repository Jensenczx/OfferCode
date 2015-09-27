/*
和为S的两个数字
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找
两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。 
输出描述:
对应每个测试案例，输出两个数，小的先输出。
*/
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = array.length;
        if(length<=1)
        	return result;
        int head = 0;
        int tail = length-1;
        int minProduct = 0; 
        int num1 = 0;
        int num2 = 0;
        boolean ifSearch = false;
        while(head!=tail){
        	if(array[head]+array[tail]==sum){
        		if(!ifSearch){
        			num1 = array[head];
        			num2 = array[tail];
        			minProduct = num1*num2;
        		}else{
        			if(array[head]*array[tail]<minProduct){
        				num1 = array[head];
        				num2 = array[tail];
        				minProduct = num1*num2;
        			}
        		}
        		ifSearch = true;
        		head++;
        	}else if(array[head]+array[tail]>sum){
        		tail--;
        	}else{
        		head++;
        	}
        }
        if(ifSearch){
        	result.add(num1);
        	result.add(num2);
        }
        return result;
    }

    public static void main(String[] args){
    	int[] array = {};
    	System.out.println(FindNumbersWithSum(array,5));
    }
}

/*
开始做的时候最开始的思路是双重循环遍历O(n^2)的量级来获得，然后又想到了
通过二分法来提升效率，将当前位和最后位的数据取其中点，然后对值进行判断之后
在对其进行进一步的划分来确定是否有值符合要求，但是量级还是大于O(n)的，然后
采用量级在o(n)的方法，充分利用已知条件中的，该数组是已经排好序的，通过两个
指针代表数组的头和尾，然后向中间靠拢。
*/
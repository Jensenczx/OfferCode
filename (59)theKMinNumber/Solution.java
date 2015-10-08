/*
找出数组中的最小的k个数字
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
*/
import java.util.ArrayList;
public class Solution {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> result = new ArrayList<Integer>(); 
        int length = input.length;
        if(k>length||length==0||k<=0)
        	return result;
        int temMin;
        int flag;
        for(int i=0; i<k; i++){
        	temMin = input[i];
        	flag = i;
        	for(int j=i+1; j<length; j++){
        		if(input[j]<temMin){
        			flag = j;
        			temMin = input[j];
        		}
        	}
        	if(flag!=i){
        		input[flag] = input[i];
        		input[i] = temMin;
        	}
        	result.add(temMin);

       }
       return result;
    }

    public static void main(String[]args){
    	int[]array={1,8,4,5,6,7};
    	System.out.println(GetLeastNumbers_Solution(array,3));
    }
}
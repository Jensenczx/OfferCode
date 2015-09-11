/*
题目描述

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，
输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
*/
import java.util.ArrayList;
public class Solution {

    public int minNumberInRotateArray(int [] array) {
    	if(array.length==0)
    		return 0;
    	for(int i=1;i<array.length; i++){
    		if(array[0]>array[i])
    			return array[i];
    	}
    	return array[0];
    }

    public int minNumberInRotateArray1(int []array){
    	if(array.length==0)
    		return 0;
    	int pre = 0;
    	int last = array.length-1;
    	while(last-pre>1){
    		if(array[pre+(last-pre)/2]>array[pre]){
    			pre=pre+(last-pre)/2;	 			
    		}else if(array[pre+(last-pre)/2]<array[pre]){
    				last = pre+(last-pre)/2;
    		}
    	}
    	if(array[last]>array[pre])
    		return array[pre];
    	else return array[last];
    }
    public static void main(String [] args){
    	Solution s = new Solution();
    	int [] array = {3,4,5,6,7,8,9,10,1,2};
    	System.out.println(s.minNumberInRotateArray1(array));
    }

}
/*
1.具体化法
2.第二种方法采用二分法，二分法边界值的确定
3.通过边界指针确定范围通过循环来解决问题
*/
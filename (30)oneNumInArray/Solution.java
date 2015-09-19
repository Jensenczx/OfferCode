/*
数字在排序数组中出现的次数
题目描述
统计一个数字在排序数组中出现的次数。
*/
public class Solution {
    public static int GetNumberOfK(int [] array , int k) {
    	int len = array.length;
    	int sum = 0;
    	int tem = 0;
       if(len==0)
       	return 0;
       for(int i=0; i<=len-1; i++){
       		tem = array[i];
       		while(tem!=0){
       			if(tem%10==k)
       				sum++;
       			tem = tem/10;
       		}
       }
       return sum;
    }

    public static void main(String [] args){
    	int [] array = {1,3,3,3,3,4};
    	System.out.println(GetNumberOfK(array,2));
    }
}

/*
1.确定每一个位子上的数据，通过除10取余来获得
2.向前进位通过对其除10进位
*/
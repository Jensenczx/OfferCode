/*
数组中只出现一次的数字
题目描述
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
*/
public class Solution {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    	int len = array.length;
    	int singleNum1=0;
    	int singleNum2=0;
    	if(len<=1){
    		num1[0]=singleNum1;
    		num2[0]=singleNum2;
    	}else{
    		int num = 0;
    		int sum = array[0];
    		int [] array1 = new int [len];
    		int [] array2 = new int [len];
    		for(int i=1; i<len; i++){
    			sum = sum^array[i];
    		}
    		while((sum&1)==0){
    			sum=sum>>1;
    			num++;
    		}
    		for(int j=0; j<len; j++){
    			if((array[j]&(1<<num))!=0)
    				array1[j]=array[j];
    			else array2[j]=array[j];
    		}
    		for(int k=0; k<len; k++){
    			singleNum1 = singleNum1^array1[k];
    			singleNum2 = singleNum2^array2[k];
    		}
    		num1[0]=singleNum1;
    		num2[0]=singleNum2;
    	}
    }

    
   public static void main (String [] args){
   		int [] array = {1};
   		int [] array1 = new int[1];
   		int [] array2 = new int[1];
   		FindNumsAppearOnce(array,array1,array2);
   		System.out.println(array1[0]+""+array2[0]);
   }
}
/*
二进制位运算的最大化利用，异或运算可以用来消除相同的值，最后只剩下一个单独的数字
对于有两个单独的数字的，其最终异或剩下的是一个单独的数字，然后将数字分为两组，在进行异或
运算，最终得到我们所要求的数字。
*/
/*
构建乘积数组
题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
*/
import java.util.ArrayList;
public class Solution {
	//暴力法
    public static int[] multiply1(int[] A) {
    	int length = A.length;
    	int [] B = new int [length];
    	if(length==1){
    		B[0]=0;
    		return B;
    	}
    	for(int i=0; i<length; i++){
    		int multiplyNum =1;
    		for(int j=1; j<length; j++){
    			if(j!=i)
    				multiplyNum=multiplyNum*A[j];
    		}
    		B[i]=multiplyNum;
    	}
    	return B;
    }
    //gentle
    public static int[] multiply(int[] A){
    	int length = A.length;
    	int[]B = new int [length];
    	if(length<2){
    		return B;
    	}
    	B[0] = 1;
    	for(int i=1; i<length; i++){
    		B[i] = B[i-1]*A[i-1];
    	}
    	int tem =1;
    	for(int j=length-2; j>=0; j--){
    		tem = tem*A[j+1];
    		B[j] = B[j]*tem; 
    	}
    	return B;
    } 


    public static void main(String[] args){
    	int[] array = {1,2,3,4};
    	for(int i:multiply(array))
    	System.out.println(i);
    }
}
/*
对于这个问题，首先想到的可能就是除法来计算，但是要求是不允许使用除法
因此要想到两重循环来解决问题，但是这肯定不是最好的方法，时间复杂度肯定是可以再
降低的，因此想到了最后一个方法，通过两个循环，第一个循环，从前向后，为数组
上当前位的数据赋值为其前几位数值的乘积，然后再通过一个从后向前的循环，将后面的数据做个累积
这样我们就能够得到该数据了。
*/
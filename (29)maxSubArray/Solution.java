/*
连续子数组的最大和
题目描述
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向
量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某
个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连
续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？
*/
public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array) {
    	int len = array.length;
    	int sum = 0;
    	int max = 0;
        if(array.length==0)
        	return max;
        if(array.length==1)
        	return array[0];
        max = sum = array[0];
        for(int i=1; i<len; i++){
        	if(array[i]>sum+array[i]){
        		sum = array[i];
        		if(sum>max)
        			max = sum;
        	}
        	else{
        		sum = sum+array[i];
        		if(sum>max)
        			max=sum;
        	}
        }
        return max;
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int max = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = array[i] > array[i] + sum ? array[i] : array[i] + sum;
            max = sum > max : sum ? max;
        }
        return max;
    }

    public static void main(String [] args){
    	int [] array = {1,-2,-3};
    	System.out.println(FindGreatestSumOfSubArray(array));
    }
}

/*
通过循环的形式来进行判断，当前遍历到达的位置的数字加上之前的和，使其值增大还是减小
*/